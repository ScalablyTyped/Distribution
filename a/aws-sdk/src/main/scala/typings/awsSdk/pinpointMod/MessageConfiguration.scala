package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageConfiguration extends js.Object {
  
  /**
    * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. If specified, this message overrides the default message.
    */
  var ADMMessage: js.UndefOr[Message] = js.native
  
  /**
    * The message that the campaign sends through the APNs (Apple Push Notification service) channel. If specified, this message overrides the default message.
    */
  var APNSMessage: js.UndefOr[Message] = js.native
  
  /**
    * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. If specified, this message overrides the default message.
    */
  var BaiduMessage: js.UndefOr[Message] = js.native
  
  /**
    * The message that the campaign sends through a custom channel, as specified by the delivery configuration (CustomDeliveryConfiguration) settings for the campaign. If specified, this message overrides the default message. 
    */
  var CustomMessage: js.UndefOr[CampaignCustomMessage] = js.native
  
  /**
    * The default message that the campaign sends through all the channels that are configured for the campaign.
    */
  var DefaultMessage: js.UndefOr[Message] = js.native
  
  /**
    * The message that the campaign sends through the email channel. If specified, this message overrides the default message.
    */
  var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.native
  
  /**
    * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. If specified, this message overrides the default message.
    */
  var GCMMessage: js.UndefOr[Message] = js.native
  
  /**
    * The message that the campaign sends through the SMS channel. If specified, this message overrides the default message.
    */
  var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.native
}
object MessageConfiguration {
  
  @scala.inline
  def apply(): MessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageConfiguration]
  }
  
  @scala.inline
  implicit class MessageConfigurationOps[Self <: MessageConfiguration] (val x: Self) extends AnyVal {
    
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
    def setADMMessage(value: Message): Self = this.set("ADMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteADMMessage: Self = this.set("ADMMessage", js.undefined)
    
    @scala.inline
    def setAPNSMessage(value: Message): Self = this.set("APNSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPNSMessage: Self = this.set("APNSMessage", js.undefined)
    
    @scala.inline
    def setBaiduMessage(value: Message): Self = this.set("BaiduMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaiduMessage: Self = this.set("BaiduMessage", js.undefined)
    
    @scala.inline
    def setCustomMessage(value: CampaignCustomMessage): Self = this.set("CustomMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMessage: Self = this.set("CustomMessage", js.undefined)
    
    @scala.inline
    def setDefaultMessage(value: Message): Self = this.set("DefaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessage: Self = this.set("DefaultMessage", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: CampaignEmailMessage): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailMessage: Self = this.set("EmailMessage", js.undefined)
    
    @scala.inline
    def setGCMMessage(value: Message): Self = this.set("GCMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGCMMessage: Self = this.set("GCMMessage", js.undefined)
    
    @scala.inline
    def setSMSMessage(value: CampaignSmsMessage): Self = this.set("SMSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMSMessage: Self = this.set("SMSMessage", js.undefined)
  }
}
