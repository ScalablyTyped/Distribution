package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRenderEmailTemplateRequest extends js.Object {
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: EmailTemplateData = js.native
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: EmailTemplateName = js.native
}

object TestRenderEmailTemplateRequest {
  @scala.inline
  def apply(TemplateData: EmailTemplateData, TemplateName: EmailTemplateName): TestRenderEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderEmailTemplateRequest]
  }
  @scala.inline
  implicit class TestRenderEmailTemplateRequestOps[Self <: TestRenderEmailTemplateRequest] (val x: Self) extends AnyVal {
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
    def setTemplateData(value: EmailTemplateData): Self = this.set("TemplateData", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
  }
  
}

