package typings.babelDashGenerator.babelDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorResult extends js.Object {
  var code: String
}

object GeneratorResult {
  @scala.inline
  def apply(code: String): GeneratorResult = {
    val __obj = js.Dynamic.literal(code = code)
  
    __obj.asInstanceOf[GeneratorResult]
  }
}

