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

object StepPayload {
  @scala.inline
  def apply(
    arguments: js.Any,
    isBackground: scala.Boolean,
    keyword: java.lang.String,
    keywordType: java.lang.String,
    line: scala.Double,
    name: java.lang.String,
    scenario: cucumberLib.cucumberMod.Scenario,
    uri: java.lang.String
  ): StepPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("isBackground")(isBackground)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("keywordType")(keywordType)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scenario")(scenario)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[StepPayload]
  }
}

