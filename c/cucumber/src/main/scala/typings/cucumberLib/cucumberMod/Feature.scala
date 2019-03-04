package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var description: java.lang.String
  var keyword: java.lang.String
  var line: scala.Double
  var name: java.lang.String
  var scenarios: js.Array[Scenario]
  var tags: js.Array[Tag]
  var uri: java.lang.String
}

object Feature {
  @scala.inline
  def apply(
    description: java.lang.String,
    keyword: java.lang.String,
    line: scala.Double,
    name: java.lang.String,
    scenarios: js.Array[Scenario],
    tags: js.Array[Tag],
    uri: java.lang.String
  ): Feature = {
    val __obj = js.Dynamic.literal(description = description, keyword = keyword, line = line, name = name, scenarios = scenarios, tags = tags, uri = uri)
  
    __obj.asInstanceOf[Feature]
  }
}

