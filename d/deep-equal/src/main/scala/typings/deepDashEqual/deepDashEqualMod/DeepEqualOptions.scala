package typings.deepDashEqual.deepDashEqualMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepEqualOptions extends js.Object {
  var strict: Boolean
}

object DeepEqualOptions {
  @scala.inline
  def apply(strict: Boolean): DeepEqualOptions = {
    val __obj = js.Dynamic.literal(strict = strict)
  
    __obj.asInstanceOf[DeepEqualOptions]
  }
}

