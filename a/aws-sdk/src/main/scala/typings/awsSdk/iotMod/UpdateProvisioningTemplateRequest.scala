package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisioningTemplateRequest extends StObject {
  
  /**
    * The ID of the default provisioning template version.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined
  
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Updates the pre-provisioning hook template.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined
  
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Removes pre-provisioning hook template.
    */
  var removePreProvisioningHook: js.UndefOr[RemoveHook] = js.undefined
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName
}
object UpdateProvisioningTemplateRequest {
  
  @scala.inline
  def apply(templateName: TemplateName): UpdateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateProvisioningTemplateRequestMutableBuilder[Self <: UpdateProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVersionId(value: TemplateVersionId): Self = StObject.set(x, "defaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionIdUndefined: Self = StObject.set(x, "defaultVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPreProvisioningHook(value: ProvisioningHook): Self = StObject.set(x, "preProvisioningHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreProvisioningHookUndefined: Self = StObject.set(x, "preProvisioningHook", js.undefined)
    
    @scala.inline
    def setProvisioningRoleArn(value: RoleArn): Self = StObject.set(x, "provisioningRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningRoleArnUndefined: Self = StObject.set(x, "provisioningRoleArn", js.undefined)
    
    @scala.inline
    def setRemovePreProvisioningHook(value: RemoveHook): Self = StObject.set(x, "removePreProvisioningHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePreProvisioningHookUndefined: Self = StObject.set(x, "removePreProvisioningHook", js.undefined)
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
