package typings.consumerDataStandards.energyMod

import typings.consumerDataStandards.anon.DictkNickname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountV2
  extends StObject
     with EnergyAccountBaseV2 {
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[DictkNickname]
}
object EnergyAccountV2 {
  
  inline def apply(accountId: String, plans: js.Array[DictkNickname]): EnergyAccountV2 = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountV2] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[DictkNickname]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: DictkNickname*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
