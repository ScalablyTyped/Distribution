package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentTemplateVersionInput extends StObject {
  
  /**
    * When included, if two identical requests are made with the same client token, Proton returns the environment template version that the first request created.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description of the new version of an environment template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * To create a new minor version of the environment template, include major Version. To create a new major and minor version of the environment template, exclude major Version.
    */
  var majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * An object that includes the template bundle S3 bucket path and name for the new version of an template.
    */
  var source: TemplateVersionSourceInput
  
  /**
    * An optional list of metadata items that you can associate with the Proton environment template version. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton Administrator Guide or Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the environment template.
    */
  var templateName: ResourceName
}
object CreateEnvironmentTemplateVersionInput {
  
  inline def apply(source: TemplateVersionSourceInput, templateName: ResourceName): CreateEnvironmentTemplateVersionInput = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentTemplateVersionInput]
  }
  
  extension [Self <: CreateEnvironmentTemplateVersionInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setSource(value: TemplateVersionSourceInput): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
