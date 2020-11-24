package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirewallPolicyDescription extends js.Object {
  
  /**
    * The stateful rule groups that are used in the Network Firewall firewall policy. 
    */
  var StatefulRuleGroups: js.UndefOr[StatefulRuleGroupList] = js.native
  
  /**
    * Names of custom actions that are available for use in the stateless default actions settings.
    */
  var StatelessCustomActions: js.UndefOr[NetworkFirewallActionList] = js.native
  
  /**
    * The actions to take on packets that don't match any of the stateless rule groups. 
    */
  var StatelessDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.native
  
  /**
    * The actions to take on packet fragments that don't match any of the stateless rule groups. 
    */
  var StatelessFragmentDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.native
  
  /**
    * The stateless rule groups that are used in the Network Firewall firewall policy. 
    */
  var StatelessRuleGroups: js.UndefOr[StatelessRuleGroupList] = js.native
}
object NetworkFirewallPolicyDescription {
  
  @scala.inline
  def apply(): NetworkFirewallPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallPolicyDescription]
  }
  
  @scala.inline
  implicit class NetworkFirewallPolicyDescriptionOps[Self <: NetworkFirewallPolicyDescription] (val x: Self) extends AnyVal {
    
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
    def setStatefulRuleGroupsVarargs(value: StatefulRuleGroup*): Self = this.set("StatefulRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setStatefulRuleGroups(value: StatefulRuleGroupList): Self = this.set("StatefulRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulRuleGroups: Self = this.set("StatefulRuleGroups", js.undefined)
    
    @scala.inline
    def setStatelessCustomActionsVarargs(value: NetworkFirewallAction*): Self = this.set("StatelessCustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessCustomActions(value: NetworkFirewallActionList): Self = this.set("StatelessCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessCustomActions: Self = this.set("StatelessCustomActions", js.undefined)
    
    @scala.inline
    def setStatelessDefaultActionsVarargs(value: NetworkFirewallAction*): Self = this.set("StatelessDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessDefaultActions(value: NetworkFirewallActionList): Self = this.set("StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessDefaultActions: Self = this.set("StatelessDefaultActions", js.undefined)
    
    @scala.inline
    def setStatelessFragmentDefaultActionsVarargs(value: NetworkFirewallAction*): Self = this.set("StatelessFragmentDefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessFragmentDefaultActions(value: NetworkFirewallActionList): Self = this.set("StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessFragmentDefaultActions: Self = this.set("StatelessFragmentDefaultActions", js.undefined)
    
    @scala.inline
    def setStatelessRuleGroupsVarargs(value: StatelessRuleGroup*): Self = this.set("StatelessRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRuleGroups(value: StatelessRuleGroupList): Self = this.set("StatelessRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessRuleGroups: Self = this.set("StatelessRuleGroups", js.undefined)
  }
}
