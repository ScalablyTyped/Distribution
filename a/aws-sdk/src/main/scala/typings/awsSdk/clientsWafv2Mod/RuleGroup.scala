package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn
  
  /**
    * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in the RuleLabels for a Rule.
    */
  var AvailableLabels: js.UndefOr[LabelSummaries] = js.undefined
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. When you create your own rule group, you define this, and you cannot change it after creation. When you add or modify the rules in a rule group, WAF enforces this limit. You can check the capacity for a set of rules using CheckCapacity. WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: CapacityUnit
  
  /**
    * The labels that one or more rules in this rule group match against in label match statements. These labels are defined in a LabelMatchStatement specification, in the Statement definition of a rule. 
    */
  var ConsumedLabels: js.UndefOr[LabelSummaries] = js.undefined
  
  /**
    * A map of custom response keys and content bodies. When you create a rule with a block action, you can send a custom response to the web request. You define these for the rule group, and then use them in the rules that you define in the rule group.  For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide.  For information about the limits on count and size for custom request and response settings, see WAF quotas in the WAF Developer Guide. 
    */
  var CustomResponseBodies: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CustomResponseBodies] = js.undefined
  
  /**
    * A description of the rule group that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId
  
  /**
    * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.    The syntax for the label namespace prefix for your rule groups is the following:   awswaf:&lt;account ID&gt;:rulegroup:&lt;rule group name&gt;:    When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and the label from the rule, separated by a colon:   &lt;label namespace&gt;:&lt;label from rule&gt;   
    */
  var LabelNamespace: js.UndefOr[LabelName] = js.undefined
  
  /**
    * The name of the rule group. You cannot change the name of a rule group after you create it.
    */
  var Name: EntityName
  
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Rules] = js.undefined
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.clientsWafv2Mod.VisibilityConfig
}
object RuleGroup {
  
  inline def apply(
    ARN: ResourceArn,
    Capacity: CapacityUnit,
    Id: EntityId,
    Name: EntityName,
    VisibilityConfig: VisibilityConfig
  ): RuleGroup = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Capacity = Capacity.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroup]
  }
  
  extension [Self <: RuleGroup](x: Self) {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setAvailableLabels(value: LabelSummaries): Self = StObject.set(x, "AvailableLabels", value.asInstanceOf[js.Any])
    
    inline def setAvailableLabelsUndefined: Self = StObject.set(x, "AvailableLabels", js.undefined)
    
    inline def setAvailableLabelsVarargs(value: LabelSummary*): Self = StObject.set(x, "AvailableLabels", js.Array(value*))
    
    inline def setCapacity(value: CapacityUnit): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedLabels(value: LabelSummaries): Self = StObject.set(x, "ConsumedLabels", value.asInstanceOf[js.Any])
    
    inline def setConsumedLabelsUndefined: Self = StObject.set(x, "ConsumedLabels", js.undefined)
    
    inline def setConsumedLabelsVarargs(value: LabelSummary*): Self = StObject.set(x, "ConsumedLabels", js.Array(value*))
    
    inline def setCustomResponseBodies(value: CustomResponseBodies): Self = StObject.set(x, "CustomResponseBodies", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseBodiesUndefined: Self = StObject.set(x, "CustomResponseBodies", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespace(value: LabelName): Self = StObject.set(x, "LabelNamespace", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespaceUndefined: Self = StObject.set(x, "LabelNamespace", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
