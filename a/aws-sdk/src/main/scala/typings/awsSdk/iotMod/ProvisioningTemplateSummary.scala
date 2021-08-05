package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningTemplateSummary extends StObject {
  
  /**
    * The date when the fleet provisioning template summary was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * True if the fleet provision template is enabled, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The date when the fleet provisioning template summary was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The ARN of the fleet provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.undefined
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.undefined
}
object ProvisioningTemplateSummary {
  
  inline def apply(): ProvisioningTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningTemplateSummary]
  }
  
  extension [Self <: ProvisioningTemplateSummary](x: Self) {
    
    inline def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setTemplateArn(value: TemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateArnUndefined: Self = StObject.set(x, "templateArn", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
