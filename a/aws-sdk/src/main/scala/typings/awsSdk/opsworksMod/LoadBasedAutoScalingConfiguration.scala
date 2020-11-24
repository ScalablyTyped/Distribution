package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBasedAutoScalingConfiguration extends js.Object {
  
  /**
    * An AutoScalingThresholds object that describes the downscaling configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  
  /**
    * Whether load-based auto scaling is enabled for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
  
  /**
    * An AutoScalingThresholds object that describes the upscaling configuration, which defines how and when AWS OpsWorks Stacks increases the number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}
object LoadBasedAutoScalingConfiguration {
  
  @scala.inline
  def apply(): LoadBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBasedAutoScalingConfiguration]
  }
  
  @scala.inline
  implicit class LoadBasedAutoScalingConfigurationOps[Self <: LoadBasedAutoScalingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDownScaling(value: AutoScalingThresholds): Self = this.set("DownScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownScaling: Self = this.set("DownScaling", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("Enable", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerId: Self = this.set("LayerId", js.undefined)
    
    @scala.inline
    def setUpScaling(value: AutoScalingThresholds): Self = this.set("UpScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpScaling: Self = this.set("UpScaling", js.undefined)
  }
}
