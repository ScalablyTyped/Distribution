package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationConfig extends js.Object {
  /**
    * Container structure for defining under what conditions SageMaker creates a human loop.
    */
  var HumanLoopActivationConditionsConfig: typings.awsSdk.sagemakerMod.HumanLoopActivationConditionsConfig = js.native
}

object HumanLoopActivationConfig {
  @scala.inline
  def apply(HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig): HumanLoopActivationConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditionsConfig = HumanLoopActivationConditionsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationConfig]
  }
  @scala.inline
  implicit class HumanLoopActivationConfigOps[Self <: HumanLoopActivationConfig] (val x: Self) extends AnyVal {
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
    def setHumanLoopActivationConditionsConfig(value: HumanLoopActivationConditionsConfig): Self = this.set("HumanLoopActivationConditionsConfig", value.asInstanceOf[js.Any])
  }
  
}

