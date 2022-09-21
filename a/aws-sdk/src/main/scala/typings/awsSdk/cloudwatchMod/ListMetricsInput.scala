package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricsInput extends StObject {
  
  /**
    * The dimensions to filter against. Only the dimensions that match exactly will be returned.
    */
  var Dimensions: js.UndefOr[DimensionFilters] = js.undefined
  
  /**
    * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
    */
  var MetricName: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricName] = js.undefined
  
  /**
    * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
    */
  var Namespace: js.UndefOr[typings.awsSdk.cloudwatchMod.Namespace] = js.undefined
  
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
  
  /**
    * To filter the results to show only metrics that have had data points published in the past three hours, specify this parameter with a value of PT3H. This is the only valid value for this parameter. The results that are returned are an approximation of the value you specify. There is a low probability that the returned results include metrics with last published data as much as 40 minutes more than the specified time interval.
    */
  var RecentlyActive: js.UndefOr[typings.awsSdk.cloudwatchMod.RecentlyActive] = js.undefined
}
object ListMetricsInput {
  
  inline def apply(): ListMetricsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsInput]
  }
  
  extension [Self <: ListMetricsInput](x: Self) {
    
    inline def setDimensions(value: DimensionFilters): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: DimensionFilter*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecentlyActive(value: RecentlyActive): Self = StObject.set(x, "RecentlyActive", value.asInstanceOf[js.Any])
    
    inline def setRecentlyActiveUndefined: Self = StObject.set(x, "RecentlyActive", js.undefined)
  }
}
