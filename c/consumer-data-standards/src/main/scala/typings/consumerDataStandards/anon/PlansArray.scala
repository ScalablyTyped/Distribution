package typings.consumerDataStandards.anon

import typings.consumerDataStandards.energyMod.EnergyPlan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlansArray extends StObject {
  
  /**
    * Array of plans
    */
  var plans: js.Array[EnergyPlan]
}
object PlansArray {
  
  inline def apply(plans: js.Array[EnergyPlan]): PlansArray = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlansArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlansArray] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[EnergyPlan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: EnergyPlan*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
