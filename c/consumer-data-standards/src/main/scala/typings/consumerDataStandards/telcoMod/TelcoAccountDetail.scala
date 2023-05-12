package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.ServiceIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccountDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The array of plans containing services and associated plan details
    */
  var plans: js.Array[ServiceIds]
}
object TelcoAccountDetail {
  
  inline def apply(plans: js.Array[ServiceIds]): TelcoAccountDetail = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccountDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccountDetail] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[ServiceIds]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: ServiceIds*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
