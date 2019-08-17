package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDirectMessageConfigurationMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMMessageMod._ADMMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSMessageMod._APNSMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreBaiduMessageMod._BaiduMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultMessageMod._DefaultMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultPushNotificationMessageMod._DefaultPushNotificationMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailMessageMod._EmailMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMMessageMod._GCMMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSMSMessageMod._SMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DirectMessageConfiguration extends js.Object {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  var ADMMessage: js.UndefOr[_ADMMessage] = js.undefined
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  var APNSMessage: js.UndefOr[_APNSMessage] = js.undefined
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  var BaiduMessage: js.UndefOr[_BaiduMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[_DefaultMessage] = js.undefined
  /**
    * The default push notification message for all push channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[_DefaultPushNotificationMessage] = js.undefined
  /**
    * The message to Email channels. Overrides the default message.
    */
  var EmailMessage: js.UndefOr[_EmailMessage] = js.undefined
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  var GCMMessage: js.UndefOr[_GCMMessage] = js.undefined
  /**
    * The message to SMS channels. Overrides the default message.
    */
  var SMSMessage: js.UndefOr[_SMSMessage] = js.undefined
}

object _DirectMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: _ADMMessage = null,
    APNSMessage: _APNSMessage = null,
    BaiduMessage: _BaiduMessage = null,
    DefaultMessage: _DefaultMessage = null,
    DefaultPushNotificationMessage: _DefaultPushNotificationMessage = null,
    EmailMessage: _EmailMessage = null,
    GCMMessage: _GCMMessage = null,
    SMSMessage: _SMSMessage = null
  ): _DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage)
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage)
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage)
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage)
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage)
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    __obj.asInstanceOf[_DirectMessageConfiguration]
  }
}

