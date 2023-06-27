package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.anon.ServicePointIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetailV3
  extends StObject
     with EnergyAccountBaseV2 {
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[ServicePointIds]
}
object EnergyAccountDetailV3 {
  
  inline def apply(accountId: String, plans: js.Array[ServicePointIds]): EnergyAccountDetailV3 = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetailV3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountDetailV3] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[ServicePointIds]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: ServicePointIds*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
