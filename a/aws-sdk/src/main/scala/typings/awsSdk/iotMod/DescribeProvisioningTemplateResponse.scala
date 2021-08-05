package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningTemplateResponse extends StObject {
  
  /**
    * The date when the fleet provisioning template was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The default fleet template version ID.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined
  
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * True if the fleet provisioning template is enabled, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The date when the fleet provisioning template was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * Gets information about a pre-provisioned hook.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined
  
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The ARN of the fleet provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.undefined
  
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.undefined
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.undefined
}
object DescribeProvisioningTemplateResponse {
  
  inline def apply(): DescribeProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningTemplateResponse]
  }
  
  extension [Self <: DescribeProvisioningTemplateResponse](x: Self) {
    
    inline def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDefaultVersionId(value: TemplateVersionId): Self = StObject.set(x, "defaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "defaultVersionId", js.undefined)
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setPreProvisioningHook(value: ProvisioningHook): Self = StObject.set(x, "preProvisioningHook", value.asInstanceOf[js.Any])
    
    inline def setPreProvisioningHookUndefined: Self = StObject.set(x, "preProvisioningHook", js.undefined)
    
    inline def setProvisioningRoleArn(value: RoleArn): Self = StObject.set(x, "provisioningRoleArn", value.asInstanceOf[js.Any])
    
    inline def setProvisioningRoleArnUndefined: Self = StObject.set(x, "provisioningRoleArn", js.undefined)
    
    inline def setTemplateArn(value: TemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateArnUndefined: Self = StObject.set(x, "templateArn", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
