package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRulePrioritiesInput extends js.Object {
  
  /**
    * The rule priorities.
    */
  var RulePriorities: RulePriorityList = js.native
}
object SetRulePrioritiesInput {
  
  @scala.inline
  def apply(RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
    val __obj = js.Dynamic.literal(RulePriorities = RulePriorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRulePrioritiesInput]
  }
  
  @scala.inline
  implicit class SetRulePrioritiesInputOps[Self <: SetRulePrioritiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRulePrioritiesVarargs(value: RulePriorityPair*): Self = this.set("RulePriorities", js.Array(value :_*))
    
    @scala.inline
    def setRulePriorities(value: RulePriorityList): Self = this.set("RulePriorities", value.asInstanceOf[js.Any])
  }
}
