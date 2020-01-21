package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageConfiguration extends js.Object {
  /**
    * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the default message.
    */
  var ADMMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message overrides the default message.
    */
  var APNSMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the default message.
    */
  var BaiduMessage: js.UndefOr[Message] = js.native
  /**
    * The default message that the campaign sends through all the channels that are configured for the campaign.
    */
  var DefaultMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the email channel.
    */
  var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.native
  /**
    * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default message.
    */
  var GCMMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the SMS channel.
    */
  var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.native
}

object MessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: Message = null,
    APNSMessage: Message = null,
    BaiduMessage: Message = null,
    DefaultMessage: Message = null,
    EmailMessage: CampaignEmailMessage = null,
    GCMMessage: Message = null,
    SMSMessage: CampaignSmsMessage = null
  ): MessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageConfiguration]
  }
}

