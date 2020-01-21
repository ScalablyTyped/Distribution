package typings.baseui

import typings.baseui.dataTableMod.RowT
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearSelection extends js.Object {
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
  var selection: js.Array[RowT]
  def clearSelection(): js.Any
}

object AnonClearSelection {
  @scala.inline
  def apply(
    clearSelection: () => js.Any,
    event: MouseEvent[HTMLButtonElement, NativeMouseEvent],
    selection: js.Array[RowT]
  ): AnonClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClearSelection]
  }
}

