package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFindingsError extends StObject {
  
  /**
    * The code of the error returned by the BatchImportFindings operation.
    */
  var ErrorCode: NonEmptyString
  
  /**
    * The message of the error returned by the BatchImportFindings operation.
    */
  var ErrorMessage: NonEmptyString
  
  /**
    * The identifier of the finding that could not be updated.
    */
  var Id: NonEmptyString
}
object ImportFindingsError {
  
  @scala.inline
  def apply(ErrorCode: NonEmptyString, ErrorMessage: NonEmptyString, Id: NonEmptyString): ImportFindingsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportFindingsError]
  }
  
  @scala.inline
  implicit class ImportFindingsErrorMutableBuilder[Self <: ImportFindingsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: NonEmptyString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
