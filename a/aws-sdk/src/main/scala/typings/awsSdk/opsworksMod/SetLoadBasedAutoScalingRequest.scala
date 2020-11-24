package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLoadBasedAutoScalingRequest extends js.Object {
  
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
  implicit class SetLoadBasedAutoScalingRequestOps[Self <: SetLoadBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownScaling(value: AutoScalingThresholds): Self = this.set("DownScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownScaling: Self = this.set("DownScaling", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("Enable", js.undefined)
    
    @scala.inline
    def setUpScaling(value: AutoScalingThresholds): Self = this.set("UpScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpScaling: Self = this.set("UpScaling", js.undefined)
  }
}
