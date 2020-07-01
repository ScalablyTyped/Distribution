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
  def apply(
    MessageConfig: JourneySMSMessage = null,
    NextActivity: string = null,
    TemplateName: string = null,
    TemplateVersion: string = null
  ): SMSMessageActivity = {
    val __obj = js.Dynamic.literal()
    if (MessageConfig != null) __obj.updateDynamic("MessageConfig")(MessageConfig.asInstanceOf[js.Any])
    if (NextActivity != null) __obj.updateDynamic("NextActivity")(NextActivity.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (TemplateVersion != null) __obj.updateDynamic("TemplateVersion")(TemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSMessageActivity]
  }
}

