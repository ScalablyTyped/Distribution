package typings.baseui.checkboxMod

import typings.react.reactMod.Component
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/checkbox", "Checkbox")
@js.native
class Checkbox ()
  extends Component[CheckboxProps, CheckboxState, js.Any] {
  def onBlur(event: FocusEvent[HTMLInputElement]): Unit = js.native
  def onFocus(event: FocusEvent[HTMLInputElement]): Unit = js.native
  def onMouseDown(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
  def onMouseEnter(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
  def onMouseLeave(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
  def onMouseUp(event: MouseEvent[HTMLInputElement, NativeMouseEvent]): Unit = js.native
}

