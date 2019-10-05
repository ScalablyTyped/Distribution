package typings.chromeDashApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.resetDevice")
@js.native
object resetDevice extends js.Object {
  /**
    * Tries to reset the USB device. If the reset fails, the given connection handle will be closed
    * and the USB device will appear to be disconnected then reconnected.
    * In this case **getDevices** or **findDevices** must be called again to acquire the device.
    * @param handle A connection handle to reset.
    * @param callback
    */
  def apply(handle: ConnectionHandle, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
}

