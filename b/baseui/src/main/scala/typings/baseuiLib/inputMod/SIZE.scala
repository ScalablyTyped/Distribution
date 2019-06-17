package typings
package baseuiLib.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SIZE extends js.Object {
  var compact: baseuiLib.baseuiLibStrings.compact
  var default: baseuiLib.baseuiLibStrings.default
  var large: baseuiLib.baseuiLibStrings.large
}

object SIZE {
  @scala.inline
  def apply(
    compact: baseuiLib.baseuiLibStrings.compact,
    default: baseuiLib.baseuiLibStrings.default,
    large: baseuiLib.baseuiLibStrings.large
  ): SIZE = {
    val __obj = js.Dynamic.literal(compact = compact, default = default, large = large)
  
    __obj.asInstanceOf[SIZE]
  }
}

