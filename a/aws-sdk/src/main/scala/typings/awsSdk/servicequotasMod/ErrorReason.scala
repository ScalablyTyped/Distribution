package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReason extends StObject {
  
  /**
    * Service Quotas returns the following error values:    DEPENDENCY_ACCESS_DENIED_ERROR - The caller does not have the required permissions to complete the action. To resolve the error, you must have permission to access the service or quota.    DEPENDENCY_THROTTLING_ERROR - The service is throttling Service Quotas.    DEPENDENCY_SERVICE_ERROR - The service is not available.    SERVICE_QUOTA_NOT_AVAILABLE_ERROR - There was an error in Service Quotas.  
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.servicequotasMod.ErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.servicequotasMod.ErrorMessage] = js.undefined
}
object ErrorReason {
  
  inline def apply(): ErrorReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorReason]
  }
  
  extension [Self <: ErrorReason](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
