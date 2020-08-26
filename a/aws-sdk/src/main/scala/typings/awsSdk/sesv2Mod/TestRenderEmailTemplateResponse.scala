package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRenderEmailTemplateResponse extends js.Object {
  /**
    * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified in the TemplateName parameter.
    */
  var RenderedTemplate: RenderedEmailTemplate = js.native
}

object TestRenderEmailTemplateResponse {
  @scala.inline
  def apply(RenderedTemplate: RenderedEmailTemplate): TestRenderEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(RenderedTemplate = RenderedTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderEmailTemplateResponse]
  }
  @scala.inline
  implicit class TestRenderEmailTemplateResponseOps[Self <: TestRenderEmailTemplateResponse] (val x: Self) extends AnyVal {
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
    def setRenderedTemplate(value: RenderedEmailTemplate): Self = this.set("RenderedTemplate", value.asInstanceOf[js.Any])
  }
  
}

