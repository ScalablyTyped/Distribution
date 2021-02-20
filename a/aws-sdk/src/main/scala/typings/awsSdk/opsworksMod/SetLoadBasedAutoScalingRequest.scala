package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLoadBasedAutoScalingRequest extends StObject {
  
  /**
    * An AutoScalingThresholds object with the downscaling threshold configuration. If the load falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  
  /**
    * Enables load-based auto scaling for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
  
  /**
    * An AutoScalingThresholds object with the upscaling threshold configuration. If the load exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}
object SetLoadBasedAutoScalingRequest {
  
  @scala.inline
  def apply(LayerId: String): SetLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBasedAutoScalingRequest]
  }
  
  @scala.inline
  implicit class SetLoadBasedAutoScalingRequestMutableBuilder[Self <: SetLoadBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownScaling(value: AutoScalingThresholds): Self = StObject.set(x, "DownScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownScalingUndefined: Self = StObject.set(x, "DownScaling", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpScaling(value: AutoScalingThresholds): Self = StObject.set(x, "UpScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpScalingUndefined: Self = StObject.set(x, "UpScaling", js.undefined)
  }
}
