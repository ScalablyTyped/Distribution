package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRegistryRequest extends StObject {
  
  /**
    * A description of the registry to be created.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * Tags to associate with the registry.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.undefined
}
object CreateRegistryRequest {
  
  @scala.inline
  def apply(RegistryName: string): CreateRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegistryRequest]
  }
  
  @scala.inline
  implicit class CreateRegistryRequestMutableBuilder[Self <: CreateRegistryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
