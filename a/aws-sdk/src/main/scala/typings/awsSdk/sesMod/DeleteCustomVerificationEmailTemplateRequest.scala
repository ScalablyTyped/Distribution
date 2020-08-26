package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The name of the custom verification email template that you want to delete.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
}

object DeleteCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
  }
  @scala.inline
  implicit class DeleteCustomVerificationEmailTemplateRequestOps[Self <: DeleteCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
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
  }
  
}

