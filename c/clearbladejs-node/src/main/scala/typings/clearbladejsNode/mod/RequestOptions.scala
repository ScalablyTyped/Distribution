package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  var URI: js.UndefOr[String] = js.undefined
  
  var authToken: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var endpoint: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var qs: js.UndefOr[String] = js.undefined
  
  var systemKey: String
  
  var systemSecret: String
  
  var useUser: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[APIUser] = js.undefined
}
object RequestOptions {
  
  inline def apply(systemKey: String, systemSecret: String): RequestOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQs(value: String): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
    
    inline def setUseUser(value: Boolean): Self = StObject.set(x, "useUser", value.asInstanceOf[js.Any])
    
    inline def setUseUserUndefined: Self = StObject.set(x, "useUser", js.undefined)
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
