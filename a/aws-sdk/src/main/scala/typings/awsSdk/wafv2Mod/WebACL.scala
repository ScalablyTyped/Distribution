package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebACL extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
    */
  var ARN: ResourceArn
  
  /**
    * The web ACL capacity units (WCUs) currently being used by this web ACL.  AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.undefined
  
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typings.awsSdk.wafv2Mod.DefaultAction
  
  /**
    * A description of the Web ACL that helps with identification. You cannot change the description of a Web ACL after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the WebACL. This ID is returned in the responses to create and list commands. You use this ID to do things like get, update, and delete a WebACL.
    */
  var Id: EntityId
  
  /**
    * Indicates whether this web ACL is managed by AWS Firewall Manager. If true, then only AWS Firewall Manager can delete the web ACL or any Firewall Manager rule groups in the web ACL. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var Name: EntityName
  
  /**
    * The last set of rules for AWS WAF to process in the web ACL. This is defined in an AWS Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized before these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined
  
  /**
    * The first set of rules for AWS WAF to process in the web ACL. This is defined in an AWS Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized after these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined
  
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.wafv2Mod.Rules] = js.undefined
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig
}
object WebACL {
  
  @scala.inline
  def apply(
    ARN: ResourceArn,
    DefaultAction: DefaultAction,
    Id: EntityId,
    Name: EntityName,
    VisibilityConfig: VisibilityConfig
  ): WebACL = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DefaultAction = DefaultAction.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACL]
  }
  
  @scala.inline
  implicit class WebACLMutableBuilder[Self <: WebACL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: ConsumedCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    @scala.inline
    def setDefaultAction(value: DefaultAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByFirewallManager(value: Boolean): Self = StObject.set(x, "ManagedByFirewallManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByFirewallManagerUndefined: Self = StObject.set(x, "ManagedByFirewallManager", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcessFirewallManagerRuleGroups(value: FirewallManagerRuleGroups): Self = StObject.set(x, "PostProcessFirewallManagerRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostProcessFirewallManagerRuleGroupsUndefined: Self = StObject.set(x, "PostProcessFirewallManagerRuleGroups", js.undefined)
    
    @scala.inline
    def setPostProcessFirewallManagerRuleGroupsVarargs(value: FirewallManagerRuleGroup*): Self = StObject.set(x, "PostProcessFirewallManagerRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setPreProcessFirewallManagerRuleGroups(value: FirewallManagerRuleGroups): Self = StObject.set(x, "PreProcessFirewallManagerRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreProcessFirewallManagerRuleGroupsUndefined: Self = StObject.set(x, "PreProcessFirewallManagerRuleGroups", js.undefined)
    
    @scala.inline
    def setPreProcessFirewallManagerRuleGroupsVarargs(value: FirewallManagerRuleGroup*): Self = StObject.set(x, "PreProcessFirewallManagerRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
