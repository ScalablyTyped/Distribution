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
  def apply(
    ADMMessage: ADMMessage = null,
    APNSMessage: APNSMessage = null,
    BaiduMessage: BaiduMessage = null,
    DefaultMessage: DefaultMessage = null,
    DefaultPushNotificationMessage: DefaultPushNotificationMessage = null,
    EmailMessage: EmailMessage = null,
    GCMMessage: GCMMessage = null,
    SMSMessage: SMSMessage = null,
    VoiceMessage: VoiceMessage = null
  ): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    if (VoiceMessage != null) __obj.updateDynamic("VoiceMessage")(VoiceMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
}

