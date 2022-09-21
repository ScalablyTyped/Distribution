package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSessionsRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
  
  /**
    * The maximum number of results to return per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The search expression to filter results.
    */
  var searchExpression: SearchExpression
}
object SearchSessionsRequest {
  
  inline def apply(assistantId: UuidOrArn, searchExpression: SearchExpression): SearchSessionsRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any], searchExpression = searchExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSessionsRequest]
  }
  
  extension [Self <: SearchSessionsRequest](x: Self) {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSearchExpression(value: SearchExpression): Self = StObject.set(x, "searchExpression", value.asInstanceOf[js.Any])
  }
}
