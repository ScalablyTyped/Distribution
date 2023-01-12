package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.anon.PlanOverview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccount
  extends StObject
     with EnergyAccountBase {
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[PlanOverview]
}
object EnergyAccount {
  
  inline def apply(accountId: String, creationDate: String, plans: js.Array[PlanOverview]): EnergyAccount = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccount] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[PlanOverview]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: PlanOverview*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
