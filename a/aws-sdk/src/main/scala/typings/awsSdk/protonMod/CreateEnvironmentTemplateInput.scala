package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentTemplateInput extends StObject {
  
  /**
    * A description of the environment template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The environment template name as displayed in the developer interface.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * A customer provided encryption key that Proton uses to encrypt data.
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the environment template.
    */
  var name: ResourceName
  
  /**
    * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
    */
  var provisioning: js.UndefOr[Provisioning] = js.undefined
  
  /**
    * An optional list of metadata items that you can associate with the Proton environment template. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton Administrator Guide or Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateEnvironmentTemplateInput {
  
  inline def apply(name: ResourceName): CreateEnvironmentTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentTemplateInput]
  }
  
  extension [Self <: CreateEnvironmentTemplateInput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvisioning(value: Provisioning): Self = StObject.set(x, "provisioning", value.asInstanceOf[js.Any])
    
    inline def setProvisioningUndefined: Self = StObject.set(x, "provisioning", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
