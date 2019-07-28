package typings.chrome.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.input.ime")
@js.native
object ^ extends js.Object {
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
  def clearComposition(parameters: ClearCompositionParameters): Unit = js.native
  def clearComposition(parameters: ClearCompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def commitText(parameters: CommitTextParameters): Unit = js.native
  def commitText(parameters: CommitTextParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters): Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters, callback: js.Function0[Unit]): Unit = js.native
  def hideInputView(): Unit = js.native
  def keyEventHandled(requestId: String, response: Boolean): Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters): Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters, callback: js.Function0[Unit]): Unit = js.native
  def setCandidateWindowProperties(parameters: CandidateWindowParameter): Unit = js.native
  def setCandidateWindowProperties(parameters: CandidateWindowParameter, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setCandidates(parameters: CandidatesParameters): Unit = js.native
  def setCandidates(parameters: CandidatesParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setComposition(parameters: CompositionParameters): Unit = js.native
  def setComposition(parameters: CompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setCursorPosition(parameters: CursorPositionParameters): Unit = js.native
  def setCursorPosition(parameters: CursorPositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  def setMenuItems(parameters: ImeParameters): Unit = js.native
  def setMenuItems(parameters: ImeParameters, callback: js.Function0[Unit]): Unit = js.native
  def updateMenuItems(parameters: MenuItemParameters): Unit = js.native
  def updateMenuItems(parameters: MenuItemParameters, callback: js.Function0[Unit]): Unit = js.native
}

