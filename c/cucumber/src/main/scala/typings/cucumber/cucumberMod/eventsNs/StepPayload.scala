package typings.cucumber.cucumberMod.eventsNs

import typings.cucumber.cucumberMod.Scenario
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepPayload extends EventPayload {
  var arguments: js.Any
  var isBackground: Boolean
  var keyword: String
  var keywordType: String
  var line: Double
  var name: String
  var scenario: Scenario
  var uri: String
}

object StepPayload {
  @scala.inline
  def apply(
    arguments: js.Any,
    isBackground: Boolean,
    keyword: String,
    keywordType: String,
    line: Double,
    name: String,
    scenario: Scenario,
    uri: String
  ): StepPayload = {
    val __obj = js.Dynamic.literal(arguments = arguments, isBackground = isBackground, keyword = keyword, keywordType = keywordType, line = line, name = name, scenario = scenario, uri = uri)
  
    __obj.asInstanceOf[StepPayload]
  }
}

