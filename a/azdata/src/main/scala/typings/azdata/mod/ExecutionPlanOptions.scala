package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionPlanOptions extends js.Object {
  
  var displayActualQueryPlan: js.UndefOr[Boolean] = js.native
  
  var displayEstimatedQueryPlan: js.UndefOr[Boolean] = js.native
}
object ExecutionPlanOptions {
  
  @scala.inline
  def apply(): ExecutionPlanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionPlanOptions]
  }
  
  @scala.inline
  implicit class ExecutionPlanOptionsOps[Self <: ExecutionPlanOptions] (val x: Self) extends AnyVal {
    
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
    def setDisplayActualQueryPlan(value: Boolean): Self = this.set("displayActualQueryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayActualQueryPlan: Self = this.set("displayActualQueryPlan", js.undefined)
    
    @scala.inline
    def setDisplayEstimatedQueryPlan(value: Boolean): Self = this.set("displayEstimatedQueryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayEstimatedQueryPlan: Self = this.set("displayEstimatedQueryPlan", js.undefined)
  }
}
