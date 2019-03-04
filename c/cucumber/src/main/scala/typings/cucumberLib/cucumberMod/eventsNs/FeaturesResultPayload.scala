package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturesResultPayload extends EventPayload {
  var duration: scala.Double
  var scenarioResults: js.Array[_]
  var stepsResults: js.Array[_]
  var strict: scala.Boolean
  var success: scala.Boolean
}

object FeaturesResultPayload {
  @scala.inline
  def apply(
    duration: scala.Double,
    scenarioResults: js.Array[_],
    stepsResults: js.Array[_],
    strict: scala.Boolean,
    success: scala.Boolean
  ): FeaturesResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration, scenarioResults = scenarioResults, stepsResults = stepsResults, strict = strict, success = success)
  
    __obj.asInstanceOf[FeaturesResultPayload]
  }
}

