package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReason extends StObject {
  
  /**
    * Service Quotas returns the following error values.   DEPENDENCY_ACCESS_DENIED_ERROR is returned when the caller does not have permission to call the service or service quota. To resolve the error, you need permission to access the service or service quota.  DEPENDENCY_THROTTLING_ERROR is returned when the service being called is throttling Service Quotas.  DEPENDENCY_SERVICE_ERROR is returned when the service being called has availability issues.  SERVICE_QUOTA_NOT_AVAILABLE_ERROR is returned when there was an error in Service Quotas.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.servicequotasMod.ErrorCode] = js.undefined
  
  /**
    * The error message that provides more detail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.servicequotasMod.ErrorMessage] = js.undefined
}
object ErrorReason {
  
  @scala.inline
  def apply(): ErrorReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorReason]
  }
  
  @scala.inline
  implicit class ErrorReasonMutableBuilder[Self <: ErrorReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
