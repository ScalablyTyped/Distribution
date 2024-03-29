package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebACL extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
    */
  var ARN: ResourceArn
  
  /**
    * Specifies custom configurations for the associations between the web ACL and protected resources.  Use this to customize the maximum size of the request body that your protected CloudFront distributions forward to WAF for inspection. The default is 16 KB (16,384 kilobytes).   You are charged additional fees when your protected resources forward body sizes that are larger than the default. For more information, see WAF Pricing. 
    */
  var AssociationConfig: js.UndefOr[typings.awsSdk.clientsWafv2Mod.AssociationConfig] = js.undefined
  
  /**
    * The web ACL capacity units (WCUs) currently being used by this web ACL.  WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. For more information, see WAF web ACL capacity units (WCU) in the WAF Developer Guide. 
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.undefined
  
  /**
    * Specifies how WAF should handle CAPTCHA evaluations for rules that don't have their own CaptchaConfig settings. If you don't specify this, WAF uses its default settings for CaptchaConfig. 
    */
  var CaptchaConfig: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CaptchaConfig] = js.undefined
  
  /**
    * Specifies how WAF should handle challenge evaluations for rules that don't have their own ChallengeConfig settings. If you don't specify this, WAF uses its default settings for ChallengeConfig. 
    */
  var ChallengeConfig: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ChallengeConfig] = js.undefined
  
  /**
    * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a custom response to the web request. You define these for the web ACL, and then use them in the rules and default actions that you define in the web ACL.  For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide.  For information about the limits on count and size for custom request and response settings, see WAF quotas in the WAF Developer Guide. 
    */
  var CustomResponseBodies: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CustomResponseBodies] = js.undefined
  
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typings.awsSdk.clientsWafv2Mod.DefaultAction
  
  /**
    * A description of the web ACL that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the WebACL. This ID is returned in the responses to create and list commands. You use this ID to do things like get, update, and delete a WebACL.
    */
  var Id: EntityId
  
  /**
    * The label namespace prefix for this web ACL. All labels added by rules in this web ACL have this prefix.    The syntax for the label namespace prefix for a web ACL is the following:   awswaf:&lt;account ID&gt;:webacl:&lt;web ACL name&gt;:    When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and the label from the rule, separated by a colon:   &lt;label namespace&gt;:&lt;label from rule&gt;   
    */
  var LabelNamespace: js.UndefOr[LabelName] = js.undefined
  
  /**
    * Indicates whether this web ACL is managed by Firewall Manager. If true, then only Firewall Manager can delete the web ACL or any Firewall Manager rule groups in the web ACL. 
    */
  var ManagedByFirewallManager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the web ACL. You cannot change the name of a web ACL after you create it.
    */
  var Name: EntityName
  
  /**
    * The last set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized before these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PostProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined
  
  /**
    * The first set of rules for WAF to process in the web ACL. This is defined in an Firewall Manager WAF policy and contains only rule group references. You can't alter these. Any rules and rule groups that you define for the web ACL are prioritized after these.  In the Firewall Manager WAF policy, the Firewall Manager administrator can define a set of rule groups to run first in the web ACL and a set of rule groups to run last. Within each set, the administrator prioritizes the rule groups, to determine their relative processing order.
    */
  var PreProcessFirewallManagerRuleGroups: js.UndefOr[FirewallManagerRuleGroups] = js.undefined
  
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Rules] = js.undefined
  
  /**
    * Specifies the domains that WAF should accept in a web request token. This enables the use of tokens across multiple protected websites. When WAF provides a token, it uses the domain of the Amazon Web Services resource that the web ACL is protecting. If you don't specify a list of token domains, WAF accepts tokens only for the domain of the protected resource. With a token domain list, WAF accepts the resource's host domain plus all domains in the token domain list, including their prefixed subdomains.
    */
  var TokenDomains: js.UndefOr[typings.awsSdk.clientsWafv2Mod.TokenDomains] = js.undefined
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.clientsWafv2Mod.VisibilityConfig
}
object WebACL {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: WebACL] (val x: Self) extends AnyVal {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setAssociationConfig(value: AssociationConfig): Self = StObject.set(x, "AssociationConfig", value.asInstanceOf[js.Any])
    
    inline def setAssociationConfigUndefined: Self = StObject.set(x, "AssociationConfig", js.undefined)
    
    inline def setCapacity(value: ConsumedCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setCaptchaConfig(value: CaptchaConfig): Self = StObject.set(x, "CaptchaConfig", value.asInstanceOf[js.Any])
    
    inline def setCaptchaConfigUndefined: Self = StObject.set(x, "CaptchaConfig", js.undefined)
    
    inline def setChallengeConfig(value: ChallengeConfig): Self = StObject.set(x, "ChallengeConfig", value.asInstanceOf[js.Any])
    
    inline def setChallengeConfigUndefined: Self = StObject.set(x, "ChallengeConfig", js.undefined)
    
    inline def setCustomResponseBodies(value: CustomResponseBodies): Self = StObject.set(x, "CustomResponseBodies", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseBodiesUndefined: Self = StObject.set(x, "CustomResponseBodies", js.undefined)
    
    inline def setDefaultAction(value: DefaultAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespace(value: LabelName): Self = StObject.set(x, "LabelNamespace", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespaceUndefined: Self = StObject.set(x, "LabelNamespace", js.undefined)
    
    inline def setManagedByFirewallManager(value: Boolean): Self = StObject.set(x, "ManagedByFirewallManager", value.asInstanceOf[js.Any])
    
    inline def setManagedByFirewallManagerUndefined: Self = StObject.set(x, "ManagedByFirewallManager", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPostProcessFirewallManagerRuleGroups(value: FirewallManagerRuleGroups): Self = StObject.set(x, "PostProcessFirewallManagerRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setPostProcessFirewallManagerRuleGroupsUndefined: Self = StObject.set(x, "PostProcessFirewallManagerRuleGroups", js.undefined)
    
    inline def setPostProcessFirewallManagerRuleGroupsVarargs(value: FirewallManagerRuleGroup*): Self = StObject.set(x, "PostProcessFirewallManagerRuleGroups", js.Array(value*))
    
    inline def setPreProcessFirewallManagerRuleGroups(value: FirewallManagerRuleGroups): Self = StObject.set(x, "PreProcessFirewallManagerRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setPreProcessFirewallManagerRuleGroupsUndefined: Self = StObject.set(x, "PreProcessFirewallManagerRuleGroups", js.undefined)
    
    inline def setPreProcessFirewallManagerRuleGroupsVarargs(value: FirewallManagerRuleGroup*): Self = StObject.set(x, "PreProcessFirewallManagerRuleGroups", js.Array(value*))
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setTokenDomains(value: TokenDomains): Self = StObject.set(x, "TokenDomains", value.asInstanceOf[js.Any])
    
    inline def setTokenDomainsUndefined: Self = StObject.set(x, "TokenDomains", js.undefined)
    
    inline def setTokenDomainsVarargs(value: TokenDomain*): Self = StObject.set(x, "TokenDomains", js.Array(value*))
    
    inline def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
