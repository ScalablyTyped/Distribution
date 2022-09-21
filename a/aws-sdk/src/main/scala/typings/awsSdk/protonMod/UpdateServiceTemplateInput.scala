package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceTemplateInput extends StObject {
  
  /**
    * A description of the service template update.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the service template to update that's displayed in the developer interface.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The name of the service template to update.
    */
  var name: ResourceName
}
object UpdateServiceTemplateInput {
  
  inline def apply(name: ResourceName): UpdateServiceTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceTemplateInput]
  }
  
  extension [Self <: UpdateServiceTemplateInput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
