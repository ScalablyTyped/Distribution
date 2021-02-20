package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricDataResponse extends StObject {
  
  /**
    * Information about the historical metrics. If no grouping is specified, a summary of metric data is returned.
    */
  var MetricResults: js.UndefOr[HistoricalMetricResults] = js.native
  
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}
object GetMetricDataResponse {
  
  @scala.inline
  def apply(): GetMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataResponse]
  }
  
  @scala.inline
  implicit class GetMetricDataResponseMutableBuilder[Self <: GetMetricDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricResults(value: HistoricalMetricResults): Self = StObject.set(x, "MetricResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricResultsUndefined: Self = StObject.set(x, "MetricResults", js.undefined)
    
    @scala.inline
    def setMetricResultsVarargs(value: HistoricalMetricResult*): Self = StObject.set(x, "MetricResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
