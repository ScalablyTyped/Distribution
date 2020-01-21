package typings.chromeApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.interruptTransfer")
@js.native
object interruptTransfer extends js.Object {
  /**
    * @description Performs an interrupt transfer on the specified device.
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

