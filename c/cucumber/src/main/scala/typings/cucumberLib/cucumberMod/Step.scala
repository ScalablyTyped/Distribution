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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("isBackground")(isBackground)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("keywordType")(keywordType)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scenario")(scenario)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Step]
  }
}

