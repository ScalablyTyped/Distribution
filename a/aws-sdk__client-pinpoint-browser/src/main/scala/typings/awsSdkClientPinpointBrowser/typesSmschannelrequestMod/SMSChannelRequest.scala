package typings.awsSdkClientPinpointBrowser.typesSmschannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMSChannelRequest extends js.Object {
  
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Sender identifier of your messages.
    */
  var SenderId: js.UndefOr[String] = js.native
  
  /**
    * ShortCode registered with phone provider.
    */
  var ShortCode: js.UndefOr[String] = js.native
}
object SMSChannelRequest {
  
  @scala.inline
  def apply(): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSChannelRequest]
  }
  
  @scala.inline
  implicit class SMSChannelRequestOps[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setSenderId(value: String): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderId: Self = this.set("SenderId", js.undefined)
    
    @scala.inline
    def setShortCode(value: String): Self = this.set("ShortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortCode: Self = this.set("ShortCode", js.undefined)
  }
}
