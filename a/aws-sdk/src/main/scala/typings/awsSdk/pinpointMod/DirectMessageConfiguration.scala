package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectMessageConfiguration extends StObject {
  
  /**
    * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var ADMMessage: js.UndefOr[typings.awsSdk.pinpointMod.ADMMessage] = js.undefined
  
  /**
    * The default push notification message for the APNs (Apple Push Notification service) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var APNSMessage: js.UndefOr[typings.awsSdk.pinpointMod.APNSMessage] = js.undefined
  
  /**
    * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var BaiduMessage: js.UndefOr[typings.awsSdk.pinpointMod.BaiduMessage] = js.undefined
  
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[typings.awsSdk.pinpointMod.DefaultMessage] = js.undefined
  
  /**
    * The default push notification message for all push notification channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[typings.awsSdk.pinpointMod.DefaultPushNotificationMessage] = js.undefined
  
  /**
    * The default message for the email channel. This message overrides the default message (DefaultMessage).
    */
  var EmailMessage: js.UndefOr[typings.awsSdk.pinpointMod.EmailMessage] = js.undefined
  
  /**
    * The default push notification message for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var GCMMessage: js.UndefOr[typings.awsSdk.pinpointMod.GCMMessage] = js.undefined
  
  /**
    * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
    */
  var SMSMessage: js.UndefOr[typings.awsSdk.pinpointMod.SMSMessage] = js.undefined
  
  /**
    * The default message for the voice channel. This message overrides the default message (DefaultMessage).
    */
  var VoiceMessage: js.UndefOr[typings.awsSdk.pinpointMod.VoiceMessage] = js.undefined
}
object DirectMessageConfiguration {
  
  @scala.inline
  def apply(): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
  
  @scala.inline
  implicit class DirectMessageConfigurationMutableBuilder[Self <: DirectMessageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADMMessage(value: ADMMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
    
    @scala.inline
    def setAPNSMessage(value: APNSMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
    
    @scala.inline
    def setBaiduMessage(value: BaiduMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
    
    @scala.inline
    def setDefaultMessage(value: DefaultMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
    
    @scala.inline
    def setDefaultPushNotificationMessage(value: DefaultPushNotificationMessage): Self = StObject.set(x, "DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPushNotificationMessageUndefined: Self = StObject.set(x, "DefaultPushNotificationMessage", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: EmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    @scala.inline
    def setGCMMessage(value: GCMMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
    
    @scala.inline
    def setSMSMessage(value: SMSMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    
    @scala.inline
    def setVoiceMessage(value: VoiceMessage): Self = StObject.set(x, "VoiceMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceMessageUndefined: Self = StObject.set(x, "VoiceMessage", js.undefined)
  }
}
