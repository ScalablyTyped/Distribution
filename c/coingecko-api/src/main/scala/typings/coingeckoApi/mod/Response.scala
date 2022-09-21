package typings.coingeckoApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[T] extends StObject {
  
  /**
    * The response status code
    */
  var code: Double
  
  /**
    * The body data in JSON format from the request.
    */
  var data: T
  
  /**
    * The response status message
    */
  var message: String
  
  /**
    * Whether the response status code returned a successful code (>200 && <300).
    */
  var success: Boolean
}
object Response {
  
  inline def apply[T](code: Double, data: T, message: String, success: Boolean): Response[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  extension [Self <: Response[?], T](x: Self & Response[T]) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
