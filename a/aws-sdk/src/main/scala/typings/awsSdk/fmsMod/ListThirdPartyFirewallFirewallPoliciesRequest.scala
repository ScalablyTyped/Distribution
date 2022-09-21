package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThirdPartyFirewallFirewallPoliciesRequest extends StObject {
  
  /**
    * The maximum number of third-party firewall policies that you want Firewall Manager to return. If the specified third-party firewall vendor is associated with more than MaxResults firewall policies, the response includes a NextToken element. NextToken contains an encrypted token that identifies the first third-party firewall policies that Firewall Manager will return if you submit another request.
    */
  var MaxResults: PaginationMaxResults
  
  /**
    * If the previous response included a NextToken element, the specified third-party firewall vendor is associated with more third-party firewall policies. To get more third-party firewall policies, submit another ListThirdPartyFirewallFirewallPoliciesRequest request.  For the value of NextToken, specify the value of NextToken from the previous response. If the previous response didn't include a NextToken element, there are no more third-party firewall policies to get. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the third-party firewall vendor.
    */
  var ThirdPartyFirewall: typings.awsSdk.fmsMod.ThirdPartyFirewall
}
object ListThirdPartyFirewallFirewallPoliciesRequest {
  
  inline def apply(MaxResults: PaginationMaxResults, ThirdPartyFirewall: ThirdPartyFirewall): ListThirdPartyFirewallFirewallPoliciesRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any], ThirdPartyFirewall = ThirdPartyFirewall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThirdPartyFirewallFirewallPoliciesRequest]
  }
  
  extension [Self <: ListThirdPartyFirewallFirewallPoliciesRequest](x: Self) {
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setThirdPartyFirewall(value: ThirdPartyFirewall): Self = StObject.set(x, "ThirdPartyFirewall", value.asInstanceOf[js.Any])
  }
}
