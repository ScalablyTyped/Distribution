package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationConditionsConfig extends js.Object {
  /**
    * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created against the configured work team. The set of conditions is different for Rekognition and Textract. For more information about how to structure the JSON, see JSON Schema for Human Loop Activation Conditions in Amazon Augmented AI in the Amazon SageMaker Developer Guide.
    */
  var HumanLoopActivationConditions: typings.awsSdk.sagemakerMod.HumanLoopActivationConditions = js.native
}

object HumanLoopActivationConditionsConfig {
  @scala.inline
  def apply(HumanLoopActivationConditions: HumanLoopActivationConditions): HumanLoopActivationConditionsConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditions = HumanLoopActivationConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationConditionsConfig]
  }
}

