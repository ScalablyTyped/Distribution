package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegistryRequest extends StObject {
  
  /**
    * The description of the registry to update.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
}
object UpdateRegistryRequest {
  
  inline def apply(RegistryName: string): UpdateRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistryRequest]
  }
  
  extension [Self <: UpdateRegistryRequest](x: Self) {
    
    inline def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
  }
}
