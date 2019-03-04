package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturePayload extends EventPayload {
  var description: java.lang.String
  var keyword: java.lang.String
  var line: scala.Double
  var name: java.lang.String
  var scenarios: js.Array[cucumberLib.cucumberMod.Scenario]
  var tags: js.Array[cucumberLib.cucumberMod.Tag]
  var uri: java.lang.String
}

object FeaturePayload {
  @scala.inline
  def apply(
    description: java.lang.String,
    keyword: java.lang.String,
    line: scala.Double,
    name: java.lang.String,
    scenarios: js.Array[cucumberLib.cucumberMod.Scenario],
    tags: js.Array[cucumberLib.cucumberMod.Tag],
    uri: java.lang.String
  ): FeaturePayload = {
    val __obj = js.Dynamic.literal(description = description, keyword = keyword, line = line, name = name, scenarios = scenarios, tags = tags, uri = uri)
  
    __obj.asInstanceOf[FeaturePayload]
  }
}

