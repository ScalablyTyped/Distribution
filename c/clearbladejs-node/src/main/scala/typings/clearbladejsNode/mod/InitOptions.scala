package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends js.Object {
  
  var URI: js.UndefOr[String] = js.native
  
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
}
object InitOptions {
  
  @scala.inline
  def apply(systemKey: String, systemSecret: String): InitOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURI: Self = this.set("URI", js.undefined)
    
    @scala.inline
    def setCallTimeout(value: Double): Self = this.set("callTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallTimeout: Self = this.set("callTimeout", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* error */ Boolean, /* response */ Resp) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDefaultQoS(value: MessagingQOS): Self = this.set("defaultQoS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultQoS: Self = this.set("defaultQoS", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMessagingPort(value: Double): Self = this.set("messagingPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagingPort: Self = this.set("messagingPort", js.undefined)
    
    @scala.inline
    def setMessagingURI(value: String): Self = this.set("messagingURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagingURI: Self = this.set("messagingURI", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRegisterUser(value: Boolean): Self = this.set("registerUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterUser: Self = this.set("registerUser", js.undefined)
    
    @scala.inline
    def setUseUser(value: APIUser): Self = this.set("useUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUser: Self = this.set("useUser", js.undefined)
  }
}
