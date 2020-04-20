package typings.baseui

import typings.baseui.dataTableMod.RowT
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
  var row: RowT
}

object AnonEvent {
  @scala.inline
  def apply(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], row: RowT): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

