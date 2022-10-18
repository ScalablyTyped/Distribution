package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.anon.PlanDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetailV2
  extends StObject
     with EnergyAccountBaseV2 {
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[PlanDetail]
}
object EnergyAccountDetailV2 {
  
  inline def apply(accountId: String, plans: js.Array[PlanDetail]): EnergyAccountDetailV2 = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetailV2]
  }
  
  extension [Self <: EnergyAccountDetailV2](x: Self) {
    
    inline def setPlans(value: js.Array[PlanDetail]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: PlanDetail*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
