package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessRuleGroupReference extends js.Object {
  
  /**
    * An integer setting that indicates the order in which to run the stateless rule groups in a single FirewallPolicy. Network Firewall applies each stateless rule group to a packet starting with the group that has the lowest priority setting. You must ensure that the priority settings are unique within each policy.
    */
  var Priority: typings.awsSdk.networkfirewallMod.Priority = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stateless rule group.
    */
  var ResourceArn: typings.awsSdk.networkfirewallMod.ResourceArn = js.native
}
object StatelessRuleGroupReference {
  
  @scala.inline
  def apply(Priority: Priority, ResourceArn: ResourceArn): StatelessRuleGroupReference = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessRuleGroupReference]
  }
  
  @scala.inline
  implicit class StatelessRuleGroupReferenceOps[Self <: StatelessRuleGroupReference] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: Priority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
}
