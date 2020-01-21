package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var arguments: js.Any
  var isBackground: Boolean
  var keyword: String
  var keywordType: String
  var line: Double
  var name: String
  var scenario: Scenario
  var uri: String
}

object Step {
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
  ): Step = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], isBackground = isBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], keywordType = keywordType.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Step]
  }
}

