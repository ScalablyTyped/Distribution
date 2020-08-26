package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExecutionStep extends js.Object {
  /**
    * An error message if the step was interrupted during execution.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The details of the step.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The time when the step started.
    */
  var StartTime: js.UndefOr[Date] = js.native
  /**
    * The valid status of the step.
    */
  var State: js.UndefOr[RemediationExecutionStepState] = js.native
  /**
    * The time when the step stopped.
    */
  var StopTime: js.UndefOr[Date] = js.native
}

object RemediationExecutionStep {
  @scala.inline
  def apply(): RemediationExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStep]
  }
  @scala.inline
  implicit class RemediationExecutionStepOps[Self <: RemediationExecutionStep] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStartTime(value: Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setState(value: RemediationExecutionStepState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStopTime(value: Date): Self = this.set("StopTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopTime: Self = this.set("StopTime", js.undefined)
  }
  
}

