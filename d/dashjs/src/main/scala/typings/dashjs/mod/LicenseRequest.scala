package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseRequest extends StObject {
  
  var data: js.typedarray.ArrayBuffer
  
  var headers: js.Object
  
  var messageType: String
  
  var method: String
  
  var responseType: String
  
  var sessionId: String
  
  var url: String
  
  var withCredentials: Boolean
}
object LicenseRequest {
  
  inline def apply(
    data: js.typedarray.ArrayBuffer,
    headers: js.Object,
    messageType: String,
    method: String,
    responseType: String,
    sessionId: String,
    url: String,
    withCredentials: Boolean
  ): LicenseRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
  }
}
