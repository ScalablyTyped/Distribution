package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectMessageConfiguration extends js.Object {
  /**
    * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var ADMMessage: js.UndefOr[typings.awsSdk.pinpointMod.ADMMessage] = js.native
  /**
    * The default push notification message for the APNs (Apple Push Notification service) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var APNSMessage: js.UndefOr[typings.awsSdk.pinpointMod.APNSMessage] = js.native
  /**
    * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var BaiduMessage: js.UndefOr[typings.awsSdk.pinpointMod.BaiduMessage] = js.native
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[typings.awsSdk.pinpointMod.DefaultMessage] = js.native
  /**
    * The default push notification message for all push notification channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[typings.awsSdk.pinpointMod.DefaultPushNotificationMessage] = js.native
  /**
    * The default message for the email channel. This message overrides the default message (DefaultMessage).
    */
  var EmailMessage: js.UndefOr[typings.awsSdk.pinpointMod.EmailMessage] = js.native
  /**
    * The default push notification message for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var GCMMessage: js.UndefOr[typings.awsSdk.pinpointMod.GCMMessage] = js.native
  /**
    * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
    */
  var SMSMessage: js.UndefOr[typings.awsSdk.pinpointMod.SMSMessage] = js.native
  /**
    * The default message for the voice channel. This message overrides the default message (DefaultMessage).
    */
  var VoiceMessage: js.UndefOr[typings.awsSdk.pinpointMod.VoiceMessage] = js.native
}

object DirectMessageConfiguration {
  @scala.inline
  def apply(): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
  @scala.inline
  implicit class DirectMessageConfigurationOps[Self <: DirectMessageConfiguration] (val x: Self) extends AnyVal {
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
    def setADMMessage(value: ADMMessage): Self = this.set("ADMMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteADMMessage: Self = this.set("ADMMessage", js.undefined)
    @scala.inline
    def setAPNSMessage(value: APNSMessage): Self = this.set("APNSMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAPNSMessage: Self = this.set("APNSMessage", js.undefined)
    @scala.inline
    def setBaiduMessage(value: BaiduMessage): Self = this.set("BaiduMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaiduMessage: Self = this.set("BaiduMessage", js.undefined)
    @scala.inline
    def setDefaultMessage(value: DefaultMessage): Self = this.set("DefaultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessage: Self = this.set("DefaultMessage", js.undefined)
    @scala.inline
    def setDefaultPushNotificationMessage(value: DefaultPushNotificationMessage): Self = this.set("DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPushNotificationMessage: Self = this.set("DefaultPushNotificationMessage", js.undefined)
    @scala.inline
    def setEmailMessage(value: EmailMessage): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("EmailMessage", js.undefined)
    @scala.inline
    def setGCMMessage(value: GCMMessage): Self = this.set("GCMMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGCMMessage: Self = this.set("GCMMessage", js.undefined)
    @scala.inline
    def setSMSMessage(value: SMSMessage): Self = this.set("SMSMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSMSMessage: Self = this.set("SMSMessage", js.undefined)
    @scala.inline
    def setVoiceMessage(value: VoiceMessage): Self = this.set("VoiceMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceMessage: Self = this.set("VoiceMessage", js.undefined)
  }
  
}

