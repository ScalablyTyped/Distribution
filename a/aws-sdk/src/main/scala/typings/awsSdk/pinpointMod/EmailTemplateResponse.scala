package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The message body, in HTML format, that's used in email messages that are based on the message template.
    */
  var HtmlPart: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The unique identifier for the recommender model that's used by the message template.
    */
  var RecommenderId: js.UndefOr[string] = js.native
  /**
    * The subject line, or title, that's used in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[string] = js.native
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: string = js.native
  /**
    * The type of channel that the message template is designed for. For an email template, this value is EMAIL.
    */
  var TemplateType: typings.awsSdk.pinpointMod.TemplateType = js.native
  /**
    * The message body, in plain text format, that's used in email messages that are based on the message template.
    */
  var TextPart: js.UndefOr[string] = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object EmailTemplateResponse {
  @scala.inline
  def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): EmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplateResponse]
  }
  @scala.inline
  implicit class EmailTemplateResponseOps[Self <: EmailTemplateResponse] (val x: Self) extends AnyVal {
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
    def setHtmlPart(value: string): Self = this.set("HtmlPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlPart: Self = this.set("HtmlPart", js.undefined)
    @scala.inline
    def setRecommenderId(value: string): Self = this.set("RecommenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommenderId: Self = this.set("RecommenderId", js.undefined)
    @scala.inline
    def setSubject(value: string): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    @scala.inline
    def setTemplateDescription(value: string): Self = this.set("TemplateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateDescription: Self = this.set("TemplateDescription", js.undefined)
    @scala.inline
    def setTextPart(value: string): Self = this.set("TextPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPart: Self = this.set("TextPart", js.undefined)
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

