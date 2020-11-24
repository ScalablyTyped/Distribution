package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessRulesAndCustomActions extends js.Object {
  
  /**
    * Defines an array of individual custom action definitions that are available for use by the stateless rules in this StatelessRulesAndCustomActions specification. You name each custom action that you define, and then you can use it by name in your StatelessRule RuleDefinition Actions specification.
    */
  var CustomActions: js.UndefOr[typings.awsSdk.networkfirewallMod.CustomActions] = js.native
  
  /**
    * Defines the set of stateless rules for use in a stateless rule group. 
    */
  var StatelessRules: typings.awsSdk.networkfirewallMod.StatelessRules = js.native
}
object StatelessRulesAndCustomActions {
  
  @scala.inline
  def apply(StatelessRules: StatelessRules): StatelessRulesAndCustomActions = {
    val __obj = js.Dynamic.literal(StatelessRules = StatelessRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessRulesAndCustomActions]
  }
  
  @scala.inline
  implicit class StatelessRulesAndCustomActionsOps[Self <: StatelessRulesAndCustomActions] (val x: Self) extends AnyVal {
    
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
    def setStatelessRulesVarargs(value: StatelessRule*): Self = this.set("StatelessRules", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRules(value: StatelessRules): Self = this.set("StatelessRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomActionsVarargs(value: CustomAction*): Self = this.set("CustomActions", js.Array(value :_*))
    
    @scala.inline
    def setCustomActions(value: CustomActions): Self = this.set("CustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomActions: Self = this.set("CustomActions", js.undefined)
  }
}
