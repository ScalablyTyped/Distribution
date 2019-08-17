package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDirectMessageConfigurationMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMMessageMod._UnmarshalledADMMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSMessageMod._UnmarshalledAPNSMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreBaiduMessageMod._UnmarshalledBaiduMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultMessageMod._UnmarshalledDefaultMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultPushNotificationMessageMod._UnmarshalledDefaultPushNotificationMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailMessageMod._UnmarshalledEmailMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMMessageMod._UnmarshalledGCMMessage
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSMSMessageMod._UnmarshalledSMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDirectMessageConfiguration extends _DirectMessageConfiguration {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  @JSName("ADMMessage")
  var ADMMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledADMMessage] = js.undefined
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  @JSName("APNSMessage")
  var APNSMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledAPNSMessage] = js.undefined
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledBaiduMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledDefaultMessage] = js.undefined
  /**
    * The default push notification message for all push channels.
    */
  @JSName("DefaultPushNotificationMessage")
  var DefaultPushNotificationMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledDefaultPushNotificationMessage] = js.undefined
  /**
    * The message to Email channels. Overrides the default message.
    */
  @JSName("EmailMessage")
  var EmailMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledEmailMessage] = js.undefined
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  @JSName("GCMMessage")
  var GCMMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledGCMMessage] = js.undefined
  /**
    * The message to SMS channels. Overrides the default message.
    */
  @JSName("SMSMessage")
  var SMSMessage__UnmarshalledDirectMessageConfiguration: js.UndefOr[_UnmarshalledSMSMessage] = js.undefined
}

object _UnmarshalledDirectMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: _UnmarshalledADMMessage = null,
    APNSMessage: _UnmarshalledAPNSMessage = null,
    BaiduMessage: _UnmarshalledBaiduMessage = null,
    DefaultMessage: _UnmarshalledDefaultMessage = null,
    DefaultPushNotificationMessage: _UnmarshalledDefaultPushNotificationMessage = null,
    EmailMessage: _UnmarshalledEmailMessage = null,
    GCMMessage: _UnmarshalledGCMMessage = null,
    SMSMessage: _UnmarshalledSMSMessage = null
  ): _UnmarshalledDirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage)
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage)
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage)
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage)
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage)
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    __obj.asInstanceOf[_UnmarshalledDirectMessageConfiguration]
  }
}

