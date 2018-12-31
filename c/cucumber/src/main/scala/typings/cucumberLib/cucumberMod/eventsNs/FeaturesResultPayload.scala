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

