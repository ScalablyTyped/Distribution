package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MqttContext extends js.Object {
  
  /**
    * The value of the clientId key in an MQTT authorization request.
    */
  var clientId: js.UndefOr[MqttClientId] = js.native
  
  /**
    * The value of the password key in an MQTT authorization request.
    */
  var password: js.UndefOr[MqttPassword] = js.native
  
  /**
    * The value of the username key in an MQTT authorization request.
    */
  var username: js.UndefOr[MqttUsername] = js.native
}
object MqttContext {
  
  @scala.inline
  def apply(): MqttContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MqttContext]
  }
  
  @scala.inline
  implicit class MqttContextOps[Self <: MqttContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: MqttClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setPassword(value: MqttPassword): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: MqttUsername): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
