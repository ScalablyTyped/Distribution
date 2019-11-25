package typings.cucumber.cucumberMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenario extends js.Object {
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

object Scenario {
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
  ): Scenario = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scenario]
  }
}

