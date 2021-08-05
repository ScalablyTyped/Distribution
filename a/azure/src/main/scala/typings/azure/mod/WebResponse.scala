package typings.azure.mod

import typings.azure.anon.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebResponse extends StObject {
  
  var body: Entry
  
  var headers: js.Any
  
  var isSuccessful: Boolean
  
  var md5: js.Any
  
  var statusCode: Double
}
object WebResponse {
  
  inline def apply(body: Entry, headers: js.Any, isSuccessful: Boolean, md5: js.Any, statusCode: Double): WebResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponse]
  }
  
  extension [Self <: WebResponse](x: Self) {
    
    inline def setBody(value: Entry): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    
    inline def setMd5(value: js.Any): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
