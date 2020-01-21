package typings.chromeApps.chrome.hid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.getDevices")
@js.native
object getDevices extends js.Object {
  /**
    * Enumerate connected HID devices.
    * @param options The properties to search for on target devices.
    * @param callback
    */
  def apply(options: DeviceOptions, callback: js.Function1[/* devices */ js.Array[HidDeviceInfo], Unit]): Unit = js.native
}

