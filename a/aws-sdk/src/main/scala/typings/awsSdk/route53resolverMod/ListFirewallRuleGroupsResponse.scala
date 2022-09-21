package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallRuleGroupsResponse extends StObject {
  
  /**
    * A list of your firewall rule groups. This might be a partial list of the rule groups that you have defined. For information, see MaxResults. 
    */
  var FirewallRuleGroups: js.UndefOr[FirewallRuleGroupMetadataList] = js.undefined
  
  /**
    * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next batch of objects, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.undefined
}
object ListFirewallRuleGroupsResponse {
  
  inline def apply(): ListFirewallRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallRuleGroupsResponse]
  }
  
  extension [Self <: ListFirewallRuleGroupsResponse](x: Self) {
    
    inline def setFirewallRuleGroups(value: FirewallRuleGroupMetadataList): Self = StObject.set(x, "FirewallRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupsUndefined: Self = StObject.set(x, "FirewallRuleGroups", js.undefined)
    
    inline def setFirewallRuleGroupsVarargs(value: FirewallRuleGroupMetadata*): Self = StObject.set(x, "FirewallRuleGroups", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
