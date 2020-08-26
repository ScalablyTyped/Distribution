package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * A detailed error code.
    */
  var DetailedErrorCode: js.UndefOr[string] = js.native
  /**
    * A detailed error message.
    */
  var DetailedErrorMessage: js.UndefOr[string] = js.native
}

object ErrorDetail {
  @scala.inline
  def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  @scala.inline
  implicit class ErrorDetailOps[Self <: ErrorDetail] (val x: Self) extends AnyVal {
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
    def setDetailedErrorCode(value: string): Self = this.set("DetailedErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedErrorCode: Self = this.set("DetailedErrorCode", js.undefined)
    @scala.inline
    def setDetailedErrorMessage(value: string): Self = this.set("DetailedErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedErrorMessage: Self = this.set("DetailedErrorMessage", js.undefined)
  }
  
}

