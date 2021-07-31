package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var body: Dictionary[String | js.Object]
  
  var headers: Dictionary[String]
  
  var isSuccessful: Boolean
  
  var md5: js.UndefOr[String] = js.undefined
  
  var statusCode: Double
}
object Response {
  
  @scala.inline
  def apply(
    body: Dictionary[String | js.Object],
    headers: Dictionary[String],
    isSuccessful: Boolean,
    statusCode: Double
  ): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Dictionary[String | js.Object]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Dictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
