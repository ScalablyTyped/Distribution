package typings.baseui.phoneInputMod

import typings.baseui.anon.ReadonlyState
import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/phone-input", "StatefulPhoneInputContainer")
@js.native
class StatefulPhoneInputContainer ()
  extends Component[StatefulPhoneInputContainerProps, State, js.Any] {
  
  def internalSetState(`type`: StateChange, nextState: ReadonlyState): Unit = js.native
  
  def onCountryChange(event: OnChangeParams): Unit = js.native
  
  def onTextChange(event: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
}
