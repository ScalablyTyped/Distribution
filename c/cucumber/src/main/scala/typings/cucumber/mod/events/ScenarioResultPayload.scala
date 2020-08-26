package typings.cucumber.mod.events

import typings.cucumber.mod.Scenario
import typings.cucumber.mod.Status
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenarioResultPayload extends EventPayload {
  var duration: js.Any = js.native
  var failureException: Error = js.native
  var scenario: Scenario = js.native
  var status: Status = js.native
  var stepResults: js.Array[_] = js.native
}

object ScenarioResultPayload {
  @scala.inline
  def apply(
    duration: js.Any,
    failureException: Error,
    scenario: Scenario,
    status: Status,
    stepResults: js.Array[_]
  ): ScenarioResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failureException = failureException.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioResultPayload]
  }
  @scala.inline
  implicit class ScenarioResultPayloadOps[Self <: ScenarioResultPayload] (val x: Self) extends AnyVal {
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
    def setDuration(value: js.Any): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureException(value: Error): Self = this.set("failureException", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenario(value: Scenario): Self = this.set("scenario", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepResultsVarargs(value: js.Any*): Self = this.set("stepResults", js.Array(value :_*))
    @scala.inline
    def setStepResults(value: js.Array[_]): Self = this.set("stepResults", value.asInstanceOf[js.Any])
  }
  
}

