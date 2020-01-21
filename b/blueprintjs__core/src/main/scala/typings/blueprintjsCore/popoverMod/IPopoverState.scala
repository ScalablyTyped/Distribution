package typings.blueprintjsCore.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverState extends js.Object {
  var hasDarkParent: Boolean
  var isOpen: Boolean
  var transformOrigin: String
}

object IPopoverState {
  @scala.inline
  def apply(hasDarkParent: Boolean, isOpen: Boolean, transformOrigin: String): IPopoverState = {
    val __obj = js.Dynamic.literal(hasDarkParent = hasDarkParent.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPopoverState]
  }
}

