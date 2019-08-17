package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignEmailMessageMod._UnmarshalledCampaignEmailMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignSmsMessageMod._UnmarshalledCampaignSmsMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageMod._UnmarshalledMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMessageConfiguration extends _MessageConfiguration {
  /**
    * The message that the campaign delivers to ADM channels. Overrides the default message.
    */
  @JSName("ADMMessage")
  var ADMMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The message that the campaign delivers to APNS channels. Overrides the default message.
    */
  @JSName("APNSMessage")
  var APNSMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The message that the campaign delivers to Baidu channels. Overrides the default message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The email message configuration.
    */
  @JSName("EmailMessage")
  var EmailMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledCampaignEmailMessage] = js.undefined
  /**
    * The message that the campaign delivers to GCM channels. Overrides the default message.
    */
  @JSName("GCMMessage")
  var GCMMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The SMS message configuration.
    */
  @JSName("SMSMessage")
  var SMSMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledCampaignSmsMessage] = js.undefined
}

object _UnmarshalledMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: _UnmarshalledMessage = null,
    APNSMessage: _UnmarshalledMessage = null,
    BaiduMessage: _UnmarshalledMessage = null,
    DefaultMessage: _UnmarshalledMessage = null,
    EmailMessage: _UnmarshalledCampaignEmailMessage = null,
    GCMMessage: _UnmarshalledMessage = null,
    SMSMessage: _UnmarshalledCampaignSmsMessage = null
  ): _UnmarshalledMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage)
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage)
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage)
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage)
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    __obj.asInstanceOf[_UnmarshalledMessageConfiguration]
  }
}

