package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomMetricRequest extends StObject {
  
  /**
    *  Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't use this name as the metric identifier in the device metric report. Can be updated. 
    */
  var displayName: CustomMetricDisplayName
  
  /**
    *  The name of the custom metric. Cannot be updated. 
    */
  var metricName: MetricName
}
object UpdateCustomMetricRequest {
  
  inline def apply(displayName: CustomMetricDisplayName, metricName: MetricName): UpdateCustomMetricRequest = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomMetricRequest]
  }
  
  extension [Self <: UpdateCustomMetricRequest](x: Self) {
    
    inline def setDisplayName(value: CustomMetricDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
