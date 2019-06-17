package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SIZE extends js.Object {
  var auto: baseuiLib.baseuiLibStrings.auto
  var default: baseuiLib.baseuiLibStrings.default
  var full: baseuiLib.baseuiLibStrings.full
}

object SIZE {
  @scala.inline
  def apply(
    auto: baseuiLib.baseuiLibStrings.auto,
    default: baseuiLib.baseuiLibStrings.default,
    full: baseuiLib.baseuiLibStrings.full
  ): SIZE = {
    val __obj = js.Dynamic.literal(auto = auto, default = default, full = full)
  
    __obj.asInstanceOf[SIZE]
  }
}

