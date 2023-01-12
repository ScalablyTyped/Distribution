package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse extends StObject {
  
  /**
    * The correlation ID to be used for tracking the source of the error.
    */
  var correlationId: js.UndefOr[String] = js.undefined
  
  /**
    * The string identifier for the error.
    */
  var error: String
  
  /**
    * An array of codes pertaining to the error(s) that occurred.
    */
  var errorCodes: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The error's description.
    */
  var errorDescription: String
  
  /**
    * The timestamp at which the error occurred.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The trace identifier for this error occurrence.
    */
  var traceId: js.UndefOr[String] = js.undefined
}
object ErrorResponse {
  
  inline def apply(error: String, errorDescription: String): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorCodes(value: js.Array[Double]): Self = StObject.set(x, "errorCodes", value.asInstanceOf[js.Any])
    
    inline def setErrorCodesUndefined: Self = StObject.set(x, "errorCodes", js.undefined)
    
    inline def setErrorCodesVarargs(value: Double*): Self = StObject.set(x, "errorCodes", js.Array(value*))
    
    inline def setErrorDescription(value: String): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    
    inline def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
  }
}
