package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiConditionalBranch extends js.Object {
  
  /**
    * The condition to evaluate for the activity path.
    */
  var Condition: js.UndefOr[SimpleCondition] = js.native
  
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.native
}
object MultiConditionalBranch {
  
  @scala.inline
  def apply(): MultiConditionalBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiConditionalBranch]
  }
  
  @scala.inline
  implicit class MultiConditionalBranchOps[Self <: MultiConditionalBranch] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: SimpleCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    
    @scala.inline
    def setNextActivity(value: string): Self = this.set("NextActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextActivity: Self = this.set("NextActivity", js.undefined)
  }
}
