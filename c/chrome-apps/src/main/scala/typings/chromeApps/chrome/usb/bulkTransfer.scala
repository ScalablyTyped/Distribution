package typings.chromeApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.bulkTransfer")
@js.native
object bulkTransfer extends js.Object {
  /**
    * @description Performs a bulk transfer on the specified device.
    * @param handle An open connection to the device.
    * @param transferInfo The transfer parameters.
    * @param callback
    */
  def apply(
    handle: ConnectionHandle,
    transferInfo: GenericTransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
}

