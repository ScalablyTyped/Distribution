package typings.baseui.inputMod

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/input", "Input")
@js.native
class Input ()
  extends Component[InputProps, InternalState, js.Any] {
  def onBlur(e: FocusEvent[HTMLInputElement]): Unit = js.native
  def onFocus(e: FocusEvent[HTMLInputElement]): Unit = js.native
}

