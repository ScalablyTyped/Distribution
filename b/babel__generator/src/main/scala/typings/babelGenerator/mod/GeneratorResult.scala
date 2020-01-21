package typings.babelGenerator.mod

import typings.babelGenerator.AnonFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorResult extends js.Object {
  var code: String
  var map: AnonFile | Null
}

object GeneratorResult {
  @scala.inline
  def apply(code: String, map: AnonFile = null): GeneratorResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorResult]
  }
}

