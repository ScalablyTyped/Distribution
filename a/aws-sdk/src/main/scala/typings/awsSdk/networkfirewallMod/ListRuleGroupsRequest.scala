package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsRequest extends StObject {
  
  /**
    * The maximum number of objects that you want Network Firewall to return for this request. If more objects are available, in the response, Network Firewall provides a NextToken value that you can use in a subsequent call to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListRuleGroupsRequest {
  
  @scala.inline
  def apply(): ListRuleGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsRequest]
  }
  
  @scala.inline
  implicit class ListRuleGroupsRequestMutableBuilder[Self <: ListRuleGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
