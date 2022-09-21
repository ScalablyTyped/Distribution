package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCapacityProviderResponse extends StObject {
  
  /**
    * Details about the capacity provider.
    */
  var capacityProvider: js.UndefOr[CapacityProvider] = js.undefined
}
object UpdateCapacityProviderResponse {
  
  inline def apply(): UpdateCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCapacityProviderResponse]
  }
  
  extension [Self <: UpdateCapacityProviderResponse](x: Self) {
    
    inline def setCapacityProvider(value: CapacityProvider): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderUndefined: Self = StObject.set(x, "capacityProvider", js.undefined)
  }
}
