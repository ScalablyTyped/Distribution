package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportFindingsError extends js.Object {
  /**
    * The code of the error returned by the BatchImportFindings operation.
    */
  var ErrorCode: NonEmptyString = js.native
  /**
    * The message of the error returned by the BatchImportFindings operation.
    */
  var ErrorMessage: NonEmptyString = js.native
  /**
    * The identifier of the finding that could not be updated.
    */
  var Id: NonEmptyString = js.native
}

object ImportFindingsError {
  @scala.inline
  def apply(ErrorCode: NonEmptyString, ErrorMessage: NonEmptyString, Id: NonEmptyString): ImportFindingsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportFindingsError]
  }
}

