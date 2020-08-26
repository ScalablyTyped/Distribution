package typings.baseui.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioState extends js.Object {
  var isActive: Boolean = js.native
  var isHovered: Boolean = js.native
}

object RadioState {
  @scala.inline
  def apply(isActive: Boolean, isHovered: Boolean): RadioState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioState]
  }
  @scala.inline
  implicit class RadioStateOps[Self <: RadioState] (val x: Self) extends AnyVal {
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHovered(value: Boolean): Self = this.set("isHovered", value.asInstanceOf[js.Any])
  }
  
}

