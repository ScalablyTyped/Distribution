package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProvisioningTemplateRequest extends js.Object {
  
  /**
    * The ID of the default provisioning template version.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  
  /**
    * Updates the pre-provisioning hook template.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.native
  
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * Removes pre-provisioning hook template.
    */
  var removePreProvisioningHook: js.UndefOr[RemoveHook] = js.native
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}
object UpdateProvisioningTemplateRequest {
  
  @scala.inline
  def apply(templateName: TemplateName): UpdateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateProvisioningTemplateRequestOps[Self <: UpdateProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setPreProvisioningHook(value: ProvisioningHook): Self = this.set("preProvisioningHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreProvisioningHook: Self = this.set("preProvisioningHook", js.undefined)
    
    @scala.inline
    def setProvisioningRoleArn(value: RoleArn): Self = this.set("provisioningRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningRoleArn: Self = this.set("provisioningRoleArn", js.undefined)
    
    @scala.inline
    def setRemovePreProvisioningHook(value: RemoveHook): Self = this.set("removePreProvisioningHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovePreProvisioningHook: Self = this.set("removePreProvisioningHook", js.undefined)
  }
}
