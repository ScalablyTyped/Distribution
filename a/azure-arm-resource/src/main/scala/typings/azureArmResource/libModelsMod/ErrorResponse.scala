package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorResponse extends js.Object {
  /**
    * Error code.
    */
  var errorCode: js.UndefOr[String] = js.native
  /**
    * Error message indicating why the operation failed.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Http status code.
    */
  var httpStatus: js.UndefOr[String] = js.native
}

object ErrorResponse {
  @scala.inline
  def apply(): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorResponse]
  }
  @scala.inline
  implicit class ErrorResponseOps[Self <: ErrorResponse] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setHttpStatus(value: String): Self = this.set("httpStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpStatus: Self = this.set("httpStatus", js.undefined)
  }
  
}

