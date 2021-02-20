package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageVersionError extends StObject {
  
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
  implicit class PackageVersionErrorMutableBuilder[Self <: PackageVersionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: PackageVersionErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
