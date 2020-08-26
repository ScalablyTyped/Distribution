package typings.baseui.dndListMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArgT extends js.Object {
  @JSName("$isDragged")
  var $isDragged: Boolean = js.native
  @JSName("$isRemovable")
  var $isRemovable: Boolean = js.native
  @JSName("$isRemovableByMove")
  var $isRemovableByMove: Boolean = js.native
  @JSName("$isSelected")
  var $isSelected: Boolean = js.native
  @JSName("$value")
  var $value: ReactNode = js.native
}

object SharedStylePropsArgT {
  @scala.inline
  def apply($isDragged: Boolean, $isRemovable: Boolean, $isRemovableByMove: Boolean, $isSelected: Boolean): SharedStylePropsArgT = {
    val __obj = js.Dynamic.literal($isDragged = $isDragged.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArgT]
  }
  @scala.inline
  implicit class SharedStylePropsArgTOps[Self <: SharedStylePropsArgT] (val x: Self) extends AnyVal {
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
    def set$isDragged(value: Boolean): Self = this.set("$isDragged", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isRemovable(value: Boolean): Self = this.set("$isRemovable", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isRemovableByMove(value: Boolean): Self = this.set("$isRemovableByMove", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isSelected(value: Boolean): Self = this.set("$isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def set$value(value: ReactNode): Self = this.set("$value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$value: Self = this.set("$value", js.undefined)
  }
  
}

