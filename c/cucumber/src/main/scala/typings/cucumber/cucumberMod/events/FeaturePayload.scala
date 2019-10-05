package typings.cucumber.cucumberMod.events

import typings.cucumber.cucumberMod.Scenario
import typings.cucumber.cucumberMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturePayload extends EventPayload {
  var description: String
  var keyword: String
  var line: Double
  var name: String
  var scenarios: js.Array[Scenario]
  var tags: js.Array[Tag]
  var uri: String
}

object FeaturePayload {
  @scala.inline
  def apply(
    description: String,
    keyword: String,
    line: Double,
    name: String,
    scenarios: js.Array[Scenario],
    tags: js.Array[Tag],
    uri: String
  ): FeaturePayload = {
    val __obj = js.Dynamic.literal(description = description, keyword = keyword, line = line, name = name, scenarios = scenarios, tags = tags, uri = uri)
  
    __obj.asInstanceOf[FeaturePayload]
  }
}

