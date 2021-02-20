package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFirewallPoliciesResponse extends StObject {
  
  /**
    * The metadata for the firewall policies. Depending on your setting for max results and the number of firewall policies that you have, this might not be the full list. 
    */
  var FirewallPolicies: js.UndefOr[typings.awsSdk.networkfirewallMod.FirewallPolicies] = js.native
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListFirewallPoliciesResponse {
  
  @scala.inline
  def apply(): ListFirewallPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListFirewallPoliciesResponseMutableBuilder[Self <: ListFirewallPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallPolicies(value: FirewallPolicies): Self = StObject.set(x, "FirewallPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPoliciesUndefined: Self = StObject.set(x, "FirewallPolicies", js.undefined)
    
    @scala.inline
    def setFirewallPoliciesVarargs(value: FirewallPolicyMetadata*): Self = StObject.set(x, "FirewallPolicies", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
