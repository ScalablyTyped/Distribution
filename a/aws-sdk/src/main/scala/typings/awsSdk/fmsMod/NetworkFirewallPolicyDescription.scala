package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallPolicyDescription extends StObject {
  
  /**
    * The stateful rule groups that are used in the Network Firewall firewall policy. 
    */
  var StatefulRuleGroups: js.UndefOr[StatefulRuleGroupList] = js.undefined
  
  /**
    * Names of custom actions that are available for use in the stateless default actions settings.
    */
  var StatelessCustomActions: js.UndefOr[NetworkFirewallActionList] = js.undefined
  
  /**
    * The actions to take on packets that don't match any of the stateless rule groups. 
    */
  var StatelessDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.undefined
  
  /**
    * The actions to take on packet fragments that don't match any of the stateless rule groups. 
    */
  var StatelessFragmentDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.undefined
  
  /**
    * The stateless rule groups that are used in the Network Firewall firewall policy. 
    */
  var StatelessRuleGroups: js.UndefOr[StatelessRuleGroupList] = js.undefined
}
object NetworkFirewallPolicyDescription {
  
  inline def apply(): NetworkFirewallPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallPolicyDescription]
  }
  
  extension [Self <: NetworkFirewallPolicyDescription](x: Self) {
    
    inline def setStatefulRuleGroups(value: StatefulRuleGroupList): Self = StObject.set(x, "StatefulRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleGroupsUndefined: Self = StObject.set(x, "StatefulRuleGroups", js.undefined)
    
    inline def setStatefulRuleGroupsVarargs(value: StatefulRuleGroup*): Self = StObject.set(x, "StatefulRuleGroups", js.Array(value :_*))
    
    inline def setStatelessCustomActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatelessCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessCustomActionsUndefined: Self = StObject.set(x, "StatelessCustomActions", js.undefined)
    
    inline def setStatelessCustomActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatelessCustomActions", js.Array(value :_*))
    
    inline def setStatelessDefaultActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessDefaultActionsUndefined: Self = StObject.set(x, "StatelessDefaultActions", js.undefined)
    
    inline def setStatelessDefaultActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatelessDefaultActions", js.Array(value :_*))
    
    inline def setStatelessFragmentDefaultActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessFragmentDefaultActionsUndefined: Self = StObject.set(x, "StatelessFragmentDefaultActions", js.undefined)
    
    inline def setStatelessFragmentDefaultActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatelessFragmentDefaultActions", js.Array(value :_*))
    
    inline def setStatelessRuleGroups(value: StatelessRuleGroupList): Self = StObject.set(x, "StatelessRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setStatelessRuleGroupsUndefined: Self = StObject.set(x, "StatelessRuleGroups", js.undefined)
    
    inline def setStatelessRuleGroupsVarargs(value: StatelessRuleGroup*): Self = StObject.set(x, "StatelessRuleGroups", js.Array(value :_*))
  }
}
