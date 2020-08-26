package typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod

import typings.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage
import typings.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage
import typings.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage
import typings.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage
import typings.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
import typings.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage
import typings.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage
import typings.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectMessageConfiguration extends js.Object {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  var ADMMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage] = js.native
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  var APNSMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage] = js.native
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  var BaiduMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage] = js.native
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage] = js.native
  /**
    * The default push notification message for all push channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[
    typings.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
  ] = js.native
  /**
    * The message to Email channels. Overrides the default message.
    */
  var EmailMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage] = js.native
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  var GCMMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage] = js.native
  /**
    * The message to SMS channels. Overrides the default message.
    */
  var SMSMessage: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage] = js.native
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
  }
  
}

