package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageConfiguration extends StObject {
  
  /**
    * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. If specified, this message overrides the default message.
    */
  var ADMMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The message that the campaign sends through the APNs (Apple Push Notification service) channel. If specified, this message overrides the default message.
    */
  var APNSMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. If specified, this message overrides the default message.
    */
  var BaiduMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The message that the campaign sends through a custom channel, as specified by the delivery configuration (CustomDeliveryConfiguration) settings for the campaign. If specified, this message overrides the default message. 
    */
  var CustomMessage: js.UndefOr[CampaignCustomMessage] = js.undefined
  
  /**
    * The default message that the campaign sends through all the channels that are configured for the campaign.
    */
  var DefaultMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The message that the campaign sends through the email channel. If specified, this message overrides the default message.
    */
  var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined
  
  /**
    * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. If specified, this message overrides the default message.
    */
  var GCMMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The message that the campaign sends through the SMS channel. If specified, this message overrides the default message.
    */
  var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
}
object MessageConfiguration {
  
  @scala.inline
  def apply(): MessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageConfiguration]
  }
  
  @scala.inline
  implicit class MessageConfigurationMutableBuilder[Self <: MessageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADMMessage(value: Message): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
    
    @scala.inline
    def setAPNSMessage(value: Message): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
    
    @scala.inline
    def setBaiduMessage(value: Message): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
    
    @scala.inline
    def setCustomMessage(value: CampaignCustomMessage): Self = StObject.set(x, "CustomMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "CustomMessage", js.undefined)
    
    @scala.inline
    def setDefaultMessage(value: Message): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: CampaignEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    @scala.inline
    def setGCMMessage(value: Message): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
    
    @scala.inline
    def setSMSMessage(value: CampaignSmsMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
  }
}
