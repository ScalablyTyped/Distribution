package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleGroupMetadataResponse extends StObject {
  
  /**
    * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy, Network Firewall reserves this capacity for the rule group.  You can retrieve the capacity that would be required for a rule group before you create the rule group by calling CreateRuleGroup with DryRun set to TRUE. 
    */
  var Capacity: js.UndefOr[RuleCapacity] = js.undefined
  
  /**
    * Returns the metadata objects for the specified rule group. 
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.undefined
  
  /**
    * The last time that the rule group was changed.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupArn: ResourceArn
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupName: ResourceName
  
  var StatefulRuleOptions: js.UndefOr[typings.awsSdk.networkfirewallMod.StatefulRuleOptions] = js.undefined
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules.   This setting is required for requests that do not include the RuleGroupARN. 
    */
  var Type: js.UndefOr[RuleGroupType] = js.undefined
}
object DescribeRuleGroupMetadataResponse {
  
  inline def apply(RuleGroupArn: ResourceArn, RuleGroupName: ResourceName): DescribeRuleGroupMetadataResponse = {
    val __obj = js.Dynamic.literal(RuleGroupArn = RuleGroupArn.asInstanceOf[js.Any], RuleGroupName = RuleGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleGroupMetadataResponse]
  }
  
  extension [Self <: DescribeRuleGroupMetadataResponse](x: Self) {
    
    inline def setCapacity(value: RuleCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupName(value: ResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleOptions(value: StatefulRuleOptions): Self = StObject.set(x, "StatefulRuleOptions", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleOptionsUndefined: Self = StObject.set(x, "StatefulRuleOptions", js.undefined)
    
    inline def setType(value: RuleGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
