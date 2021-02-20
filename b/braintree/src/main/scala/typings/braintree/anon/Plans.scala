package typings.braintree.anon

import typings.braintree.mod.Plan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plans extends StObject {
  
  var plans: js.Array[Plan] = js.native
}
object Plans {
  
  @scala.inline
  def apply(plans: js.Array[Plan]): Plans = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plans]
  }
  
  @scala.inline
  implicit class PlansMutableBuilder[Self <: Plans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlans(value: js.Array[Plan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlansVarargs(value: Plan*): Self = StObject.set(x, "plans", js.Array(value :_*))
  }
}
