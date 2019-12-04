package typings.baseui

import typings.baseui.dataDashTableMod.RowT
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
  var row: RowT
}

object Anon_Event {
  @scala.inline
  def apply(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], row: RowT): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

