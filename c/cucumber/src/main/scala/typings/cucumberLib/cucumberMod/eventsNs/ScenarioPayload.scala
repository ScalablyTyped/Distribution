package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScenarioPayload extends EventPayload {
  var description: java.lang.String
  var exception: stdLib.Error
  var feature: cucumberLib.cucumberMod.Feature
  var keyword: java.lang.String
  var line: scala.Double
  var lines: js.Array[scala.Double]
  var name: java.lang.String
  var steps: js.Array[cucumberLib.cucumberMod.Step]
  var tags: js.Array[cucumberLib.cucumberMod.Tag]
  var uri: java.lang.String
}

