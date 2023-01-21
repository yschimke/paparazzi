package app.cash.paparazzi.plugin.test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeDown
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Stepper
import androidx.wear.compose.material.TimeSource
import androidx.wear.compose.material.TimeText

@Composable
fun VolumeScreen() {
  Scaffold(modifier = Modifier.fillMaxSize(), timeText = {
    TimeText(
      timeSource = object : TimeSource {
        override val currentTime: String
          @Composable get() = "11:02 AM"
      }
    )
  }, positionIndicator = {
      PositionIndicator(value = { 0.5f })
    }) {
    Stepper(
      value = 5,
      onValueChange = {},
      valueProgression = 1..10,
      decreaseIcon = {
        Icon(
          modifier = Modifier.size(26.dp),
          imageVector = Icons.Default.VolumeDown,
          contentDescription = "Decrease Volume"
        )
      },
      increaseIcon = {
        Icon(
          modifier = Modifier.size(26.dp),
          imageVector = Icons.Default.VolumeUp,
          contentDescription = "Increase Volume"
        )
      }
    )
  }
}
