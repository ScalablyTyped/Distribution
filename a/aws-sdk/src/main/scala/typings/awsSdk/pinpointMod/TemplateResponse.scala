package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template. This value isn't included in a TemplateResponse object. To retrieve the ARN of a template, use the GetEmailTemplate, GetPushTemplate, GetSmsTemplate, or GetVoiceTemplate operation, depending on the type of template that you want to retrieve the ARN for.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object isn't included in a TemplateResponse object. To retrieve this object for a template, use the GetEmailTemplate, GetPushTemplate, GetSmsTemplate, or GetVoiceTemplate operation, depending on the type of template that you want to retrieve the object for.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The custom description of the message template. This value isn't included in a TemplateResponse object. To retrieve the description of a template, use the GetEmailTemplate, GetPushTemplate, GetSmsTemplate, or GetVoiceTemplate operation, depending on the type of template that you want to retrieve the description for.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: string = js.native
  /**
    * The type of channel that the message template is designed for. Possible values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: typings.awsSdk.pinpointMod.TemplateType = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template.
    */
  var Version: js.UndefOr[string] = js.native
  /**
    * A map of key-value pairs that identifies the tags that are associated with the message template. This object isn't included in a TemplateResponse object. To retrieve this object for a template, use the GetEmailTemplate, GetPushTemplate, GetSmsTemplate, or GetVoiceTemplate operation, depending on the type of template that you want to retrieve the object for.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object TemplateResponse {
  @scala.inline
  def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): TemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateResponse]
  }
  @scala.inline
  implicit class TemplateResponseOps[Self <: TemplateResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateType(value: TemplateType): Self = this.set("TemplateType", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setDefaultSubstitutions(value: string): Self = this.set("DefaultSubstitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSubstitutions: Self = this.set("DefaultSubstitutions", js.undefined)
    @scala.inline
    def setTemplateDescription(value: string): Self = this.set("TemplateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateDescription: Self = this.set("TemplateDescription", js.undefined)
    @scala.inline
    def setVersion(value: string): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

