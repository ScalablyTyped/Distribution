package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateFindingsUnprocessedFinding extends StObject {
  
  /**
    * The code associated with the error.
    */
  var ErrorCode: NonEmptyString
  
  /**
    * The message associated with the error.
    */
  var ErrorMessage: NonEmptyString
  
  /**
    * The identifier of the finding that was not updated.
    */
  var FindingIdentifier: AwsSecurityFindingIdentifier
}
object BatchUpdateFindingsUnprocessedFinding {
  
  inline def apply(
    ErrorCode: NonEmptyString,
    ErrorMessage: NonEmptyString,
    FindingIdentifier: AwsSecurityFindingIdentifier
  ): BatchUpdateFindingsUnprocessedFinding = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], FindingIdentifier = FindingIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsUnprocessedFinding]
  }
  
  extension [Self <: BatchUpdateFindingsUnprocessedFinding](x: Self) {
    
    inline def setErrorCode(value: NonEmptyString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setFindingIdentifier(value: AwsSecurityFindingIdentifier): Self = StObject.set(x, "FindingIdentifier", value.asInstanceOf[js.Any])
  }
}
