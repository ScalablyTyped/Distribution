package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.input.ime")
@js.native
object imeNsMembers extends js.Object {
  var onActivate: ActivateEvent = js.native
  var onBlur: BlurEvent = js.native
  var onCandidateClicked: CandidateClickedEvent = js.native
  var onDeactivated: DeactivatedEvent = js.native
  var onFocus: FocusEvent = js.native
  var onInputContextUpdate: InputContextUpdateEvent = js.native
  var onKeyEvent: KeyEventEvent = js.native
  var onMenuItemActivated: MenuItemActivatedEvent = js.native
  var onReset: InputResetEvent = js.native
  var onSurroundingTextChanged: SurroundingTextChangedEvent = js.native
  def clearComposition(parameters: ClearCompositionParameters): scala.Unit = js.native
  def clearComposition(
    parameters: ClearCompositionParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def commitText(parameters: CommitTextParameters): scala.Unit = js.native
  def commitText(parameters: CommitTextParameters, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters): scala.Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def hideInputView(): scala.Unit = js.native
  def keyEventHandled(requestId: java.lang.String, response: scala.Boolean): scala.Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters): scala.Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setCandidateWindowProperties(parameters: CandidateWindowParameter): scala.Unit = js.native
  def setCandidateWindowProperties(
    parameters: CandidateWindowParameter,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setCandidates(parameters: CandidatesParameters): scala.Unit = js.native
  def setCandidates(parameters: CandidatesParameters, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def setComposition(parameters: CompositionParameters): scala.Unit = js.native
  def setComposition(parameters: CompositionParameters, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def setCursorPosition(parameters: CursorPositionParameters): scala.Unit = js.native
  def setCursorPosition(
    parameters: CursorPositionParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setMenuItems(parameters: ImeParameters): scala.Unit = js.native
  def setMenuItems(parameters: ImeParameters, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def updateMenuItems(parameters: MenuItemParameters): scala.Unit = js.native
  def updateMenuItems(parameters: MenuItemParameters, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

