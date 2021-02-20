package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicy extends StObject {
  
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
  implicit class FirewallPolicyMutableBuilder[Self <: FirewallPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatefulRuleGroupReferences(value: StatefulRuleGroupReferences): Self = StObject.set(x, "StatefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRuleGroupReferencesUndefined: Self = StObject.set(x, "StatefulRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatefulRuleGroupReferencesVarargs(value: StatefulRuleGroupReference*): Self = StObject.set(x, "StatefulRuleGroupReferences", js.Array(value :_*))
    
    @scala.inline
    def setStatelessCustomActions(value: CustomActions): Self = StObject.set(x, "StatelessCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessCustomActionsUndefined: Self = StObject.set(x, "StatelessCustomActions", js.undefined)
    
    @scala.inline
    def setStatelessCustomActionsVarargs(value: CustomAction*): Self = StObject.set(x, "StatelessCustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessDefaultActions(value: StatelessActions): Self = StObject.set(x, "StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessDefaultActionsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "StatelessDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessFragmentDefaultActions(value: StatelessActions): Self = StObject.set(x, "StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessFragmentDefaultActionsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "StatelessFragmentDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRuleGroupReferences(value: StatelessRuleGroupReferences): Self = StObject.set(x, "StatelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessRuleGroupReferencesUndefined: Self = StObject.set(x, "StatelessRuleGroupReferences", js.undefined)
    
    @scala.inline
    def setStatelessRuleGroupReferencesVarargs(value: StatelessRuleGroupReference*): Self = StObject.set(x, "StatelessRuleGroupReferences", js.Array(value :_*))
  }
}
