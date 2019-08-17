package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignEmailMessageMod._CampaignEmailMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignSmsMessageMod._CampaignSmsMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageMod._Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MessageConfiguration extends js.Object {
  /**
    * The message that the campaign delivers to ADM channels. Overrides the default message.
    */
  var ADMMessage: js.UndefOr[_Message] = js.undefined
  /**
    * The message that the campaign delivers to APNS channels. Overrides the default message.
    */
  var APNSMessage: js.UndefOr[_Message] = js.undefined
  /**
    * The message that the campaign delivers to Baidu channels. Overrides the default message.
    */
  var BaiduMessage: js.UndefOr[_Message] = js.undefined
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[_Message] = js.undefined
  /**
    * The email message configuration.
    */
  var EmailMessage: js.UndefOr[_CampaignEmailMessage] = js.undefined
  /**
    * The message that the campaign delivers to GCM channels. Overrides the default message.
    */
  var GCMMessage: js.UndefOr[_Message] = js.undefined
  /**
    * The SMS message configuration.
    */
  var SMSMessage: js.UndefOr[_CampaignSmsMessage] = js.undefined
}

object _MessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: _Message = null,
    APNSMessage: _Message = null,
    BaiduMessage: _Message = null,
    DefaultMessage: _Message = null,
    EmailMessage: _CampaignEmailMessage = null,
    GCMMessage: _Message = null,
    SMSMessage: _CampaignSmsMessage = null
  ): _MessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage)
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage)
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage)
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage)
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    __obj.asInstanceOf[_MessageConfiguration]
  }
}

