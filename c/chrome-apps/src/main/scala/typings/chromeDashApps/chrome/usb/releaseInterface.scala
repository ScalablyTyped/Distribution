package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.releaseInterface")
@js.native
object releaseInterface extends js.Object {
  /**
    * @description Releases a claimed interface.
    * @param handle An open connection to the device.
    * @param interfaceNumber The interface to be released.
    * @param callback
    */
  def apply(handle: ConnectionHandle, interfaceNumber: integer, callback: js.Function0[Unit]): Unit = js.native
}

