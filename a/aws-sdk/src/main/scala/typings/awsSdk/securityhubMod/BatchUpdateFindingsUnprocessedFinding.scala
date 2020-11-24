package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class BatchUpdateFindingsUnprocessedFindingOps[Self <: BatchUpdateFindingsUnprocessedFinding] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: NonEmptyString): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: NonEmptyString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdentifier(value: AwsSecurityFindingIdentifier): Self = this.set("FindingIdentifier", value.asInstanceOf[js.Any])
  }
}
