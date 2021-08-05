package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLoadBasedAutoScalingRequest extends StObject {
  
  /**
    * An AutoScalingThresholds object with the downscaling threshold configuration. If the load falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
  
  /**
    * Enables load-based auto scaling for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer ID.
    */
  var LayerId: String
  
  /**
    * An AutoScalingThresholds object with the upscaling threshold configuration. If the load exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
}
object SetLoadBasedAutoScalingRequest {
  
  inline def apply(LayerId: String): SetLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBasedAutoScalingRequest]
  }
  
  extension [Self <: SetLoadBasedAutoScalingRequest](x: Self) {
    
    inline def setDownScaling(value: AutoScalingThresholds): Self = StObject.set(x, "DownScaling", value.asInstanceOf[js.Any])
    
    inline def setDownScalingUndefined: Self = StObject.set(x, "DownScaling", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    inline def setUpScaling(value: AutoScalingThresholds): Self = StObject.set(x, "UpScaling", value.asInstanceOf[js.Any])
    
    inline def setUpScalingUndefined: Self = StObject.set(x, "UpScaling", js.undefined)
  }
}
