package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkPlans
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of plans
    */
  var plans: js.Array[Brand]
}
object DictkPlans {
  
  inline def apply(plans: js.Array[Brand]): DictkPlans = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkPlans]
  }
  
  extension [Self <: DictkPlans](x: Self) {
    
    inline def setPlans(value: js.Array[Brand]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: Brand*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
