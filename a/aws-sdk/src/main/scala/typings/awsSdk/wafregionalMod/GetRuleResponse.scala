package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRuleResponse extends js.Object {
  
  /**
    * Information about the Rule that you specified in the GetRule request. For more information, see the following topics:    Rule: Contains MetricName, Name, an array of Predicate objects, and RuleId     Predicate: Each Predicate object contains DataId, Negated, and Type   
    */
  var Rule: js.UndefOr[typings.awsSdk.wafregionalMod.Rule] = js.native
}
object GetRuleResponse {
  
  @scala.inline
  def apply(): GetRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleResponse]
  }
  
  @scala.inline
  implicit class GetRuleResponseOps[Self <: GetRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setRule(value: Rule): Self = this.set("Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("Rule", js.undefined)
  }
}
