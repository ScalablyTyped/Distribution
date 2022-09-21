package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetMetricRequest extends StObject {
  
  /**
    * The name of the fleet metric to describe.
    */
  var metricName: FleetMetricName
}
object DescribeFleetMetricRequest {
  
  inline def apply(metricName: FleetMetricName): DescribeFleetMetricRequest = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetMetricRequest]
  }
  
  extension [Self <: DescribeFleetMetricRequest](x: Self) {
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
