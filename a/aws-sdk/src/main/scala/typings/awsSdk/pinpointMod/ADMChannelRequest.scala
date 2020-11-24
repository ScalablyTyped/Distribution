package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADMChannelRequest extends js.Object {
  
  /**
    * The Client ID that you received from Amazon to send messages by using ADM.
    */
  var ClientId: string = js.native
  
  /**
    * The Client Secret that you received from Amazon to send messages by using ADM.
    */
  var ClientSecret: string = js.native
  
  /**
    * Specifies whether to enable the ADM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}
object ADMChannelRequest {
  
  @scala.inline
  def apply(ClientId: string, ClientSecret: string): ADMChannelRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelRequest]
  }
  
  @scala.inline
  implicit class ADMChannelRequestOps[Self <: ADMChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: string): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: string): Self = this.set("ClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
