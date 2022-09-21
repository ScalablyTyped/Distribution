package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationRelatedCloudWatchMetricsSourceDetail extends StObject {
  
  /**
    * The name of the CloudWatch metric.
    */
  var MetricName: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceMetricName] = js.undefined
  
  /**
    * The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
    */
  var Namespace: js.UndefOr[RecommendationRelatedCloudWatchMetricsSourceNamespace] = js.undefined
}
object RecommendationRelatedCloudWatchMetricsSourceDetail {
  
  inline def apply(): RecommendationRelatedCloudWatchMetricsSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationRelatedCloudWatchMetricsSourceDetail]
  }
  
  extension [Self <: RecommendationRelatedCloudWatchMetricsSourceDetail](x: Self) {
    
    inline def setMetricName(value: RecommendationRelatedCloudWatchMetricsSourceMetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: RecommendationRelatedCloudWatchMetricsSourceNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
