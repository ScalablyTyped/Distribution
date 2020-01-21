package typings.cordovaPluginDeviceMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /**
    * This plugin provides access to the device's accelerometer. The accelerometer is a motion sensor
    * that detects the change (delta) in movement relative to the current device orientation,
    * in three dimensions along the x, y, and z axis.
    */
  var accelerometer: Accelerometer
}

object Navigator {
  @scala.inline
  def apply(accelerometer: Accelerometer): Navigator = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

