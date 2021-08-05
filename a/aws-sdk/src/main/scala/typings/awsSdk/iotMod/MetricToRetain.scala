package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricToRetain extends StObject {
  
  /**
    * What is measured by the behavior.
    */
  var metric: BehaviorMetric
  
  /**
    * The dimension of a metric.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.undefined
}
object MetricToRetain {
  
  inline def apply(metric: BehaviorMetric): MetricToRetain = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricToRetain]
  }
  
  extension [Self <: MetricToRetain](x: Self) {
    
    inline def setMetric(value: BehaviorMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricDimension(value: MetricDimension): Self = StObject.set(x, "metricDimension", value.asInstanceOf[js.Any])
    
    inline def setMetricDimensionUndefined: Self = StObject.set(x, "metricDimension", js.undefined)
  }
}
