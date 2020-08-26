package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * The HTML body of the email.
    */
  var HtmlPart: js.UndefOr[typings.awsSdk.sesMod.HtmlPart] = js.native
  /**
    * The subject line of the email.
    */
  var SubjectPart: js.UndefOr[typings.awsSdk.sesMod.SubjectPart] = js.native
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var TextPart: js.UndefOr[typings.awsSdk.sesMod.TextPart] = js.native
}

object Template {
  @scala.inline
  def apply(TemplateName: TemplateName): Template = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: TemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlPart(value: HtmlPart): Self = this.set("HtmlPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlPart: Self = this.set("HtmlPart", js.undefined)
    @scala.inline
    def setSubjectPart(value: SubjectPart): Self = this.set("SubjectPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectPart: Self = this.set("SubjectPart", js.undefined)
    @scala.inline
    def setTextPart(value: TextPart): Self = this.set("TextPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPart: Self = this.set("TextPart", js.undefined)
  }
  
}

