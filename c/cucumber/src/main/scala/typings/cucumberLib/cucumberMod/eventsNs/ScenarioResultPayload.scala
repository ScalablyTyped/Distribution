package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioResultPayload extends EventPayload {
  var duration: js.Any
  var failureException: stdLib.Error
  var scenario: cucumberLib.cucumberMod.Scenario
  var status: cucumberLib.cucumberMod.Status
  var stepResults: js.Array[_]
}

object ScenarioResultPayload {
  @scala.inline
  def apply(
    duration: js.Any,
    failureException: stdLib.Error,
    scenario: cucumberLib.cucumberMod.Scenario,
    status: cucumberLib.cucumberMod.Status,
    stepResults: js.Array[_]
  ): ScenarioResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration, failureException = failureException, scenario = scenario, status = status, stepResults = stepResults)
  
    __obj.asInstanceOf[ScenarioResultPayload]
  }
}

