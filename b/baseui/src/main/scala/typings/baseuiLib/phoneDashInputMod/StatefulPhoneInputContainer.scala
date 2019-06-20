package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/phone-input", "StatefulPhoneInputContainer")
@js.native
class StatefulPhoneInputContainer ()
  extends reactLib.reactMod.Component[StatefulPhoneInputContainerProps, State, js.Any] {
  def internalSetState(`type`: StateChange, nextState: State): scala.Unit = js.native
  def onCountryChange(event: baseuiLib.selectMod.OnChangeParams): scala.Unit = js.native
  def onTextChange(event: reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event]): scala.Unit = js.native
}

