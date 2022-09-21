package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsRequest extends StObject {
  
  /**
    * Indicates the general category of the Amazon Web Services managed rule group.
    */
  var ManagedType: js.UndefOr[ResourceManagedType] = js.undefined
  
  /**
    * The maximum number of objects that you want Network Firewall to return for this request. If more objects are available, in the response, Network Firewall provides a NextToken value that you can use in a subsequent call to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The scope of the request. The default setting of ACCOUNT or a setting of NULL returns all of the rule groups in your account. A setting of MANAGED returns all available managed rule groups.
    */
  var Scope: js.UndefOr[ResourceManagedStatus] = js.undefined
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules.
    */
  var Type: js.UndefOr[RuleGroupType] = js.undefined
}
object ListRuleGroupsRequest {
  
  inline def apply(): ListRuleGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsRequest]
  }
  
  extension [Self <: ListRuleGroupsRequest](x: Self) {
    
    inline def setManagedType(value: ResourceManagedType): Self = StObject.set(x, "ManagedType", value.asInstanceOf[js.Any])
    
    inline def setManagedTypeUndefined: Self = StObject.set(x, "ManagedType", js.undefined)
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScope(value: ResourceManagedStatus): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setType(value: RuleGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
