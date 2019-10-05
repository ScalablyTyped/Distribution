package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.claimInterface")
@js.native
object claimInterface extends js.Object {
  /**
    * Claims an interface on a USB device.
    * Before data can be transfered to an interface or associated endpoints the interface must be claimed.
    * Only one connection handle can claim an interface at any given time.
    * If the interface is already claimed, this call will fail.
    *
    * **releaseInterface** should be called when the interface is no longer needed.
    * @param handle An open connection to the device.
    * @param interfaceNumber The interface to be claimed.
    * @param callback
    */
  def apply(handle: ConnectionHandle, interfaceNumber: integer, callback: js.Function0[Unit]): Unit = js.native
}

