package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficRoutingConfig extends StObject {
  
  /**
    * Batch size for the first step to turn on traffic on the new endpoint fleet. Value must be less than or equal to 50% of the variant's total instance count.
    */
  var CanarySize: js.UndefOr[CapacitySize] = js.undefined
  
  /**
    * Batch size for each step to turn on traffic on the new endpoint fleet. Value must be 10-50% of the variant's total instance count.
    */
  var LinearStepSize: js.UndefOr[CapacitySize] = js.undefined
  
  /**
    * Traffic routing strategy type.    ALL_AT_ONCE: Endpoint traffic shifts to the new fleet in a single step.     CANARY: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary, which is a small portion of the traffic. The second step is the remainder of the traffic.     LINEAR: Endpoint traffic shifts to the new fleet in n steps of a configurable size.   
    */
  var Type: TrafficRoutingConfigType
  
  /**
    * The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
    */
  var WaitIntervalInSeconds: typings.awsSdk.sagemakerMod.WaitIntervalInSeconds
}
object TrafficRoutingConfig {
  
  inline def apply(Type: TrafficRoutingConfigType, WaitIntervalInSeconds: WaitIntervalInSeconds): TrafficRoutingConfig = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], WaitIntervalInSeconds = WaitIntervalInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficRoutingConfig]
  }
  
  extension [Self <: TrafficRoutingConfig](x: Self) {
    
    inline def setCanarySize(value: CapacitySize): Self = StObject.set(x, "CanarySize", value.asInstanceOf[js.Any])
    
    inline def setCanarySizeUndefined: Self = StObject.set(x, "CanarySize", js.undefined)
    
    inline def setLinearStepSize(value: CapacitySize): Self = StObject.set(x, "LinearStepSize", value.asInstanceOf[js.Any])
    
    inline def setLinearStepSizeUndefined: Self = StObject.set(x, "LinearStepSize", js.undefined)
    
    inline def setType(value: TrafficRoutingConfigType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWaitIntervalInSeconds(value: WaitIntervalInSeconds): Self = StObject.set(x, "WaitIntervalInSeconds", value.asInstanceOf[js.Any])
  }
}
