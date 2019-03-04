package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var arguments: js.Any
  var isBackground: scala.Boolean
  var keyword: java.lang.String
  var keywordType: java.lang.String
  var line: scala.Double
  var name: java.lang.String
  var scenario: Scenario
  var uri: java.lang.String
}

object Step {
  @scala.inline
  def apply(
    arguments: js.Any,
    isBackground: scala.Boolean,
    keyword: java.lang.String,
    keywordType: java.lang.String,
    line: scala.Double,
    name: java.lang.String,
    scenario: Scenario,
    uri: java.lang.String
  ): Step = {
    val __obj = js.Dynamic.literal(arguments = arguments, isBackground = isBackground, keyword = keyword, keywordType = keywordType, line = line, name = name, scenario = scenario, uri = uri)
  
    __obj.asInstanceOf[Step]
  }
}

