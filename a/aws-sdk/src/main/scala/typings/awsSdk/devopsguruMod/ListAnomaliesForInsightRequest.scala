package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomaliesForInsightRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account. 
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    *  The ID of the insight. The returned anomalies belong to this insight. 
    */
  var InsightId: typings.awsSdk.devopsguruMod.InsightId
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListAnomaliesForInsightMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  A time range used to specify when the requested anomalies started. All returned anomalies started during this time range. 
    */
  var StartTimeRange: js.UndefOr[typings.awsSdk.devopsguruMod.StartTimeRange] = js.undefined
}
object ListAnomaliesForInsightRequest {
  
  inline def apply(InsightId: InsightId): ListAnomaliesForInsightRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnomaliesForInsightRequest]
  }
  
  extension [Self <: ListAnomaliesForInsightRequest](x: Self) {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListAnomaliesForInsightMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTimeRange(value: StartTimeRange): Self = StObject.set(x, "StartTimeRange", value.asInstanceOf[js.Any])
    
    inline def setStartTimeRangeUndefined: Self = StObject.set(x, "StartTimeRange", js.undefined)
  }
}
