package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceTemplateVersionInput extends StObject {
  
  /**
    * An array of environment template objects that are compatible with this service template version. A service instance based on this service template version can run in environments based on compatible templates.
    */
  var compatibleEnvironmentTemplates: js.UndefOr[CompatibleEnvironmentTemplateInputList] = js.undefined
  
  /**
    * A description of a service template version to update.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * To update a major version of a service template, include major Version.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * To update a minor version of a service template, include minorVersion.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The status of the service template minor version to update.
    */
  var status: js.UndefOr[TemplateVersionStatus] = js.undefined
  
  /**
    * An array of supported component sources. Components with supported sources can be attached to service instances based on this service template version.  A change to supportedComponentSources doesn't impact existing component attachments to instances based on this template version. A change only affects later associations.  For more information about components, see Proton components in the Proton Administrator Guide.
    */
  var supportedComponentSources: js.UndefOr[ServiceTemplateSupportedComponentSourceInputList] = js.undefined
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object UpdateServiceTemplateVersionInput {
  
  inline def apply(majorVersion: TemplateVersionPart, minorVersion: TemplateVersionPart, templateName: ResourceName): UpdateServiceTemplateVersionInput = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceTemplateVersionInput]
  }
  
  extension [Self <: UpdateServiceTemplateVersionInput](x: Self) {
    
    inline def setCompatibleEnvironmentTemplates(value: CompatibleEnvironmentTemplateInputList): Self = StObject.set(x, "compatibleEnvironmentTemplates", value.asInstanceOf[js.Any])
    
    inline def setCompatibleEnvironmentTemplatesUndefined: Self = StObject.set(x, "compatibleEnvironmentTemplates", js.undefined)
    
    inline def setCompatibleEnvironmentTemplatesVarargs(value: CompatibleEnvironmentTemplateInput*): Self = StObject.set(x, "compatibleEnvironmentTemplates", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TemplateVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportedComponentSources(value: ServiceTemplateSupportedComponentSourceInputList): Self = StObject.set(x, "supportedComponentSources", value.asInstanceOf[js.Any])
    
    inline def setSupportedComponentSourcesUndefined: Self = StObject.set(x, "supportedComponentSources", js.undefined)
    
    inline def setSupportedComponentSourcesVarargs(value: ServiceTemplateSupportedComponentSourceType*): Self = StObject.set(x, "supportedComponentSources", js.Array(value*))
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
