package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptingCompleteResult extends StObject {
  
  var canceled: Boolean
  
  var errorDetails: String
  
  var errorMessage: String
  
  var hasError: Boolean
  
  var operationId: String
  
  var success: Boolean
}
object ScriptingCompleteResult {
  
  inline def apply(
    canceled: Boolean,
    errorDetails: String,
    errorMessage: String,
    hasError: Boolean,
    operationId: String,
    success: Boolean
  ): ScriptingCompleteResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], errorDetails = errorDetails.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingCompleteResult]
  }
  
  extension [Self <: ScriptingCompleteResult](x: Self) {
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
