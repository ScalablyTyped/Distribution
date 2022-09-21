package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentTemplateSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment template.
    */
  var arn: EnvironmentTemplateArn
  
  /**
    * The time when the environment template was created.
    */
  var createdAt: js.Date
  
  /**
    * A description of the environment template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the environment template as displayed in the developer interface.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The time when the environment template was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The name of the environment template.
    */
  var name: ResourceName
  
  /**
    * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
    */
  var provisioning: js.UndefOr[Provisioning] = js.undefined
  
  /**
    * The recommended version of the environment template.
    */
  var recommendedVersion: js.UndefOr[FullTemplateVersionNumber] = js.undefined
}
object EnvironmentTemplateSummary {
  
  inline def apply(arn: EnvironmentTemplateArn, createdAt: js.Date, lastModifiedAt: js.Date, name: ResourceName): EnvironmentTemplateSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTemplateSummary]
  }
  
  extension [Self <: EnvironmentTemplateSummary](x: Self) {
    
    inline def setArn(value: EnvironmentTemplateArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvisioning(value: Provisioning): Self = StObject.set(x, "provisioning", value.asInstanceOf[js.Any])
    
    inline def setProvisioningUndefined: Self = StObject.set(x, "provisioning", js.undefined)
    
    inline def setRecommendedVersion(value: FullTemplateVersionNumber): Self = StObject.set(x, "recommendedVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedVersionUndefined: Self = StObject.set(x, "recommendedVersion", js.undefined)
  }
}
