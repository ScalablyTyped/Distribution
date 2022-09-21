package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangesetErrorInfo extends StObject {
  
  /**
    * The category of the error.    VALIDATION – The inputs to this request are invalid.    SERVICE_QUOTA_EXCEEDED – Service quotas have been exceeded. Please contact AWS support to increase quotas.    ACCESS_DENIED – Missing required permission to perform this request.    RESOURCE_NOT_FOUND – One or more inputs to this request were not found.    THROTTLING – The system temporarily lacks sufficient resources to process the request.    INTERNAL_SERVICE_EXCEPTION – An internal service error has occurred.    CANCELLED – Cancelled.    USER_RECOVERABLE – A user recoverable error has occurred.  
    */
  var errorCategory: js.UndefOr[ErrorCategory] = js.undefined
  
  /**
    * The text of the error message.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object ChangesetErrorInfo {
  
  inline def apply(): ChangesetErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesetErrorInfo]
  }
  
  extension [Self <: ChangesetErrorInfo](x: Self) {
    
    inline def setErrorCategory(value: ErrorCategory): Self = StObject.set(x, "errorCategory", value.asInstanceOf[js.Any])
    
    inline def setErrorCategoryUndefined: Self = StObject.set(x, "errorCategory", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
