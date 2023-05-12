package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BillingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccount
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The array of plans containing service and associated plan details
    */
  var plans: js.Array[BillingType]
}
object TelcoAccount {
  
  inline def apply(plans: js.Array[BillingType]): TelcoAccount = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccount] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[BillingType]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: BillingType*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
