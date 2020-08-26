package typings.baseui.anon

import typings.baseui.layerMod.PopperOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrow extends js.Object {
  var arrow: js.UndefOr[PopperOffset] = js.native
  var popper: PopperOffset = js.native
}

object Arrow {
  @scala.inline
  def apply(popper: PopperOffset): Arrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
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
    def setPopper(value: PopperOffset): Self = this.set("popper", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrow(value: PopperOffset): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
  }
  
}

