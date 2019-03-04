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
    val __obj = js.Dynamic.literal(description = description, exception = exception, feature = feature, keyword = keyword, line = line, lines = lines, name = name, steps = steps, tags = tags, uri = uri)
  
    __obj.asInstanceOf[Scenario]
  }
}

