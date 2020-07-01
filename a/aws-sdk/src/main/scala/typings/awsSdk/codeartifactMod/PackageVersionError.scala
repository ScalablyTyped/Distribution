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
  def apply(errorCode: PackageVersionErrorCode = null, errorMessage: ErrorMessage = null): PackageVersionError = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionError]
  }
}

