package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalySourceDetails extends StObject {
  
  /**
    * An array of CloudWatchMetricsDetail objects that contain information about analyzed CloudWatch metrics that show anomalous behavior. 
    */
  var CloudWatchMetrics: js.UndefOr[CloudWatchMetricsDetails] = js.undefined
  
  /**
    * An array of PerformanceInsightsMetricsDetail objects that contain information about analyzed Performance Insights metrics that show anomalous behavior.
    */
  var PerformanceInsightsMetrics: js.UndefOr[PerformanceInsightsMetricsDetails] = js.undefined
}
object AnomalySourceDetails {
  
  inline def apply(): AnomalySourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalySourceDetails]
  }
  
  extension [Self <: AnomalySourceDetails](x: Self) {
    
    inline def setCloudWatchMetrics(value: CloudWatchMetricsDetails): Self = StObject.set(x, "CloudWatchMetrics", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsUndefined: Self = StObject.set(x, "CloudWatchMetrics", js.undefined)
    
    inline def setCloudWatchMetricsVarargs(value: CloudWatchMetricsDetail*): Self = StObject.set(x, "CloudWatchMetrics", js.Array(value*))
    
    inline def setPerformanceInsightsMetrics(value: PerformanceInsightsMetricsDetails): Self = StObject.set(x, "PerformanceInsightsMetrics", value.asInstanceOf[js.Any])
    
    inline def setPerformanceInsightsMetricsUndefined: Self = StObject.set(x, "PerformanceInsightsMetrics", js.undefined)
    
    inline def setPerformanceInsightsMetricsVarargs(value: PerformanceInsightsMetricsDetail*): Self = StObject.set(x, "PerformanceInsightsMetrics", js.Array(value*))
  }
}
