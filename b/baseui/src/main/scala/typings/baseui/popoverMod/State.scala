package typings.baseui.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var isOpen: Boolean
}

object State {
  @scala.inline
  def apply(isOpen: Boolean): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

