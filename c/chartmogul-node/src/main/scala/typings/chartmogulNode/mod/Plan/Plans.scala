package typings.chartmogulNode.mod.Plan

import typings.chartmogulNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plans extends Cursor {
  
  var plans: js.Array[typings.chartmogulNode.mod.Plan.Plan] = js.native
}
object Plans {
  
  @scala.inline
  def apply(plans: js.Array[typings.chartmogulNode.mod.Plan.Plan]): Plans = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plans]
  }
  
  @scala.inline
  implicit class PlansOps[Self <: Plans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlansVarargs(value: typings.chartmogulNode.mod.Plan.Plan*): Self = this.set("plans", js.Array(value :_*))
    
    @scala.inline
    def setPlans(value: js.Array[typings.chartmogulNode.mod.Plan.Plan]): Self = this.set("plans", value.asInstanceOf[js.Any])
  }
}
