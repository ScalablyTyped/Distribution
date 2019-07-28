package typings.cucumber.cucumberMod.eventsNs

import typings.cucumber.cucumberMod.Status
import typings.cucumber.cucumberMod.Step
import typings.cucumber.cucumberMod.StepDefinition
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepResultPayload extends EventPayload {
  var ambiguousStepDefinitions: js.Any
  var attachments: js.Array[_]
  var duration: js.Any
  var failureException: Error
  var status: Status
  var step: Step
  var stepDefinition: StepDefinition
}

object StepResultPayload {
  @scala.inline
  def apply(
    ambiguousStepDefinitions: js.Any,
    attachments: js.Array[_],
    duration: js.Any,
    failureException: Error,
    status: Status,
    step: Step,
    stepDefinition: StepDefinition
  ): StepResultPayload = {
    val __obj = js.Dynamic.literal(ambiguousStepDefinitions = ambiguousStepDefinitions, attachments = attachments, duration = duration, failureException = failureException, status = status, step = step, stepDefinition = stepDefinition)
  
    __obj.asInstanceOf[StepResultPayload]
  }
}

