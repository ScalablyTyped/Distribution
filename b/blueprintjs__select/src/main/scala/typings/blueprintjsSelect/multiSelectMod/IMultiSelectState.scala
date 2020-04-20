package typings.blueprintjsSelect.multiSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiSelectState extends js.Object {
  var isOpen: Boolean
}

object IMultiSelectState {
  @scala.inline
  def apply(isOpen: Boolean): IMultiSelectState = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiSelectState]
  }
}

