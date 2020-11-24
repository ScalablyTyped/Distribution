package typings.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignSmsMessage extends js.Object {
  
  /**
    * The SMS text body.
    */
  var Body: js.UndefOr[String] = js.native
  
  /**
    * Is this is a transactional SMS message, otherwise a promotional message.
    */
  var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.native
  
  /**
    * Sender ID of sent message.
    */
  var SenderId: js.UndefOr[String] = js.native
}
object CampaignSmsMessage {
  
  @scala.inline
  def apply(): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSmsMessage]
  }
  
  @scala.inline
  implicit class CampaignSmsMessageOps[Self <: CampaignSmsMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = this.set("MessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("MessageType", js.undefined)
    
    @scala.inline
    def setSenderId(value: String): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderId: Self = this.set("SenderId", js.undefined)
  }
}
