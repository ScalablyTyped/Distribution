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

