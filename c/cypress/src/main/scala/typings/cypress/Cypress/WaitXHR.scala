package typings.cypress.Cypress

import typings.cypress.anon.Body
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitXHR extends StObject {
  
  var duration: Double
  
  var id: String
  
  var method: HttpMethod
  
  var request: Body
  
  var requestBody: String | ObjectLike
  
  var requestHeaders: ObjectLike
  
  var response: Body
  
  var responseBody: String | ObjectLike
  
  var responseHeaders: ObjectLike
  
  var status: Double
  
  var statusMessage: String
  
  var url: String
  
  var xhr: XMLHttpRequest
}
object WaitXHR {
  
  inline def apply(
    duration: Double,
    id: String,
    method: HttpMethod,
    request: Body,
    requestBody: String | ObjectLike,
    requestHeaders: ObjectLike,
    response: Body,
    responseBody: String | ObjectLike,
    responseHeaders: ObjectLike,
    status: Double,
    statusMessage: String,
    url: String,
    xhr: XMLHttpRequest
  ): WaitXHR = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseBody = responseBody.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitXHR]
  }
  
  extension [Self <: WaitXHR](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Body): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: String | ObjectLike): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaders(value: ObjectLike): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Body): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseBody(value: String | ObjectLike): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: ObjectLike): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
