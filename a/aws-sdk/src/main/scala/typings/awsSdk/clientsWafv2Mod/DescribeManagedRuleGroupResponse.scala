package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeManagedRuleGroupResponse extends StObject {
  
  /**
    * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in the RuleLabels for a Rule.
    */
  var AvailableLabels: js.UndefOr[LabelSummaries] = js.undefined
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[CapacityUnit] = js.undefined
  
  /**
    * The labels that one or more rules in this rule group match against in label match statements. These labels are defined in a LabelMatchStatement specification, in the Statement definition of a rule. 
    */
  var ConsumedLabels: js.UndefOr[LabelSummaries] = js.undefined
  
  /**
    * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.    The syntax for the label namespace prefix for a managed rule group is the following:   awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;:   When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and the label from the rule, separated by a colon:   &lt;label namespace&gt;:&lt;label from rule&gt;   
    */
  var LabelNamespace: js.UndefOr[LabelName] = js.undefined
  
  /**
    * 
    */
  var Rules: js.UndefOr[RuleSummaries] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to record changes to the managed rule group. You can subscribe to the SNS topic to receive notifications when the managed rule group is modified, such as for new versions and for version expiration. For more information, see the Amazon Simple Notification Service Developer Guide.
    */
  var SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The managed rule group's version. 
    */
  var VersionName: js.UndefOr[VersionKeyString] = js.undefined
}
object DescribeManagedRuleGroupResponse {
  
  inline def apply(): DescribeManagedRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedRuleGroupResponse]
  }
  
  extension [Self <: DescribeManagedRuleGroupResponse](x: Self) {
    
    inline def setAvailableLabels(value: LabelSummaries): Self = StObject.set(x, "AvailableLabels", value.asInstanceOf[js.Any])
    
    inline def setAvailableLabelsUndefined: Self = StObject.set(x, "AvailableLabels", js.undefined)
    
    inline def setAvailableLabelsVarargs(value: LabelSummary*): Self = StObject.set(x, "AvailableLabels", js.Array(value*))
    
    inline def setCapacity(value: CapacityUnit): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setConsumedLabels(value: LabelSummaries): Self = StObject.set(x, "ConsumedLabels", value.asInstanceOf[js.Any])
    
    inline def setConsumedLabelsUndefined: Self = StObject.set(x, "ConsumedLabels", js.undefined)
    
    inline def setConsumedLabelsVarargs(value: LabelSummary*): Self = StObject.set(x, "ConsumedLabels", js.Array(value*))
    
    inline def setLabelNamespace(value: LabelName): Self = StObject.set(x, "LabelNamespace", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespaceUndefined: Self = StObject.set(x, "LabelNamespace", js.undefined)
    
    inline def setRules(value: RuleSummaries): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleSummary*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setSnsTopicArn(value: ResourceArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setVersionName(value: VersionKeyString): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
