package typings.babelGenerator.mod

import typings.babelGenerator.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorResult extends js.Object {
  var code: String
  var map: File | Null
}

object GeneratorResult {
  @scala.inline
  def apply(code: String, map: File = null): GeneratorResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorResult]
  }
}

