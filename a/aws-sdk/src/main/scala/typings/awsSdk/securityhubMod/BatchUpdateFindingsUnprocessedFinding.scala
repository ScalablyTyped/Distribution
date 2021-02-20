package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateFindingsUnprocessedFinding extends StObject {
  
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
  implicit class BatchUpdateFindingsUnprocessedFindingMutableBuilder[Self <: BatchUpdateFindingsUnprocessedFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: NonEmptyString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdentifier(value: AwsSecurityFindingIdentifier): Self = StObject.set(x, "FindingIdentifier", value.asInstanceOf[js.Any])
  }
}
