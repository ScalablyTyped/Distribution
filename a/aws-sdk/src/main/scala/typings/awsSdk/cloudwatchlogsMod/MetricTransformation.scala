package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricTransformation extends StObject {
  
  /**
    * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.undefined
  
  /**
    * The fields to use as dimensions for the metric. One metric filter can include as many as three dimensions.  Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not specify high-cardinality fields such as IPAddress or requestID as dimensions. Each different value found for a dimension is treated as a separate metric and accrues charges as a separate custom metric.  To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different name/value pairs for the dimensions that you have specified within a certain amount of time. You can also set up a billing alarm to alert you if your charges are higher than expected. For more information, see  Creating a Billing Alarm to Monitor Your Estimated Amazon Web Services Charges.  
    */
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  
  /**
    * The name of the CloudWatch metric.
    */
  var metricName: MetricName
  
  /**
    * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are similar. For more information, see Namespaces.
    */
  var metricNamespace: MetricNamespace
  
  /**
    * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
    */
  var metricValue: MetricValue
  
  /**
    * The unit to assign to the metric. If you omit this, the unit is set as None.
    */
  var unit: js.UndefOr[StandardUnit] = js.undefined
}
object MetricTransformation {
  
  inline def apply(metricName: MetricName, metricNamespace: MetricNamespace, metricValue: MetricValue): MetricTransformation = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTransformation]
  }
  
  extension [Self <: MetricTransformation](x: Self) {
    
    inline def setDefaultValue(value: DefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNamespace(value: MetricNamespace): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    inline def setMetricValue(value: MetricValue): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: StandardUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
