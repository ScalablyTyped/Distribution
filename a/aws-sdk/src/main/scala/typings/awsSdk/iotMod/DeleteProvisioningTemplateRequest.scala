package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProvisioningTemplateRequest extends js.Object {
  /**
    * The name of the fleet provision template to delete.
    */
  var templateName: TemplateName = js.native
}

object DeleteProvisioningTemplateRequest {
  @scala.inline
  def apply(templateName: TemplateName): DeleteProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisioningTemplateRequest]
  }
  @scala.inline
  implicit class DeleteProvisioningTemplateRequestOps[Self <: DeleteProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("templateName", value.asInstanceOf[js.Any])
  }
  
}

