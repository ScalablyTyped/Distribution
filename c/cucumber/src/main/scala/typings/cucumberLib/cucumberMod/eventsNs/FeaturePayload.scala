package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturePayload extends EventPayload {
  var description: java.lang.String
  var keyword: java.lang.String
  var line: scala.Double
  var name: java.lang.String
  var scenarios: js.Array[cucumberLib.cucumberMod.Scenario]
  var tags: js.Array[cucumberLib.cucumberMod.Tag]
  var uri: java.lang.String
}

