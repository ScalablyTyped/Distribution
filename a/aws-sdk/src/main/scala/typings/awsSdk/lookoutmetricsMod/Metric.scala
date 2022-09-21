package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    * The function with which the metric is calculated.
    */
  var AggregationFunction: typings.awsSdk.lookoutmetricsMod.AggregationFunction
  
  /**
    * The name of the metric.
    */
  var MetricName: ColumnName
  
  /**
    * The namespace for the metric.
    */
  var Namespace: js.UndefOr[typings.awsSdk.lookoutmetricsMod.Namespace] = js.undefined
}
object Metric {
  
  inline def apply(AggregationFunction: AggregationFunction, MetricName: ColumnName): Metric = {
    val __obj = js.Dynamic.literal(AggregationFunction = AggregationFunction.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  extension [Self <: Metric](x: Self) {
    
    inline def setAggregationFunction(value: AggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: ColumnName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
