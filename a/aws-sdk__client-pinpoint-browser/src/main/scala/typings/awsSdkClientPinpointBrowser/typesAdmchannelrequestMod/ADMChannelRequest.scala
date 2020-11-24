package typings.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADMChannelRequest extends js.Object {
  
  /**
    * The Client ID that you obtained from the Amazon App Distribution Portal.
    */
  var ClientId: js.UndefOr[String] = js.native
  
  /**
    * The Client Secret that you obtained from the Amazon App Distribution Portal.
    */
  var ClientSecret: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether or not the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object ADMChannelRequest {
  
  @scala.inline
  def apply(): ADMChannelRequest = {
    val __obj = js.Dynamic.literal()
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
    def setClientId(value: String): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("ClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("ClientSecret", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
