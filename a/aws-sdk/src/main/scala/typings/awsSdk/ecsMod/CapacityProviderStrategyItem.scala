package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityProviderStrategyItem extends StObject {
  
  /**
    * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
    */
  var base: js.UndefOr[CapacityProviderStrategyItemBase] = js.undefined
  
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: String
  
  /**
    * The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. For example, if you have a strategy that contains two capacity providers and both have a weight of 1, then when the base is satisfied, the tasks will be split evenly across the two capacity providers. Using that same logic, if you specify a weight of 1 for capacityProviderA and a weight of 4 for capacityProviderB, then for every one task that is run using capacityProviderA, four tasks would use capacityProviderB.
    */
  var weight: js.UndefOr[CapacityProviderStrategyItemWeight] = js.undefined
}
object CapacityProviderStrategyItem {
  
  inline def apply(capacityProvider: String): CapacityProviderStrategyItem = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderStrategyItem]
  }
  
  extension [Self <: CapacityProviderStrategyItem](x: Self) {
    
    inline def setBase(value: CapacityProviderStrategyItemBase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCapacityProvider(value: String): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: CapacityProviderStrategyItemWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
