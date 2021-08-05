package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersRequest extends StObject {
  
  /**
    * The ARN of the behavior graph for which to retrieve the list of member accounts.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn
  
  /**
    * The maximum number of member accounts to include in the response. The total must be less than the overall limit on the number of results to return, which is currently 200.
    */
  var MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined
  
  /**
    * For requests to retrieve the next page of member account results, the pagination token that was returned with the previous page of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMembersRequest {
  
  inline def apply(GraphArn: GraphArn): ListMembersRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
  
  extension [Self <: ListMembersRequest](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MemberResultsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
