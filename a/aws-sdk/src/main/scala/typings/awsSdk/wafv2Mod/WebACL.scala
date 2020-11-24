package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebACL extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
    */
  var ARN: ResourceArn = js.native
  
  /**
    * The web ACL capacity units (WCUs) currently being used by this web ACL.  AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.native
  
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typings.awsSdk.wafv2Mod.DefaultAction = js.native
  
  /**
    * A description of the Web ACL that helps with identification. You cannot change the description of a Web ACL after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * A unique identifier for the WebACL. This ID is returned in the responses to create and list commands. You use this ID to do things like get, update, and delete a WebACL.
    */
  var Id: EntityId = js.native
  
  /**
    * Indicates whether this web ACL is managed by AWS Firewall Manager. If true, then only AWS Firewall Manager can delete the web ACL or any Firewall Manager rule groups in the web ACL. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var Name: EntityName = js.native
  
  /**
    * The last set of rules for AWS WAF to process in the web ACL. This is defined in an AWS Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized before these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.native
  
  /**
    * The first set of rules for AWS WAF to process in the web ACL. This is defined in an AWS Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized after these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.native
  
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.wafv2Mod.Rules] = js.native
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig = js.native
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
  implicit class WebACLOps[Self <: WebACL] (val x: Self) extends AnyVal {
    
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
    def setARN(value: ResourceArn): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAction(value: DefaultAction): Self = this.set("DefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: EntityId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = this.set("VisibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: ConsumedCapacity): Self = this.set("Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("Capacity", js.undefined)
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setManagedByFirewallManager(value: Boolean): Self = this.set("ManagedByFirewallManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedByFirewallManager: Self = this.set("ManagedByFirewallManager", js.undefined)
    
    @scala.inline
    def setPostProcessFirewallManagerRuleGroupsVarargs(value: FirewallManagerRuleGroup*): Self = this.set("PostProcessFirewallManagerRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setPostProcessFirewallManagerRuleGroups(value: FirewallManagerRuleGroups): Self = this.set("PostProcessFirewallManagerRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcessFirewallManagerRuleGroups: Self = this.set("PostProcessFirewallManagerRuleGroups", js.undefined)
    
    @scala.inline
    def setPreProcessFirewallManagerRuleGroupsVarargs(value: FirewallManagerRuleGroup*): Self = this.set("PreProcessFirewallManagerRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setPreProcessFirewallManagerRuleGroups(value: FirewallManagerRuleGroups): Self = this.set("PreProcessFirewallManagerRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreProcessFirewallManagerRuleGroups: Self = this.set("PreProcessFirewallManagerRuleGroups", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Rules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
