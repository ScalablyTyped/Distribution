package typings.cucumber.cucumberMod.events

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
    val __obj = js.Dynamic.literal(duration = duration, scenarioResults = scenarioResults, stepsResults = stepsResults, strict = strict, success = success)
  
    __obj.asInstanceOf[FeaturesResultPayload]
  }
}

