package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferResultInfo extends js.Object {
  /** The data returned by an input transfer. undefined for output transfers. */
  var data: js.UndefOr[ArrayBuffer] = js.native
  /** A value of 0 indicates that the transfer was a success. Other values indicate failure. */
  var resultCode: js.UndefOr[integer] = js.native
}

object TransferResultInfo {
  @scala.inline
  def apply(): TransferResultInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferResultInfo]
  }
  @scala.inline
  implicit class TransferResultInfoOps[Self <: TransferResultInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setResultCode(value: integer): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultCode: Self = this.set("resultCode", js.undefined)
  }
  
}

