package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceTemplateRequest extends js.Object {
  /**
    * The text of the script to use in messages that are based on the message template, in plain text format.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The code for the language to use when synthesizing the text of the script in messages that are based on the message template. For a list of supported languages and the code for each one, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[string] = js.native
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the voice to use when delivering messages that are based on the message template. For a list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object VoiceTemplateRequest {
  @scala.inline
  def apply(
    Body: string = null,
    DefaultSubstitutions: string = null,
    LanguageCode: string = null,
    TemplateDescription: string = null,
    VoiceId: string = null,
    tags: MapOfString = null
  ): VoiceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceTemplateRequest]
  }
}

