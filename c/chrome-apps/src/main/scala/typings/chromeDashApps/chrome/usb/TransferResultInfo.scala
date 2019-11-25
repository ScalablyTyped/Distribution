package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferResultInfo extends js.Object {
  /** The data returned by an input transfer. undefined for output transfers. */
  var data: js.UndefOr[ArrayBuffer] = js.undefined
  /** A value of 0 indicates that the transfer was a success. Other values indicate failure. */
  var resultCode: js.UndefOr[integer] = js.undefined
}

object TransferResultInfo {
  @scala.inline
  def apply(data: ArrayBuffer = null, resultCode: Int | Double = null): TransferResultInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (resultCode != null) __obj.updateDynamic("resultCode")(resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferResultInfo]
  }
}

