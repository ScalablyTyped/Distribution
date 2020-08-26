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

@js.native
trait UnmarshalledDirectMessageConfiguration extends DirectMessageConfiguration {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  @JSName("ADMMessage")
  var ADMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledADMMessage] = js.native
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  @JSName("APNSMessage")
  var APNSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledAPNSMessage] = js.native
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledBaiduMessage] = js.native
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultMessage] = js.native
  /**
    * The default push notification message for all push channels.
    */
  @JSName("DefaultPushNotificationMessage")
  var DefaultPushNotificationMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultPushNotificationMessage] = js.native
  /**
    * The message to Email channels. Overrides the default message.
    */
  @JSName("EmailMessage")
  var EmailMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledEmailMessage] = js.native
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  @JSName("GCMMessage")
  var GCMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledGCMMessage] = js.native
  /**
    * The message to SMS channels. Overrides the default message.
    */
  @JSName("SMSMessage")
  var SMSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledSMSMessage] = js.native
}

object UnmarshalledDirectMessageConfiguration {
  @scala.inline
  def apply(): UnmarshalledDirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledDirectMessageConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledDirectMessageConfigurationOps[Self <: UnmarshalledDirectMessageConfiguration] (val x: Self) extends AnyVal {
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
    def setADMMessage(value: UnmarshalledADMMessage): Self = this.set("ADMMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteADMMessage: Self = this.set("ADMMessage", js.undefined)
    @scala.inline
    def setAPNSMessage(value: UnmarshalledAPNSMessage): Self = this.set("APNSMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAPNSMessage: Self = this.set("APNSMessage", js.undefined)
    @scala.inline
    def setBaiduMessage(value: UnmarshalledBaiduMessage): Self = this.set("BaiduMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaiduMessage: Self = this.set("BaiduMessage", js.undefined)
    @scala.inline
    def setDefaultMessage(value: UnmarshalledDefaultMessage): Self = this.set("DefaultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessage: Self = this.set("DefaultMessage", js.undefined)
    @scala.inline
    def setDefaultPushNotificationMessage(value: UnmarshalledDefaultPushNotificationMessage): Self = this.set("DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPushNotificationMessage: Self = this.set("DefaultPushNotificationMessage", js.undefined)
    @scala.inline
    def setEmailMessage(value: UnmarshalledEmailMessage): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("EmailMessage", js.undefined)
    @scala.inline
    def setGCMMessage(value: UnmarshalledGCMMessage): Self = this.set("GCMMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGCMMessage: Self = this.set("GCMMessage", js.undefined)
    @scala.inline
    def setSMSMessage(value: UnmarshalledSMSMessage): Self = this.set("SMSMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSMSMessage: Self = this.set("SMSMessage", js.undefined)
  }
  
}

