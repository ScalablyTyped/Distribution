package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioPayload extends EventPayload {
  var description: java.lang.String
  var exception: stdLib.Error
  var feature: cucumberLib.cucumberMod.Feature
  var keyword: java.lang.String
  var line: scala.Double
  var lines: js.Array[scala.Double]
  var name: java.lang.String
  var steps: js.Array[cucumberLib.cucumberMod.Step]
  var tags: js.Array[cucumberLib.cucumberMod.Tag]
  var uri: java.lang.String
}

object ScenarioPayload {
  @scala.inline
  def apply(
    description: java.lang.String,
    exception: stdLib.Error,
    feature: cucumberLib.cucumberMod.Feature,
    keyword: java.lang.String,
    line: scala.Double,
    lines: js.Array[scala.Double],
    name: java.lang.String,
    steps: js.Array[cucumberLib.cucumberMod.Step],
    tags: js.Array[cucumberLib.cucumberMod.Tag],
    uri: java.lang.String
  ): ScenarioPayload = {
    val __obj = js.Dynamic.literal(description = description, exception = exception, feature = feature, keyword = keyword, line = line, lines = lines, name = name, steps = steps, tags = tags, uri = uri)
  
    __obj.asInstanceOf[ScenarioPayload]
  }
}

