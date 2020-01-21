package typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod

import typings.awsSdkClientPinpointBrowser.typesAdmmessageMod.UnmarshalledADMMessage
import typings.awsSdkClientPinpointBrowser.typesApnsmessageMod.UnmarshalledAPNSMessage
import typings.awsSdkClientPinpointBrowser.typesBaiduMessageMod.UnmarshalledBaiduMessage
import typings.awsSdkClientPinpointBrowser.typesDefaultMessageMod.UnmarshalledDefaultMessage
import typings.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.UnmarshalledDefaultPushNotificationMessage
import typings.awsSdkClientPinpointBrowser.typesEmailMessageMod.UnmarshalledEmailMessage
import typings.awsSdkClientPinpointBrowser.typesGcmmessageMod.UnmarshalledGCMMessage
import typings.awsSdkClientPinpointBrowser.typesSmsmessageMod.UnmarshalledSMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDirectMessageConfiguration extends DirectMessageConfiguration {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  @JSName("ADMMessage")
  var ADMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledADMMessage] = js.undefined
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  @JSName("APNSMessage")
  var APNSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledAPNSMessage] = js.undefined
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledBaiduMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultMessage] = js.undefined
  /**
    * The default push notification message for all push channels.
    */
  @JSName("DefaultPushNotificationMessage")
  var DefaultPushNotificationMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultPushNotificationMessage] = js.undefined
  /**
    * The message to Email channels. Overrides the default message.
    */
  @JSName("EmailMessage")
  var EmailMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledEmailMessage] = js.undefined
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  @JSName("GCMMessage")
  var GCMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledGCMMessage] = js.undefined
  /**
    * The message to SMS channels. Overrides the default message.
    */
  @JSName("SMSMessage")
  var SMSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledSMSMessage] = js.undefined
}

object UnmarshalledDirectMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: UnmarshalledADMMessage = null,
    APNSMessage: UnmarshalledAPNSMessage = null,
    BaiduMessage: UnmarshalledBaiduMessage = null,
    DefaultMessage: UnmarshalledDefaultMessage = null,
    DefaultPushNotificationMessage: UnmarshalledDefaultPushNotificationMessage = null,
    EmailMessage: UnmarshalledEmailMessage = null,
    GCMMessage: UnmarshalledGCMMessage = null,
    SMSMessage: UnmarshalledSMSMessage = null
  ): UnmarshalledDirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDirectMessageConfiguration]
  }
}

