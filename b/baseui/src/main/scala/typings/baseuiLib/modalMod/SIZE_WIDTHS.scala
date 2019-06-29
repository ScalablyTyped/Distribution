package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SIZE_WIDTHS extends js.Object {
  var auto: baseuiLib.baseuiLibStrings.auto
  var default: baseuiLib.baseuiLibStrings.`500px`
  var full: baseuiLib.baseuiLibStrings.`100%`
}

object SIZE_WIDTHS {
  @scala.inline
  def apply(
    auto: baseuiLib.baseuiLibStrings.auto,
    default: baseuiLib.baseuiLibStrings.`500px`,
    full: baseuiLib.baseuiLibStrings.`100%`
  ): SIZE_WIDTHS = {
    val __obj = js.Dynamic.literal(auto = auto, default = default, full = full)
  
    __obj.asInstanceOf[SIZE_WIDTHS]
  }
}

