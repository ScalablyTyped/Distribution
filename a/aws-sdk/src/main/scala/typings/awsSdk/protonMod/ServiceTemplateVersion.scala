package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceTemplateVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the version of a service template.
    */
  var arn: ServiceTemplateVersionArn
  
  /**
    * An array of compatible environment template names for the major version of a service template.
    */
  var compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateList
  
  /**
    * The time when the version of a service template was created.
    */
  var createdAt: js.Date
  
  /**
    * A description of the version of a service template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time when the version of a service template was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The latest major version that's associated with the version of a service template.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * The minor version of a service template.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The recommended minor version of the service template.
    */
  var recommendedMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The schema of the version of a service template.
    */
  var schema: js.UndefOr[TemplateSchema] = js.undefined
  
  /**
    * The service template version status.
    */
  var status: TemplateVersionStatus
  
  /**
    * A service template version status message.
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * An array of supported component sources. Components with supported sources can be attached to service instances based on this service template version. For more information about components, see Proton components in the Proton User Guide.
    */
  var supportedComponentSources: js.UndefOr[ServiceTemplateSupportedComponentSourceInputList] = js.undefined
  
  /**
    * The name of the version of a service template.
    */
  var templateName: ResourceName
}
object ServiceTemplateVersion {
  
  inline def apply(
    arn: ServiceTemplateVersionArn,
    compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateList,
    createdAt: js.Date,
    lastModifiedAt: js.Date,
    majorVersion: TemplateVersionPart,
    minorVersion: TemplateVersionPart,
    status: TemplateVersionStatus,
    templateName: ResourceName
  ): ServiceTemplateVersion = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], compatibleEnvironmentTemplates = compatibleEnvironmentTemplates.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTemplateVersion]
  }
  
  extension [Self <: ServiceTemplateVersion](x: Self) {
    
    inline def setArn(value: ServiceTemplateVersionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCompatibleEnvironmentTemplates(value: CompatibleEnvironmentTemplateList): Self = StObject.set(x, "compatibleEnvironmentTemplates", value.asInstanceOf[js.Any])
    
    inline def setCompatibleEnvironmentTemplatesVarargs(value: CompatibleEnvironmentTemplate*): Self = StObject.set(x, "compatibleEnvironmentTemplates", js.Array(value*))
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "recommendedMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedMinorVersionUndefined: Self = StObject.set(x, "recommendedMinorVersion", js.undefined)
    
    inline def setSchema(value: TemplateSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatus(value: TemplateVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSupportedComponentSources(value: ServiceTemplateSupportedComponentSourceInputList): Self = StObject.set(x, "supportedComponentSources", value.asInstanceOf[js.Any])
    
    inline def setSupportedComponentSourcesUndefined: Self = StObject.set(x, "supportedComponentSources", js.undefined)
    
    inline def setSupportedComponentSourcesVarargs(value: ServiceTemplateSupportedComponentSourceType*): Self = StObject.set(x, "supportedComponentSources", js.Array(value*))
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
