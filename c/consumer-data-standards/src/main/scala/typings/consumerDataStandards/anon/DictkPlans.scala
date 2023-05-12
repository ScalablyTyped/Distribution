package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkPlans
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of Products
    */
  var plans: js.Array[Bundle]
}
object DictkPlans {
  
  inline def apply(plans: js.Array[Bundle]): DictkPlans = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkPlans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkPlans] (val x: Self) extends AnyVal {
    
    inline def setPlans(value: js.Array[Bundle]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: Bundle*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
