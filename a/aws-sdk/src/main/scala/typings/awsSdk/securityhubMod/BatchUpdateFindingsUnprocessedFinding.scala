package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateFindingsUnprocessedFinding extends js.Object {
  /**
    * The code associated with the error.
    */
  var ErrorCode: NonEmptyString = js.native
  /**
    * The message associated with the error.
    */
  var ErrorMessage: NonEmptyString = js.native
  /**
    * The identifier of the finding that was not updated.
    */
  var FindingIdentifier: AwsSecurityFindingIdentifier = js.native
}

object BatchUpdateFindingsUnprocessedFinding {
  @scala.inline
  def apply(
    ErrorCode: NonEmptyString,
    ErrorMessage: NonEmptyString,
    FindingIdentifier: AwsSecurityFindingIdentifier
  ): BatchUpdateFindingsUnprocessedFinding = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], FindingIdentifier = FindingIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsUnprocessedFinding]
  }
}

