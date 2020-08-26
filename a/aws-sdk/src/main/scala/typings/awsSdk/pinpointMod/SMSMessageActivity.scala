package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSMessageActivity extends js.Object {
  /**
    * Specifies the sender ID and message type for an SMS message that's sent to participants in a journey.
    */
  var MessageConfig: js.UndefOr[JourneySMSMessage] = js.native
  /**
    * The unique identifier for the next activity to perform, after the message is sent.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The name of the SMS message template to use for the message. If specified, this value must match the name of an existing message template.
    */
  var TemplateName: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the version of the SMS template to use for the message. If specified, this value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource. If you don't specify a value for this property, Amazon Pinpoint uses the active version of the template. The active version is typically the version of a template that's been most recently reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a template.
    */
  var TemplateVersion: js.UndefOr[string] = js.native
}

object SMSMessageActivity {
  @scala.inline
  def apply(): SMSMessageActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSMessageActivity]
  }
  @scala.inline
  implicit class SMSMessageActivityOps[Self <: SMSMessageActivity] (val x: Self) extends AnyVal {
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
    def setMessageConfig(value: JourneySMSMessage): Self = this.set("MessageConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageConfig: Self = this.set("MessageConfig", js.undefined)
    @scala.inline
    def setNextActivity(value: string): Self = this.set("NextActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextActivity: Self = this.set("NextActivity", js.undefined)
    @scala.inline
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    @scala.inline
    def setTemplateVersion(value: string): Self = this.set("TemplateVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateVersion: Self = this.set("TemplateVersion", js.undefined)
  }
  
}

