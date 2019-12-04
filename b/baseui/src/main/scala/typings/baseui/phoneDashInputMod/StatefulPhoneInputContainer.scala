package typings.baseui.phoneDashInputMod

import typings.baseui.selectMod.OnChangeParams
import typings.react.reactMod.Component
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/phone-input", "StatefulPhoneInputContainer")
@js.native
class StatefulPhoneInputContainer ()
  extends Component[StatefulPhoneInputContainerProps, State, js.Any] {
  def internalSetState(`type`: StateChange, nextState: State): Unit = js.native
  def onCountryChange(event: OnChangeParams): Unit = js.native
  def onTextChange(event: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
}

