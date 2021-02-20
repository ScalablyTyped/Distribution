package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFirewallsRequest extends StObject {
  
  /**
    * The maximum number of objects that you want Network Firewall to return for this request. If more objects are available, in the response, Network Firewall provides a NextToken value that you can use in a subsequent call to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The unique identifiers of the VPCs that you want Network Firewall to retrieve the firewalls for. Leave this blank to retrieve all firewalls that you have defined.
    */
  var VpcIds: js.UndefOr[typings.awsSdk.networkfirewallMod.VpcIds] = js.native
}
object ListFirewallsRequest {
  
  @scala.inline
  def apply(): ListFirewallsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallsRequest]
  }
  
  @scala.inline
  implicit class ListFirewallsRequestMutableBuilder[Self <: ListFirewallsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcIds(value: VpcIds): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    @scala.inline
    def setVpcIdsVarargs(value: VpcId*): Self = StObject.set(x, "VpcIds", js.Array(value :_*))
  }
}
