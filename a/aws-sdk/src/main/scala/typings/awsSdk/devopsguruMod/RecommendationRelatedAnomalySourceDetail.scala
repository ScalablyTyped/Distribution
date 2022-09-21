package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationRelatedAnomalySourceDetail extends StObject {
  
  /**
    *  An array of CloudWatchMetricsDetail objects that contains information about the analyzed metrics that displayed anomalous behavior. 
    */
  var CloudWatchMetrics: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceDetails] = js.undefined
}
object RecommendationRelatedAnomalySourceDetail {
  
  inline def apply(): RecommendationRelatedAnomalySourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationRelatedAnomalySourceDetail]
  }
  
  extension [Self <: RecommendationRelatedAnomalySourceDetail](x: Self) {
    
    inline def setCloudWatchMetrics(value: RecommendationRelatedCloudWatchMetricsSourceDetails): Self = StObject.set(x, "CloudWatchMetrics", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsUndefined: Self = StObject.set(x, "CloudWatchMetrics", js.undefined)
    
    inline def setCloudWatchMetricsVarargs(value: RecommendationRelatedCloudWatchMetricsSourceDetail*): Self = StObject.set(x, "CloudWatchMetrics", js.Array(value*))
  }
}
