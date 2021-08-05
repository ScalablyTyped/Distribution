package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCapacityProviderResponse extends StObject {
  
  /**
    * The full description of the new capacity provider.
    */
  var capacityProvider: js.UndefOr[CapacityProvider] = js.undefined
}
object CreateCapacityProviderResponse {
  
  inline def apply(): CreateCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCapacityProviderResponse]
  }
  
  extension [Self <: CreateCapacityProviderResponse](x: Self) {
    
    inline def setCapacityProvider(value: CapacityProvider): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderUndefined: Self = StObject.set(x, "capacityProvider", js.undefined)
  }
}
