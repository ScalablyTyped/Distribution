package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricInfo extends StObject {
  
  /**
    * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific characteristics that describe it, and you can think of dimensions as categories for those characteristics. These dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
    */
  var MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition] = js.native
  
  /**
    * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
    */
  var MetricName: js.UndefOr[QuotaMetricName] = js.native
  
  /**
    * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the namespace when you create a metric.
    */
  var MetricNamespace: js.UndefOr[QuotaMetricNamespace] = js.native
  
  /**
    * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use when comparing usage in the CloudWatch Metric against your Service Quota.
    */
  var MetricStatisticRecommendation: js.UndefOr[Statistic] = js.native
}
object MetricInfo {
  
  @scala.inline
  def apply(): MetricInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricInfo]
  }
  
  @scala.inline
  implicit class MetricInfoMutableBuilder[Self <: MetricInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricDimensions(value: MetricDimensionsMapDefinition): Self = StObject.set(x, "MetricDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDimensionsUndefined: Self = StObject.set(x, "MetricDimensions", js.undefined)
    
    @scala.inline
    def setMetricName(value: QuotaMetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setMetricNamespace(value: QuotaMetricNamespace): Self = StObject.set(x, "MetricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamespaceUndefined: Self = StObject.set(x, "MetricNamespace", js.undefined)
    
    @scala.inline
    def setMetricStatisticRecommendation(value: Statistic): Self = StObject.set(x, "MetricStatisticRecommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricStatisticRecommendationUndefined: Self = StObject.set(x, "MetricStatisticRecommendation", js.undefined)
  }
}
