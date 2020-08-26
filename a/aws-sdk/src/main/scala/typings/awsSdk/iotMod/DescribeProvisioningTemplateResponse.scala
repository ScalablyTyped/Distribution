package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningTemplateResponse extends js.Object {
  /**
    * The date when the fleet provisioning template was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The default fleet template version ID.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  /**
    * True if the fleet provisioning template is enabled, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The date when the fleet provisioning template was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * Gets information about a pre-provisioned hook.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.native
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The ARN of the fleet provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}

object DescribeProvisioningTemplateResponse {
  @scala.inline
  def apply(): DescribeProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningTemplateResponse]
  }
  @scala.inline
  implicit class DescribeProvisioningTemplateResponseOps[Self <: DescribeProvisioningTemplateResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDefaultVersionId(value: TemplateVersionId): Self = this.set("defaultVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("defaultVersionId", js.undefined)
    @scala.inline
    def setDescription(value: TemplateDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setPreProvisioningHook(value: ProvisioningHook): Self = this.set("preProvisioningHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreProvisioningHook: Self = this.set("preProvisioningHook", js.undefined)
    @scala.inline
    def setProvisioningRoleArn(value: RoleArn): Self = this.set("provisioningRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningRoleArn: Self = this.set("provisioningRoleArn", js.undefined)
    @scala.inline
    def setTemplateArn(value: TemplateArn): Self = this.set("templateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateArn: Self = this.set("templateArn", js.undefined)
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
  }
  
}

