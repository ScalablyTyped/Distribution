package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityProviderStrategyItem extends StObject {
  
  /**
    * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default value of 0 is used. 
    */
  var base: js.UndefOr[CapacityProviderStrategyItemBase] = js.undefined
  
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: CapacityProvider
  
  /**
    * The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. The weight value is taken into consideration after the base value, if defined, is satisfied.
    */
  var weight: js.UndefOr[CapacityProviderStrategyItemWeight] = js.undefined
}
object CapacityProviderStrategyItem {
  
  inline def apply(capacityProvider: CapacityProvider): CapacityProviderStrategyItem = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderStrategyItem]
  }
  
  extension [Self <: CapacityProviderStrategyItem](x: Self) {
    
    inline def setBase(value: CapacityProviderStrategyItemBase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCapacityProvider(value: CapacityProvider): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: CapacityProviderStrategyItemWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
