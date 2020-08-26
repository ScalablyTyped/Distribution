package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateConfiguration extends js.Object {
  /**
    * The email template to use for the message.
    */
  var EmailTemplate: js.UndefOr[Template] = js.native
  /**
    * The push notification template to use for the message.
    */
  var PushTemplate: js.UndefOr[Template] = js.native
  /**
    * The SMS template to use for the message.
    */
  var SMSTemplate: js.UndefOr[Template] = js.native
  /**
    * The voice template to use for the message. This object isn't supported for campaigns.
    */
  var VoiceTemplate: js.UndefOr[Template] = js.native
}

object TemplateConfiguration {
  @scala.inline
  def apply(): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateConfiguration]
  }
  @scala.inline
  implicit class TemplateConfigurationOps[Self <: TemplateConfiguration] (val x: Self) extends AnyVal {
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
    def setEmailTemplate(value: Template): Self = this.set("EmailTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailTemplate: Self = this.set("EmailTemplate", js.undefined)
    @scala.inline
    def setPushTemplate(value: Template): Self = this.set("PushTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushTemplate: Self = this.set("PushTemplate", js.undefined)
    @scala.inline
    def setSMSTemplate(value: Template): Self = this.set("SMSTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSMSTemplate: Self = this.set("SMSTemplate", js.undefined)
    @scala.inline
    def setVoiceTemplate(value: Template): Self = this.set("VoiceTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceTemplate: Self = this.set("VoiceTemplate", js.undefined)
  }
  
}

