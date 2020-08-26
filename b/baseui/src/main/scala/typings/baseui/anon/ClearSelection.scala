package typings.baseui.anon

import typings.baseui.dataTableMod.RowT
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearSelection extends js.Object {
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent] = js.native
  var selection: js.Array[RowT] = js.native
  def clearSelection(): js.Any = js.native
}

object ClearSelection {
  @scala.inline
  def apply(
    clearSelection: () => js.Any,
    event: MouseEvent[HTMLButtonElement, NativeMouseEvent],
    selection: js.Array[RowT]
  ): ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSelection]
  }
  @scala.inline
  implicit class ClearSelectionOps[Self <: ClearSelection] (val x: Self) extends AnyVal {
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
    def setClearSelection(value: () => js.Any): Self = this.set("clearSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setEvent(value: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionVarargs(value: RowT*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[RowT]): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

