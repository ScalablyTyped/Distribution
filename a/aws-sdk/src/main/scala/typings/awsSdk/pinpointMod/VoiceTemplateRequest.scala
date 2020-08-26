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
  def apply(): VoiceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceTemplateRequest]
  }
  @scala.inline
  implicit class VoiceTemplateRequestOps[Self <: VoiceTemplateRequest] (val x: Self) extends AnyVal {
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
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    @scala.inline
    def setDefaultSubstitutions(value: string): Self = this.set("DefaultSubstitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSubstitutions: Self = this.set("DefaultSubstitutions", js.undefined)
    @scala.inline
    def setLanguageCode(value: string): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setTemplateDescription(value: string): Self = this.set("TemplateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateDescription: Self = this.set("TemplateDescription", js.undefined)
    @scala.inline
    def setVoiceId(value: string): Self = this.set("VoiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceId: Self = this.set("VoiceId", js.undefined)
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

