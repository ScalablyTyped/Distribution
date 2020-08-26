package typings.blueprintjsSelect.suggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestState[T] extends js.Object {
  var isOpen: Boolean = js.native
  var selectedItem: T | Null = js.native
}

object ISuggestState {
  @scala.inline
  def apply[T](isOpen: Boolean): ISuggestState[T] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestState[T]]
  }
  @scala.inline
  implicit class ISuggestStateOps[Self <: ISuggestState[_], T] (val x: Self with ISuggestState[T]) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItem(value: T): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
  }
  
}

