package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureInfo extends StObject {
  
  /**
    * The code of the common error. Valid values include InternalServiceException, InvalidParameterException, and any valid error code returned by the Amazon Web Services service that hosts the resource that you want to tag.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ErrorCode] = js.undefined
  
  /**
    * The message of the common error.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ErrorMessage] = js.undefined
  
  /**
    * The HTTP status code of the common error.
    */
  var StatusCode: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.StatusCode] = js.undefined
}
object FailureInfo {
  
  inline def apply(): FailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureInfo]
  }
  
  extension [Self <: FailureInfo](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
