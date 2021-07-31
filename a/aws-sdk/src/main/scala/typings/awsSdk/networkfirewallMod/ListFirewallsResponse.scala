package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallsResponse extends StObject {
  
  /**
    * The firewall metadata objects for the VPCs that you specified. Depending on your setting for max results and the number of firewalls you have, a single call might not be the full list. 
    */
  var Firewalls: js.UndefOr[typings.awsSdk.networkfirewallMod.Firewalls] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListFirewallsResponse {
  
  @scala.inline
  def apply(): ListFirewallsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallsResponse]
  }
  
  @scala.inline
  implicit class ListFirewallsResponseMutableBuilder[Self <: ListFirewallsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewalls(value: Firewalls): Self = StObject.set(x, "Firewalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallsUndefined: Self = StObject.set(x, "Firewalls", js.undefined)
    
    @scala.inline
    def setFirewallsVarargs(value: FirewallMetadata*): Self = StObject.set(x, "Firewalls", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
