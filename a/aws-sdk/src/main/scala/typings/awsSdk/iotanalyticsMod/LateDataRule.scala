package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LateDataRule extends js.Object {
  
  /**
    * The information needed to configure the late data rule.
    */
  var ruleConfiguration: LateDataRuleConfiguration = js.native
  
  /**
    * The name of the late data rule.
    */
  var ruleName: js.UndefOr[LateDataRuleName] = js.native
}
object LateDataRule {
  
  @scala.inline
  def apply(ruleConfiguration: LateDataRuleConfiguration): LateDataRule = {
    val __obj = js.Dynamic.literal(ruleConfiguration = ruleConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LateDataRule]
  }
  
  @scala.inline
  implicit class LateDataRuleOps[Self <: LateDataRule] (val x: Self) extends AnyVal {
    
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
    def setRuleConfiguration(value: LateDataRuleConfiguration): Self = this.set("ruleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: LateDataRuleName): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
  }
}
