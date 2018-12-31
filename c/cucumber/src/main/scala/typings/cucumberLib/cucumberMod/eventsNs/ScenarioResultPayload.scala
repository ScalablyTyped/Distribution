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

