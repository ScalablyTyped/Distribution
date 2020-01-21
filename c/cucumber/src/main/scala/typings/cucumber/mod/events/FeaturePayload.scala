package typings.cucumber.mod.events

import typings.cucumber.mod.Scenario
import typings.cucumber.mod.Tag
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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeaturePayload]
  }
}

