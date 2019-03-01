package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepResultPayload extends EventPayload {
  var ambiguousStepDefinitions: js.Any
  var attachments: js.Array[_]
  var duration: js.Any
  var failureException: stdLib.Error
  var status: cucumberLib.cucumberMod.Status
  var step: cucumberLib.cucumberMod.Step
  var stepDefinition: cucumberLib.cucumberMod.StepDefinition
}

object StepResultPayload {
  @scala.inline
  def apply(
    ambiguousStepDefinitions: js.Any,
    attachments: js.Array[_],
    duration: js.Any,
    failureException: stdLib.Error,
    status: cucumberLib.cucumberMod.Status,
    step: cucumberLib.cucumberMod.Step,
    stepDefinition: cucumberLib.cucumberMod.StepDefinition
  ): StepResultPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ambiguousStepDefinitions")(ambiguousStepDefinitions)
    __obj.updateDynamic("attachments")(attachments)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("failureException")(failureException)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("stepDefinition")(stepDefinition)
    __obj.asInstanceOf[StepResultPayload]
  }
}

