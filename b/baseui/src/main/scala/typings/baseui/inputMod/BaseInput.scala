package typings.baseui.inputMod

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/input", "BaseInput")
@js.native
class BaseInput ()
  extends Component[BaseInputProps[HTMLInputElement], InternalState, js.Any] {
  
  def onBlur(e: FocusEvent[HTMLInputElement]): Unit = js.native
  
  def onFocus(e: FocusEvent[HTMLInputElement]): Unit = js.native
}
