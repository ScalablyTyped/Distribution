package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficRoutingConfig extends js.Object {
  
  /**
    * A configuration that shifts traffic from one version of a Lambda function or ECS task set to another in two increments. The original and target Lambda function versions or ECS task sets are specified in the deployment's AppSpec file.
    */
  var timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.native
  
  /**
    * A configuration that shifts traffic from one version of a Lambda function or ECS task set to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions or ECS task sets are specified in the deployment's AppSpec file.
    */
  var timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.native
  
  /**
    * The type of traffic shifting (TimeBasedCanary or TimeBasedLinear) used by a deployment configuration.
    */
  var `type`: js.UndefOr[TrafficRoutingType] = js.native
}
object TrafficRoutingConfig {
  
  @scala.inline
  def apply(): TrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRoutingConfig]
  }
  
  @scala.inline
  implicit class TrafficRoutingConfigOps[Self <: TrafficRoutingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimeBasedCanary(value: TimeBasedCanary): Self = this.set("timeBasedCanary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeBasedCanary: Self = this.set("timeBasedCanary", js.undefined)
    
    @scala.inline
    def setTimeBasedLinear(value: TimeBasedLinear): Self = this.set("timeBasedLinear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeBasedLinear: Self = this.set("timeBasedLinear", js.undefined)
    
    @scala.inline
    def setType(value: TrafficRoutingType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
