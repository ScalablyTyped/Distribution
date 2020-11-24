package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRuleGroupResponse extends js.Object {
  
  /**
    * The high-level properties of a rule group. This, along with the RuleGroup, define the rule group. You can retrieve all objects for a rule group by calling DescribeRuleGroup. 
    */
  var RuleGroupResponse: typings.awsSdk.networkfirewallMod.RuleGroupResponse = js.native
}
object DeleteRuleGroupResponse {
  
  @scala.inline
  def apply(RuleGroupResponse: RuleGroupResponse): DeleteRuleGroupResponse = {
    val __obj = js.Dynamic.literal(RuleGroupResponse = RuleGroupResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleGroupResponse]
  }
  
  @scala.inline
  implicit class DeleteRuleGroupResponseOps[Self <: DeleteRuleGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setRuleGroupResponse(value: RuleGroupResponse): Self = this.set("RuleGroupResponse", value.asInstanceOf[js.Any])
  }
}
