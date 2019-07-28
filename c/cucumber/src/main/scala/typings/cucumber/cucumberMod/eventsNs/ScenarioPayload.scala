package typings.cucumber.cucumberMod.eventsNs

import typings.cucumber.cucumberMod.Feature
import typings.cucumber.cucumberMod.Step
import typings.cucumber.cucumberMod.Tag
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioPayload extends EventPayload {
  var description: String
  var exception: Error
  var feature: Feature
  var keyword: String
  var line: Double
  var lines: js.Array[Double]
  var name: String
  var steps: js.Array[Step]
  var tags: js.Array[Tag]
  var uri: String
}

object ScenarioPayload {
  @scala.inline
  def apply(
    description: String,
    exception: Error,
    feature: Feature,
    keyword: String,
    line: Double,
    lines: js.Array[Double],
    name: String,
    steps: js.Array[Step],
    tags: js.Array[Tag],
    uri: String
  ): ScenarioPayload = {
    val __obj = js.Dynamic.literal(description = description, exception = exception, feature = feature, keyword = keyword, line = line, lines = lines, name = name, steps = steps, tags = tags, uri = uri)
  
    __obj.asInstanceOf[ScenarioPayload]
  }
}

