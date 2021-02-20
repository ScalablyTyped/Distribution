package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricTransformation extends StObject {
  
  /**
    * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.native
  
  /**
    * The name of the CloudWatch metric.
    */
  var metricName: MetricName = js.native
  
  /**
    * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are similar. For more information, see Namespaces.
    */
  var metricNamespace: MetricNamespace = js.native
  
  /**
    * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
    */
  var metricValue: MetricValue = js.native
}
object MetricTransformation {
  
  @scala.inline
  def apply(metricName: MetricName, metricNamespace: MetricNamespace, metricValue: MetricValue): MetricTransformation = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTransformation]
  }
  
  @scala.inline
  implicit class MetricTransformationMutableBuilder[Self <: MetricTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: DefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamespace(value: MetricNamespace): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricValue(value: MetricValue): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
  }
}
