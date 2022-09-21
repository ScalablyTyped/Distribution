package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPredictorBacktestExportJobsRequest extends StObject {
  
  /**
    * An array of filters. For each filter, provide a condition and a match statement. The condition is either IS or IS_NOT, which specifies whether to include or exclude the predictor backtest export jobs that match the statement from the list. The match statement consists of a key and a value.  Filter properties     Condition - The condition to apply. Valid values are IS and IS_NOT. To include the predictor backtest export jobs that match the statement, specify IS. To exclude matching predictor backtest export jobs, specify IS_NOT.    Key - The name of the parameter to filter on. Valid values are PredictorArn and Status.    Value - The value to match.  
    */
  var Filters: js.UndefOr[typings.awsSdk.forecastserviceMod.Filters] = js.undefined
  
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.forecastserviceMod.MaxResults] = js.undefined
  
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
}
object ListPredictorBacktestExportJobsRequest {
  
  inline def apply(): ListPredictorBacktestExportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorBacktestExportJobsRequest]
  }
  
  extension [Self <: ListPredictorBacktestExportJobsRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
