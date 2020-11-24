package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRuleGroupRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupName: js.UndefOr[ResourceName] = js.native
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules.   This setting is required for requests that do not include the RuleGroupARN. 
    */
  var Type: js.UndefOr[RuleGroupType] = js.native
}
object DeleteRuleGroupRequest {
  
  @scala.inline
  def apply(): DeleteRuleGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRuleGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteRuleGroupRequestOps[Self <: DeleteRuleGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setRuleGroupArn(value: ResourceArn): Self = this.set("RuleGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroupArn: Self = this.set("RuleGroupArn", js.undefined)
    
    @scala.inline
    def setRuleGroupName(value: ResourceName): Self = this.set("RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroupName: Self = this.set("RuleGroupName", js.undefined)
    
    @scala.inline
    def setType(value: RuleGroupType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
