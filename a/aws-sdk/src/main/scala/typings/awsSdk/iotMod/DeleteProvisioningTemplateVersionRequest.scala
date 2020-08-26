package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProvisioningTemplateVersionRequest extends js.Object {
  /**
    * The name of the fleet provisioning template version to delete.
    */
  var templateName: TemplateName = js.native
  /**
    * The fleet provisioning template version ID to delete.
    */
  var versionId: TemplateVersionId = js.native
}

object DeleteProvisioningTemplateVersionRequest {
  @scala.inline
  def apply(templateName: TemplateName, versionId: TemplateVersionId): DeleteProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisioningTemplateVersionRequest]
  }
  @scala.inline
  implicit class DeleteProvisioningTemplateVersionRequestOps[Self <: DeleteProvisioningTemplateVersionRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setVersionId(value: TemplateVersionId): Self = this.set("versionId", value.asInstanceOf[js.Any])
  }
  
}

