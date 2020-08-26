package typings.cordovaPluginDeviceOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /** 
    * This plugin provides access to the device's compass. The compass is a sensor that detects
    * the direction or heading that the device is pointed, typically from the top of the device.
    * It measures the heading in degrees from 0 to 359.99, where 0 is north.
    */
  var compass: Compass = js.native
}

object Navigator {
  @scala.inline
  def apply(compass: Compass): Navigator = {
    val __obj = js.Dynamic.literal(compass = compass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompass(value: Compass): Self = this.set("compass", value.asInstanceOf[js.Any])
  }
  
}

