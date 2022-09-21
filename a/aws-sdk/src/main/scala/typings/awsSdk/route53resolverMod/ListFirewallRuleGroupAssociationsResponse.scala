package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallRuleGroupAssociationsResponse extends StObject {
  
  /**
    * A list of your firewall rule group associations. This might be a partial list of the associations that you have defined. For information, see MaxResults. 
    */
  var FirewallRuleGroupAssociations: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallRuleGroupAssociations] = js.undefined
  
  /**
    * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next batch of objects, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.undefined
}
object ListFirewallRuleGroupAssociationsResponse {
  
  inline def apply(): ListFirewallRuleGroupAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallRuleGroupAssociationsResponse]
  }
  
  extension [Self <: ListFirewallRuleGroupAssociationsResponse](x: Self) {
    
    inline def setFirewallRuleGroupAssociations(value: FirewallRuleGroupAssociations): Self = StObject.set(x, "FirewallRuleGroupAssociations", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationsUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociations", js.undefined)
    
    inline def setFirewallRuleGroupAssociationsVarargs(value: FirewallRuleGroupAssociation*): Self = StObject.set(x, "FirewallRuleGroupAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
