package typings.chromeApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.isochronousTransfer")
@js.native
object isochronousTransfer extends js.Object {
  /**
    * @description Performs an isochronous transfer on the specific device.
    * @param handle An open connection to the device.
    * @param transferInfo
    * @param callback
    */
  def apply(
    handle: ConnectionHandle,
    transferInfo: IsochronousTransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
}

