package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomMetricRequest extends StObject {
  
  /**
    *  The name of the custom metric. 
    */
  var metricName: MetricName
}
object DescribeCustomMetricRequest {
  
  inline def apply(metricName: MetricName): DescribeCustomMetricRequest = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomMetricRequest]
  }
  
  extension [Self <: DescribeCustomMetricRequest](x: Self) {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
