package typings.cucumber.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturesResultPayload extends EventPayload {
  var duration: Double
  var scenarioResults: js.Array[_]
  var stepsResults: js.Array[_]
  var strict: Boolean
  var success: Boolean
}

object FeaturesResultPayload {
  @scala.inline
  def apply(
    duration: Double,
    scenarioResults: js.Array[_],
    stepsResults: js.Array[_],
    strict: Boolean,
    success: Boolean
  ): FeaturesResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scenarioResults = scenarioResults.asInstanceOf[js.Any], stepsResults = stepsResults.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesResultPayload]
  }
}

