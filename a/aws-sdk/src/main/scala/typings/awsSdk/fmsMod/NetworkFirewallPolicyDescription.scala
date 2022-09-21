package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallPolicyDescription extends StObject {
  
  /**
    * The default actions to take on a packet that doesn't match any stateful rules. The stateful default action is optional, and is only valid when using the strict rule order.  Valid values of the stateful default action:    aws:drop_strict   aws:drop_established   aws:alert_strict   aws:alert_established  
    */
  var StatefulDefaultActions: js.UndefOr[NetworkFirewallActionList] = js.undefined
  
  /**
    * Additional options governing how Network Firewall handles stateful rules. The stateful rule groups that you use in your policy must have stateful rule options settings that are compatible with these settings.
    */
  var StatefulEngineOptions: js.UndefOr[typings.awsSdk.fmsMod.StatefulEngineOptions] = js.undefined
  
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
    
    inline def setStatefulDefaultActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatefulDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatefulDefaultActionsUndefined: Self = StObject.set(x, "StatefulDefaultActions", js.undefined)
    
    inline def setStatefulDefaultActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatefulDefaultActions", js.Array(value*))
    
    inline def setStatefulEngineOptions(value: StatefulEngineOptions): Self = StObject.set(x, "StatefulEngineOptions", value.asInstanceOf[js.Any])
    
    inline def setStatefulEngineOptionsUndefined: Self = StObject.set(x, "StatefulEngineOptions", js.undefined)
    
    inline def setStatefulRuleGroups(value: StatefulRuleGroupList): Self = StObject.set(x, "StatefulRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleGroupsUndefined: Self = StObject.set(x, "StatefulRuleGroups", js.undefined)
    
    inline def setStatefulRuleGroupsVarargs(value: StatefulRuleGroup*): Self = StObject.set(x, "StatefulRuleGroups", js.Array(value*))
    
    inline def setStatelessCustomActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatelessCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessCustomActionsUndefined: Self = StObject.set(x, "StatelessCustomActions", js.undefined)
    
    inline def setStatelessCustomActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatelessCustomActions", js.Array(value*))
    
    inline def setStatelessDefaultActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessDefaultActionsUndefined: Self = StObject.set(x, "StatelessDefaultActions", js.undefined)
    
    inline def setStatelessDefaultActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatelessDefaultActions", js.Array(value*))
    
    inline def setStatelessFragmentDefaultActions(value: NetworkFirewallActionList): Self = StObject.set(x, "StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessFragmentDefaultActionsUndefined: Self = StObject.set(x, "StatelessFragmentDefaultActions", js.undefined)
    
    inline def setStatelessFragmentDefaultActionsVarargs(value: NetworkFirewallAction*): Self = StObject.set(x, "StatelessFragmentDefaultActions", js.Array(value*))
    
    inline def setStatelessRuleGroups(value: StatelessRuleGroupList): Self = StObject.set(x, "StatelessRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setStatelessRuleGroupsUndefined: Self = StObject.set(x, "StatelessRuleGroups", js.undefined)
    
    inline def setStatelessRuleGroupsVarargs(value: StatelessRuleGroup*): Self = StObject.set(x, "StatelessRuleGroups", js.Array(value*))
  }
}
