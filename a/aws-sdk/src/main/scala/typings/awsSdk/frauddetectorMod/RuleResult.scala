package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleResult extends js.Object {
  
  /**
    * The outcomes of the matched rule, based on the rule execution mode.
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.native
  
  /**
    * The rule ID that was matched, based on the rule execution mode.
    */
  var ruleId: js.UndefOr[String] = js.native
}
object RuleResult {
  
  @scala.inline
  def apply(): RuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleResult]
  }
  
  @scala.inline
  implicit class RuleResultOps[Self <: RuleResult] (val x: Self) extends AnyVal {
    
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
    def setOutcomesVarargs(value: String*): Self = this.set("outcomes", js.Array(value :_*))
    
    @scala.inline
    def setOutcomes(value: ListOfStrings): Self = this.set("outcomes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcomes: Self = this.set("outcomes", js.undefined)
    
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
  }
}
