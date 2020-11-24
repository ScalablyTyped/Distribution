package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicy extends js.Object {
  
  /**
    * References to the stateless rule groups that are used in the policy. These define the inspection criteria in stateful rules. 
    */
  var StatefulRuleGroupReferences: js.UndefOr[typings.awsSdk.networkfirewallMod.StatefulRuleGroupReferences] = js.native
  
  /**
    * The custom action definitions that are available for use in the firewall policy's StatelessDefaultActions setting. You name each custom action that you define, and then you can use it by name in your default actions specifications.
    */
  var StatelessCustomActions: js.UndefOr[CustomActions] = js.native
  
  /**
    * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want non-matching packets to be forwarded for stateful inspection, specify aws:forward_to_sfe.  You must specify one of the standard actions: aws:pass, aws:drop, or aws:forward_to_sfe. In addition, you can specify custom actions that are compatible with your standard section choice. For example, you could specify ["aws:pass"] or you could specify ["aws:pass", “customActionName”]. For information about compatibility, see the custom action descriptions under CustomAction.
    */
  var StatelessDefaultActions: StatelessActions = js.native
  
  /**
    * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy. If you want non-matching fragmented packets to be forwarded for stateful inspection, specify aws:forward_to_sfe.  You must specify one of the standard actions: aws:pass, aws:drop, or aws:forward_to_sfe. In addition, you can specify custom actions that are compatible with your standard section choice. For example, you could specify ["aws:pass"] or you could specify ["aws:pass", “customActionName”]. For information about compatibility, see the custom action descriptions under CustomAction.
    */
  var StatelessFragmentDefaultActions: StatelessActions = js.native
  
  /**
    * References to the stateless rule groups that are used in the policy. These define the matching criteria in stateless rules. 
    */
  var StatelessRuleGroupReferences: js.UndefOr[typings.awsSdk.networkfirewallMod.StatelessRuleGroupReferences] = js.native
}
object FirewallPolicy {
  
  @scala.inline
  def apply(StatelessDefaultActions: StatelessActions, StatelessFragmentDefaultActions: StatelessActions): FirewallPolicy = {
    val __obj = js.Dynamic.literal(StatelessDefaultActions = StatelessDefaultActions.asInstanceOf[js.Any], StatelessFragmentDefaultActions = StatelessFragmentDefaultActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicy]
  }
  
  @scala.inline
  implicit class FirewallPolicyOps[Self <: FirewallPolicy] (val x: Self) extends AnyVal {
    
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
    def setStatelessDefaultActionsVarargs(value: CollectionMemberString*): Self = this.set("StatelessDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessDefaultActions(value: StatelessActions): Self = this.set("StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessFragmentDefaultActionsVarargs(value: CollectionMemberString*): Self = this.set("StatelessFragmentDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessFragmentDefaultActions(value: StatelessActions): Self = this.set("StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRuleGroupReferencesVarargs(value: StatefulRuleGroupReference*): Self = this.set("StatefulRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatefulRuleGroupReferences(value: StatefulRuleGroupReferences): Self = this.set("StatefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulRuleGroupReferences: Self = this.set("StatefulRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatelessCustomActionsVarargs(value: CustomAction*): Self = this.set("StatelessCustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessCustomActions(value: CustomActions): Self = this.set("StatelessCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessCustomActions: Self = this.set("StatelessCustomActions", js.undefined)
    
    @scala.inline
    def setStatelessRuleGroupReferencesVarargs(value: StatelessRuleGroupReference*): Self = this.set("StatelessRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRuleGroupReferences(value: StatelessRuleGroupReferences): Self = this.set("StatelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessRuleGroupReferences: Self = this.set("StatelessRuleGroupReferences", js.undefined)
  }
}
