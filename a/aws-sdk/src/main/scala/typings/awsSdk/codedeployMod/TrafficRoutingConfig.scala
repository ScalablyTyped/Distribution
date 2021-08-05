package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficRoutingConfig extends StObject {
  
  /**
    * A configuration that shifts traffic from one version of a Lambda function or ECS task set to another in two increments. The original and target Lambda function versions or ECS task sets are specified in the deployment's AppSpec file.
    */
  var timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.undefined
  
  /**
    * A configuration that shifts traffic from one version of a Lambda function or ECS task set to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions or ECS task sets are specified in the deployment's AppSpec file.
    */
  var timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.undefined
  
  /**
    * The type of traffic shifting (TimeBasedCanary or TimeBasedLinear) used by a deployment configuration.
    */
  var `type`: js.UndefOr[TrafficRoutingType] = js.undefined
}
object TrafficRoutingConfig {
  
  inline def apply(): TrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRoutingConfig]
  }
  
  extension [Self <: TrafficRoutingConfig](x: Self) {
    
    inline def setTimeBasedCanary(value: TimeBasedCanary): Self = StObject.set(x, "timeBasedCanary", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedCanaryUndefined: Self = StObject.set(x, "timeBasedCanary", js.undefined)
    
    inline def setTimeBasedLinear(value: TimeBasedLinear): Self = StObject.set(x, "timeBasedLinear", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedLinearUndefined: Self = StObject.set(x, "timeBasedLinear", js.undefined)
    
    inline def setType(value: TrafficRoutingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
