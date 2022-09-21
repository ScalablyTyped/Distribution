package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceTemplateInput extends StObject {
  
  /**
    * A description of the service template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the service template as displayed in the developer interface.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * A customer provided encryption key that's used to encrypt data.
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the service template.
    */
  var name: ResourceName
  
  /**
    * By default, Proton provides a service pipeline for your service. When this parameter is included, it indicates that an Proton service pipeline isn't provided for your service. After it's included, it can't be changed. For more information, see Service template bundles in the Proton Administrator Guide.
    */
  var pipelineProvisioning: js.UndefOr[Provisioning] = js.undefined
  
  /**
    * An optional list of metadata items that you can associate with the Proton service template. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton Administrator Guide or Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateServiceTemplateInput {
  
  inline def apply(name: ResourceName): CreateServiceTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceTemplateInput]
  }
  
  extension [Self <: CreateServiceTemplateInput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioning(value: Provisioning): Self = StObject.set(x, "pipelineProvisioning", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioningUndefined: Self = StObject.set(x, "pipelineProvisioning", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
