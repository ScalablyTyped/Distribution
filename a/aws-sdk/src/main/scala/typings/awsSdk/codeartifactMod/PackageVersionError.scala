package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageVersionError extends js.Object {
  /**
    *  The error code associated with the error. Valid error codes are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var errorCode: js.UndefOr[PackageVersionErrorCode] = js.native
  /**
    *  The error message associated with the error. 
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
}

object PackageVersionError {
  @scala.inline
  def apply(): PackageVersionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionError]
  }
  @scala.inline
  implicit class PackageVersionErrorOps[Self <: PackageVersionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: PackageVersionErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
  }
  
}

