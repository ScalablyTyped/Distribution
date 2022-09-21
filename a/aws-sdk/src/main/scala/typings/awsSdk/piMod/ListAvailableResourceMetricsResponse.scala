package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableResourceMetricsResponse extends StObject {
  
  /**
    * An array of metrics available to query. Each array element contains the full name, description, and unit of the metric. 
    */
  var Metrics: js.UndefOr[ResponseResourceMetricList] = js.undefined
  
  /**
    * A pagination token that indicates the response didn’t return all available records because MaxRecords was specified in the previous request. To get the remaining records, specify NextToken in a separate request with this value. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.piMod.NextToken] = js.undefined
}
object ListAvailableResourceMetricsResponse {
  
  inline def apply(): ListAvailableResourceMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableResourceMetricsResponse]
  }
  
  extension [Self <: ListAvailableResourceMetricsResponse](x: Self) {
    
    inline def setMetrics(value: ResponseResourceMetricList): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: ResponseResourceMetric*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
