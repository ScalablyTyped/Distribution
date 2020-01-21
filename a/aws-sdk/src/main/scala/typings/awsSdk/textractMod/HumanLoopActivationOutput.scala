package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationOutput extends js.Object {
  /**
    * Shows the result of condition evaluations, including those conditions which activated a human review.
    */
  var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[typings.awsSdk.textractMod.HumanLoopActivationConditionsEvaluationResults] = js.native
  /**
    * Shows if and why human review was needed.
    */
  var HumanLoopActivationReasons: js.UndefOr[typings.awsSdk.textractMod.HumanLoopActivationReasons] = js.native
  /**
    * The Amazon Resource Name (ARN) of the HumanLoop created.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.textractMod.HumanLoopArn] = js.native
}

object HumanLoopActivationOutput {
  @scala.inline
  def apply(
    HumanLoopActivationConditionsEvaluationResults: HumanLoopActivationConditionsEvaluationResults = null,
    HumanLoopActivationReasons: HumanLoopActivationReasons = null,
    HumanLoopArn: HumanLoopArn = null
  ): HumanLoopActivationOutput = {
    val __obj = js.Dynamic.literal()
    if (HumanLoopActivationConditionsEvaluationResults != null) __obj.updateDynamic("HumanLoopActivationConditionsEvaluationResults")(HumanLoopActivationConditionsEvaluationResults.asInstanceOf[js.Any])
    if (HumanLoopActivationReasons != null) __obj.updateDynamic("HumanLoopActivationReasons")(HumanLoopActivationReasons.asInstanceOf[js.Any])
    if (HumanLoopArn != null) __obj.updateDynamic("HumanLoopArn")(HumanLoopArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopActivationOutput]
  }
}

