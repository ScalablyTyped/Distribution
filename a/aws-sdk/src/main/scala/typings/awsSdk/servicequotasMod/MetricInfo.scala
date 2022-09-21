package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricInfo extends StObject {
  
  /**
    * The metric dimension. This is a name/value pair that is part of the identity of a metric.
    */
  var MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition] = js.undefined
  
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[QuotaMetricName] = js.undefined
  
  /**
    * The namespace of the metric.
    */
  var MetricNamespace: js.UndefOr[QuotaMetricNamespace] = js.undefined
  
  /**
    * The metric statistic that we recommend you use when determining quota usage.
    */
  var MetricStatisticRecommendation: js.UndefOr[Statistic] = js.undefined
}
object MetricInfo {
  
  inline def apply(): MetricInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricInfo]
  }
  
  extension [Self <: MetricInfo](x: Self) {
    
    inline def setMetricDimensions(value: MetricDimensionsMapDefinition): Self = StObject.set(x, "MetricDimensions", value.asInstanceOf[js.Any])
    
    inline def setMetricDimensionsUndefined: Self = StObject.set(x, "MetricDimensions", js.undefined)
    
    inline def setMetricName(value: QuotaMetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setMetricNamespace(value: QuotaMetricNamespace): Self = StObject.set(x, "MetricNamespace", value.asInstanceOf[js.Any])
    
    inline def setMetricNamespaceUndefined: Self = StObject.set(x, "MetricNamespace", js.undefined)
    
    inline def setMetricStatisticRecommendation(value: Statistic): Self = StObject.set(x, "MetricStatisticRecommendation", value.asInstanceOf[js.Any])
    
    inline def setMetricStatisticRecommendationUndefined: Self = StObject.set(x, "MetricStatisticRecommendation", js.undefined)
  }
}
