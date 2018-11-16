package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StepPayload extends EventPayload {
  var arguments: js.Any
  var isBackground: scala.Boolean
  var keyword: java.lang.String
  var keywordType: java.lang.String
  var line: scala.Double
  var name: java.lang.String
  var scenario: cucumberLib.cucumberMod.Scenario
  var uri: java.lang.String
}

