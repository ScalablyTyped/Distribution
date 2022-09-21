package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetMetricResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new fleet metric.
    */
  var metricArn: js.UndefOr[FleetMetricArn] = js.undefined
  
  /**
    * The name of the fleet metric to create.
    */
  var metricName: js.UndefOr[FleetMetricName] = js.undefined
}
object CreateFleetMetricResponse {
  
  inline def apply(): CreateFleetMetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetMetricResponse]
  }
  
  extension [Self <: CreateFleetMetricResponse](x: Self) {
    
    inline def setMetricArn(value: FleetMetricArn): Self = StObject.set(x, "metricArn", value.asInstanceOf[js.Any])
    
    inline def setMetricArnUndefined: Self = StObject.set(x, "metricArn", js.undefined)
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
