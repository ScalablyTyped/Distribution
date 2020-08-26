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
  def apply(): HumanLoopActivationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopActivationOutput]
  }
  @scala.inline
  implicit class HumanLoopActivationOutputOps[Self <: HumanLoopActivationOutput] (val x: Self) extends AnyVal {
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
    def setHumanLoopActivationConditionsEvaluationResults(value: HumanLoopActivationConditionsEvaluationResults): Self = this.set("HumanLoopActivationConditionsEvaluationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopActivationConditionsEvaluationResults: Self = this.set("HumanLoopActivationConditionsEvaluationResults", js.undefined)
    @scala.inline
    def setHumanLoopActivationReasonsVarargs(value: HumanLoopActivationReason*): Self = this.set("HumanLoopActivationReasons", js.Array(value :_*))
    @scala.inline
    def setHumanLoopActivationReasons(value: HumanLoopActivationReasons): Self = this.set("HumanLoopActivationReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopActivationReasons: Self = this.set("HumanLoopActivationReasons", js.undefined)
    @scala.inline
    def setHumanLoopArn(value: HumanLoopArn): Self = this.set("HumanLoopArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopArn: Self = this.set("HumanLoopArn", js.undefined)
  }
  
}

