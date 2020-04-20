package typings.baseui.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalState extends js.Object {
  var isVisible: Boolean
  var mounted: Boolean
}

object ModalState {
  @scala.inline
  def apply(isVisible: Boolean, mounted: Boolean): ModalState = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalState]
  }
}

