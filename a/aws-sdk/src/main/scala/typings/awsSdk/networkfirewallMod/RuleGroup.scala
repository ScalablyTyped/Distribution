package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroup extends js.Object {
  
  /**
    * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule groups. 
    */
  var RuleVariables: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleVariables] = js.native
  
  /**
    * The stateful rules or stateless rules for the rule group. 
    */
  var RulesSource: typings.awsSdk.networkfirewallMod.RulesSource = js.native
}
object RuleGroup {
  
  @scala.inline
  def apply(RulesSource: RulesSource): RuleGroup = {
    val __obj = js.Dynamic.literal(RulesSource = RulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroup]
  }
  
  @scala.inline
  implicit class RuleGroupOps[Self <: RuleGroup] (val x: Self) extends AnyVal {
    
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
    def setRulesSource(value: RulesSource): Self = this.set("RulesSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVariables(value: RuleVariables): Self = this.set("RuleVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleVariables: Self = this.set("RuleVariables", js.undefined)
  }
}
