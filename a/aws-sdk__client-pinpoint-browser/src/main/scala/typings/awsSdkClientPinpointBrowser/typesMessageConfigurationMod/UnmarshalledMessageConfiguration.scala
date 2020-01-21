package typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod

import typings.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.UnmarshalledCampaignEmailMessage
import typings.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.UnmarshalledCampaignSmsMessage
import typings.awsSdkClientPinpointBrowser.typesMessageMod.UnmarshalledMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMessageConfiguration extends MessageConfiguration {
  /**
    * The message that the campaign delivers to ADM channels. Overrides the default message.
    */
  @JSName("ADMMessage")
  var ADMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
  /**
    * The message that the campaign delivers to APNS channels. Overrides the default message.
    */
  @JSName("APNSMessage")
  var APNSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
  /**
    * The message that the campaign delivers to Baidu channels. Overrides the default message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
  /**
    * The email message configuration.
    */
  @JSName("EmailMessage")
  var EmailMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignEmailMessage] = js.undefined
  /**
    * The message that the campaign delivers to GCM channels. Overrides the default message.
    */
  @JSName("GCMMessage")
  var GCMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.undefined
  /**
    * The SMS message configuration.
    */
  @JSName("SMSMessage")
  var SMSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignSmsMessage] = js.undefined
}

object UnmarshalledMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: UnmarshalledMessage = null,
    APNSMessage: UnmarshalledMessage = null,
    BaiduMessage: UnmarshalledMessage = null,
    DefaultMessage: UnmarshalledMessage = null,
    EmailMessage: UnmarshalledCampaignEmailMessage = null,
    GCMMessage: UnmarshalledMessage = null,
    SMSMessage: UnmarshalledCampaignSmsMessage = null
  ): UnmarshalledMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMessageConfiguration]
  }
}

