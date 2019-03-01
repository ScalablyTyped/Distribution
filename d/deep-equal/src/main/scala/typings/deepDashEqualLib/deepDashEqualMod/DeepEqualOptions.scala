package typings
package deepDashEqualLib.deepDashEqualMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepEqualOptions extends js.Object {
  var strict: scala.Boolean
}

object DeepEqualOptions {
  @scala.inline
  def apply(strict: scala.Boolean): DeepEqualOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[DeepEqualOptions]
  }
}

