package typings.blueprintjsCore.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverState extends js.Object {
  var hasDarkParent: Boolean = js.native
  var isOpen: Boolean = js.native
  var transformOrigin: String = js.native
}

object IPopoverState {
  @scala.inline
  def apply(hasDarkParent: Boolean, isOpen: Boolean, transformOrigin: String): IPopoverState = {
    val __obj = js.Dynamic.literal(hasDarkParent = hasDarkParent.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopoverState]
  }
  @scala.inline
  implicit class IPopoverStateOps[Self <: IPopoverState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasDarkParent(value: Boolean): Self = this.set("hasDarkParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
  }
  
}

