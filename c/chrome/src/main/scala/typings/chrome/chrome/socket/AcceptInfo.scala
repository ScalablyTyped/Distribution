package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInfo extends js.Object {
  var resultCode: Double = js.native
  var socketId: js.UndefOr[Double] = js.native
}

object AcceptInfo {
  @scala.inline
  def apply(resultCode: Double): AcceptInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInfo]
  }
  @scala.inline
  implicit class AcceptInfoOps[Self <: AcceptInfo] (val x: Self) extends AnyVal {
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
    def setResultCode(value: Double): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketId(value: Double): Self = this.set("socketId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketId: Self = this.set("socketId", js.undefined)
  }
  
}

