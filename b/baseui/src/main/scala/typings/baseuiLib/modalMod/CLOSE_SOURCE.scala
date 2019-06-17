package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLOSE_SOURCE extends js.Object {
  var backdrop: baseuiLib.baseuiLibStrings.backdrop
  var closeButton: baseuiLib.baseuiLibStrings.closeButton
  var escape: baseuiLib.baseuiLibStrings.escape
}

object CLOSE_SOURCE {
  @scala.inline
  def apply(
    backdrop: baseuiLib.baseuiLibStrings.backdrop,
    closeButton: baseuiLib.baseuiLibStrings.closeButton,
    escape: baseuiLib.baseuiLibStrings.escape
  ): CLOSE_SOURCE = {
    val __obj = js.Dynamic.literal(backdrop = backdrop, closeButton = closeButton, escape = escape)
  
    __obj.asInstanceOf[CLOSE_SOURCE]
  }
}

