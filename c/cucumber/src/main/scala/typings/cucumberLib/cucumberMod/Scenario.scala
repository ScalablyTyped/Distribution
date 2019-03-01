package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenario extends js.Object {
  var description: java.lang.String
  var exception: stdLib.Error
  var feature: Feature
  var keyword: java.lang.String
  var line: scala.Double
  var lines: js.Array[scala.Double]
  var name: java.lang.String
  var steps: js.Array[Step]
  var tags: js.Array[Tag]
  var uri: java.lang.String
}

object Scenario {
  @scala.inline
  def apply(
    description: java.lang.String,
    exception: stdLib.Error,
    feature: Feature,
    keyword: java.lang.String,
    line: scala.Double,
    lines: js.Array[scala.Double],
    name: java.lang.String,
    steps: js.Array[Step],
    tags: js.Array[Tag],
    uri: java.lang.String
  ): Scenario = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("exception")(exception)
    __obj.updateDynamic("feature")(feature)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("lines")(lines)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Scenario]
  }
}

