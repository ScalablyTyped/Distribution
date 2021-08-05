package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  var URI: js.UndefOr[String] = js.undefined
  
  var authToken: js.UndefOr[String] = js.undefined
  
  var callTimeout: js.UndefOr[Double] = js.undefined
  
  var callback: js.UndefOr[CbCallback] = js.undefined
  
  var defaultQoS: js.UndefOr[MessagingQOS] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var logging: js.UndefOr[Boolean] = js.undefined
  
  var messagingPort: js.UndefOr[Double] = js.undefined
  
  var messagingURI: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var registerUser: js.UndefOr[Boolean] = js.undefined
  
  var systemKey: String
  
  var systemSecret: String
  
  var useUser: js.UndefOr[APIUser] = js.undefined
  
  var userToken: js.UndefOr[String] = js.undefined
}
object InitOptions {
  
  inline def apply(systemKey: String, systemSecret: String): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  extension [Self <: InitOptions](x: Self) {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setCallTimeoutUndefined: Self = StObject.set(x, "callTimeout", js.undefined)
    
    inline def setCallback(value: (/* error */ Boolean, /* response */ Resp) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDefaultQoS(value: MessagingQOS): Self = StObject.set(x, "defaultQoS", value.asInstanceOf[js.Any])
    
    inline def setDefaultQoSUndefined: Self = StObject.set(x, "defaultQoS", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMessagingPort(value: Double): Self = StObject.set(x, "messagingPort", value.asInstanceOf[js.Any])
    
    inline def setMessagingPortUndefined: Self = StObject.set(x, "messagingPort", js.undefined)
    
    inline def setMessagingURI(value: String): Self = StObject.set(x, "messagingURI", value.asInstanceOf[js.Any])
    
    inline def setMessagingURIUndefined: Self = StObject.set(x, "messagingURI", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRegisterUser(value: Boolean): Self = StObject.set(x, "registerUser", value.asInstanceOf[js.Any])
    
    inline def setRegisterUserUndefined: Self = StObject.set(x, "registerUser", js.undefined)
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
    
    inline def setUseUser(value: APIUser): Self = StObject.set(x, "useUser", value.asInstanceOf[js.Any])
    
    inline def setUseUserUndefined: Self = StObject.set(x, "useUser", js.undefined)
    
    inline def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    inline def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
  }
}
