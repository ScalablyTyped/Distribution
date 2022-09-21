package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallRuleGroupAssociationsRequest extends StObject {
  
  /**
    * The unique identifier of the firewall rule group that you want to retrieve the associations for. Leave this blank to retrieve associations for any rule group. 
    */
  var FirewallRuleGroupId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The maximum number of objects that you want Resolver to return for this request. If more objects are available, in the response, Resolver provides a NextToken value that you can use in a subsequent call to get the next batch of objects. If you don't specify a value for MaxResults, Resolver returns up to 100 objects. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.undefined
  
  /**
    * For the first call to this list request, omit this value. When you request a list of objects, Resolver returns at most the number of objects specified in MaxResults. If more objects are available for retrieval, Resolver returns a NextToken value in the response. To retrieve the next batch of objects, use the token that was returned for the prior request in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.undefined
  
  /**
    * The setting that determines the processing order of the rule group among the rule groups that are associated with a single VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting. 
    */
  var Priority: js.UndefOr[typings.awsSdk.route53resolverMod.Priority] = js.undefined
  
  /**
    * The association Status setting that you want DNS Firewall to filter on for the list. If you don't specify this, then DNS Firewall returns all associations, regardless of status.
    */
  var Status: js.UndefOr[FirewallRuleGroupAssociationStatus] = js.undefined
  
  /**
    * The unique identifier of the VPC that you want to retrieve the associations for. Leave this blank to retrieve associations for any VPC. 
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object ListFirewallRuleGroupAssociationsRequest {
  
  inline def apply(): ListFirewallRuleGroupAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallRuleGroupAssociationsRequest]
  }
  
  extension [Self <: ListFirewallRuleGroupAssociationsRequest](x: Self) {
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupIdUndefined: Self = StObject.set(x, "FirewallRuleGroupId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setStatus(value: FirewallRuleGroupAssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
