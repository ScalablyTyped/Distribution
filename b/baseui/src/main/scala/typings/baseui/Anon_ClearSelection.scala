package typings.baseui

import typings.baseui.dataDashTableMod.RowT
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearSelection extends js.Object {
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
  var selection: js.Array[RowT]
  def clearSelection(): js.Any
}

object Anon_ClearSelection {
  @scala.inline
  def apply(
    clearSelection: () => js.Any,
    event: MouseEvent[HTMLButtonElement, NativeMouseEvent],
    selection: js.Array[RowT]
  ): Anon_ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClearSelection]
  }
}

