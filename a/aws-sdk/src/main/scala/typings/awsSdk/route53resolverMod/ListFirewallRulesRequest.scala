package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallRulesRequest extends StObject {
  
  /**
    * Optional additional filter for the rules to retrieve. The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list:    ALLOW - Permit the request to go through.    ALERT - Permit the request to go through but send an alert to the logs.    BLOCK - Disallow the request. If this is specified, additional handling details are provided in the rule's BlockResponse setting.   
    */
  var Action: js.UndefOr[typings.awsSdk.route53resolverMod.Action] = js.undefined
  
  /**
    * The unique identifier of the firewall rule group that you want to retrieve the rules for. 
    */
  var FirewallRuleGroupId: ResourceId
  
  /**
    * The maximum number of objects that you want Resolver to return for this request. If more objects are available, in the response, Resolver provides a NextToken value that you can use in a subsequent call to get the next batch of objects. If you don't specify a value for MaxResults, Resolver returns up to 100 objects. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.undefined
  
  /**
    * For the first call to this list request, omit this value. When you request a list of objects, Resolver returns at most the number of objects specified in MaxResults. If more objects are available for retrieval, Resolver returns a NextToken value in the response. To retrieve the next batch of objects, use the token that was returned for the prior request in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.undefined
  
  /**
    * Optional additional filter for the rules to retrieve. The setting that determines the processing order of the rules in a rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
    */
  var Priority: js.UndefOr[typings.awsSdk.route53resolverMod.Priority] = js.undefined
}
object ListFirewallRulesRequest {
  
  inline def apply(FirewallRuleGroupId: ResourceId): ListFirewallRulesRequest = {
    val __obj = js.Dynamic.literal(FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFirewallRulesRequest]
  }
  
  extension [Self <: ListFirewallRulesRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
