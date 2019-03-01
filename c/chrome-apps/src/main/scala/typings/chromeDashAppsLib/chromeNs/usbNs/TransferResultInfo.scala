package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferResultInfo extends js.Object {
  /** The data returned by an input transfer. undefined for output transfers. */
  var data: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  /** A value of 0 indicates that the transfer was a success. Other values indicate failure. */
  var resultCode: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object TransferResultInfo {
  @scala.inline
  def apply(
    data: stdLib.ArrayBuffer = null,
    resultCode: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): TransferResultInfo = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(resultCode)) __obj.updateDynamic("resultCode")(resultCode)
    __obj.asInstanceOf[TransferResultInfo]
  }
}

