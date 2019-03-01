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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scenarios")(scenarios)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Feature]
  }
}

