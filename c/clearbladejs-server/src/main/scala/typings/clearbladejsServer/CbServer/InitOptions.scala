package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends StObject {
  
  var URI: js.UndefOr[String] = js.native
  
  var authToken: js.UndefOr[String] = js.native
  
  var callTimeout: js.UndefOr[Double] = js.native
  
  var callback: js.UndefOr[CbCallback] = js.native
  
  var defaultQoS: js.UndefOr[MessagingQOS] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var logging: js.UndefOr[Boolean] = js.native
  
  var messagingPort: js.UndefOr[Double] = js.native
  
  var messagingURI: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var registerUser: js.UndefOr[Boolean] = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  var useUser: js.UndefOr[APIUser] = js.native
  
  var userToken: js.UndefOr[String] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(systemKey: String, systemSecret: String): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    @scala.inline
    def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallTimeoutUndefined: Self = StObject.set(x, "callTimeout", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* error */ Boolean, /* response */ Resp) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDefaultQoS(value: MessagingQOS): Self = StObject.set(x, "defaultQoS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultQoSUndefined: Self = StObject.set(x, "defaultQoS", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMessagingPort(value: Double): Self = StObject.set(x, "messagingPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingPortUndefined: Self = StObject.set(x, "messagingPort", js.undefined)
    
    @scala.inline
    def setMessagingURI(value: String): Self = StObject.set(x, "messagingURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingURIUndefined: Self = StObject.set(x, "messagingURI", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRegisterUser(value: Boolean): Self = StObject.set(x, "registerUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterUserUndefined: Self = StObject.set(x, "registerUser", js.undefined)
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
    
    @scala.inline
    def setUseUser(value: APIUser): Self = StObject.set(x, "useUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUserUndefined: Self = StObject.set(x, "useUser", js.undefined)
    
    @scala.inline
    def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
  }
}
