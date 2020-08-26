package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailTemplateRequest extends js.Object {
  /**
    * The name of the template you want to retrieve.
    */
  var TemplateName: EmailTemplateName = js.native
}

object GetEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: EmailTemplateName): GetEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateRequest]
  }
  @scala.inline
  implicit class GetEmailTemplateRequestOps[Self <: GetEmailTemplateRequest] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: EmailTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
  }
  
}

