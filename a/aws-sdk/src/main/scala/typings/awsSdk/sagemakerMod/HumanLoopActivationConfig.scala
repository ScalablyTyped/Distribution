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
}

