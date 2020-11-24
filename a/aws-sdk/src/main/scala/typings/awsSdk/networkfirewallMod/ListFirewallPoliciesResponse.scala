package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFirewallPoliciesResponse extends js.Object {
  
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
  implicit class ListFirewallPoliciesResponseOps[Self <: ListFirewallPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirewallPoliciesVarargs(value: FirewallPolicyMetadata*): Self = this.set("FirewallPolicies", js.Array(value :_*))
    
    @scala.inline
    def setFirewallPolicies(value: FirewallPolicies): Self = this.set("FirewallPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicies: Self = this.set("FirewallPolicies", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
