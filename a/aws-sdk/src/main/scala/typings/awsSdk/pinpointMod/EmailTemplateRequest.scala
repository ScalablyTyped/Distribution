package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplateRequest extends js.Object {
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The message body, in HTML format, to use in email messages that are based on the message template. We recommend using HTML format for email clients that render HTML content. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the recommender model to use for the message template. Amazon Pinpoint uses this value to determine how to retrieve and process data from a recommender model when it sends messages that use the template, if the template contains message variables for recommendation data.
    */
  var RecommenderId: js.UndefOr[string] = js.native
  /**
    * The subject line, or title, to use in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[string] = js.native
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The message body, in plain text format, to use in email messages that are based on the message template. We recommend using plain text format for email clients that don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object EmailTemplateRequest {
  @scala.inline
  def apply(): EmailTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateRequest]
  }
  @scala.inline
  implicit class EmailTemplateRequestOps[Self <: EmailTemplateRequest] (val x: Self) extends AnyVal {
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
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

