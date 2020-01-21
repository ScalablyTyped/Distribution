package typings.chromeApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.openDevice")
@js.native
object openDevice extends js.Object {
  /**
    * Opens a USB device returned by *getDevices*
    * @since Chrome 31.
    * @param device The device to open.
    * @param callback
    */
  def apply(device: Device, callback: js.Function1[/* handle */ ConnectionHandle, Unit]): Unit = js.native
}

