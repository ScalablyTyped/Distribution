package typings.babelGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorResult extends js.Object {
  var code: String
}

object GeneratorResult {
  @scala.inline
  def apply(code: String): GeneratorResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorResult]
  }
}

