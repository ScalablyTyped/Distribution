package typings.cucumber.cucumberMod.events

import typings.cucumber.cucumberMod.Scenario
import typings.cucumber.cucumberMod.Status
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioResultPayload extends EventPayload {
  var duration: js.Any
  var failureException: Error
  var scenario: Scenario
  var status: Status
  var stepResults: js.Array[_]
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
}

