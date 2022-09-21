package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingAggregationsRequest extends StObject {
  
  /**
    * The Amazon Web Services account IDs to retrieve finding aggregation data for.
    */
  var accountIds: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Details of the aggregation request that is used to filter your aggregation results.
    */
  var aggregationRequest: js.UndefOr[AggregationRequest] = js.undefined
  
  /**
    * The type of the aggregation request.
    */
  var aggregationType: AggregationType
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListFindingAggregationsMaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFindingAggregationsRequest {
  
  inline def apply(aggregationType: AggregationType): ListFindingAggregationsRequest = {
    val __obj = js.Dynamic.literal(aggregationType = aggregationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingAggregationsRequest]
  }
  
  extension [Self <: ListFindingAggregationsRequest](x: Self) {
    
    inline def setAccountIds(value: StringFilterList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: StringFilter*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setAggregationRequest(value: AggregationRequest): Self = StObject.set(x, "aggregationRequest", value.asInstanceOf[js.Any])
    
    inline def setAggregationRequestUndefined: Self = StObject.set(x, "aggregationRequest", js.undefined)
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListFindingAggregationsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
