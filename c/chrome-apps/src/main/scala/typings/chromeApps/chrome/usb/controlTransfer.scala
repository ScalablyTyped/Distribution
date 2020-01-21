package typings.chromeApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.controlTransfer")
@js.native
object controlTransfer extends js.Object {
  /**
    * Performs a control transfer on the specified device.
    * Control transfers refer to either the device, an interface or an endpoint.
    * Transfers to an interface or endpoint require the interface to be claimed.
    * @param handle An open connection to the device.
    * @param transferInfo Transfer info
    * @param callback
    */
  def apply(
    handle: ConnectionHandle,
    transferInfo: TransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
}

