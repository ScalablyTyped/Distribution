package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricDataResponse extends StObject {
  
  /**
    * Information about the historical metrics. If no grouping is specified, a summary of metric data is returned.
    */
  var MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
}
object GetMetricDataResponse {
  
  inline def apply(): GetMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataResponse]
  }
  
  extension [Self <: GetMetricDataResponse](x: Self) {
    
    inline def setMetricResults(value: HistoricalMetricResults): Self = StObject.set(x, "MetricResults", value.asInstanceOf[js.Any])
    
    inline def setMetricResultsUndefined: Self = StObject.set(x, "MetricResults", js.undefined)
    
    inline def setMetricResultsVarargs(value: HistoricalMetricResult*): Self = StObject.set(x, "MetricResults", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
