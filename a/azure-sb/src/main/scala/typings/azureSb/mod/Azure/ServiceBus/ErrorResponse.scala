package typings.azureSb.mod.Azure.ServiceBus

import typings.azureSb.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_ErrorResponse: Error
}
object ErrorResponse {
  
  inline def apply(body: Error, headers: Dictionary[String], isSuccessful: Boolean, statusCode: Double): ErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  extension [Self <: ErrorResponse](x: Self) {
    
    inline def setBody(value: Error): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
