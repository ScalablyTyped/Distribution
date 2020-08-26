package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * The error code that identifies the type of error.
    */
  var ErrorCode: js.UndefOr[StringValue] = js.native
  /**
    * The message for the error.
    */
  var ErrorMessage: js.UndefOr[StringValue] = js.native
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
    def setErrorCode(value: StringValue): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: StringValue): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
  }
  
}

