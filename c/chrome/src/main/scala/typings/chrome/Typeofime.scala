package typings.chrome

import typings.chrome.chromeNs.inputNs.imeNs.ActivateEvent
import typings.chrome.chromeNs.inputNs.imeNs.BlurEvent
import typings.chrome.chromeNs.inputNs.imeNs.CandidateClickedEvent
import typings.chrome.chromeNs.inputNs.imeNs.CandidateWindowParameter
import typings.chrome.chromeNs.inputNs.imeNs.CandidatesParameters
import typings.chrome.chromeNs.inputNs.imeNs.ClearCompositionParameters
import typings.chrome.chromeNs.inputNs.imeNs.CommitTextParameters
import typings.chrome.chromeNs.inputNs.imeNs.CompositionParameters
import typings.chrome.chromeNs.inputNs.imeNs.CursorPositionParameters
import typings.chrome.chromeNs.inputNs.imeNs.DeactivatedEvent
import typings.chrome.chromeNs.inputNs.imeNs.DeleteSurroundingTextParameters
import typings.chrome.chromeNs.inputNs.imeNs.FocusEvent
import typings.chrome.chromeNs.inputNs.imeNs.ImeParameters
import typings.chrome.chromeNs.inputNs.imeNs.InputContextUpdateEvent
import typings.chrome.chromeNs.inputNs.imeNs.InputResetEvent
import typings.chrome.chromeNs.inputNs.imeNs.KeyEventEvent
import typings.chrome.chromeNs.inputNs.imeNs.MenuItemActivatedEvent
import typings.chrome.chromeNs.inputNs.imeNs.MenuItemParameters
import typings.chrome.chromeNs.inputNs.imeNs.SendKeyEventParameters
import typings.chrome.chromeNs.inputNs.imeNs.SurroundingTextChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofime extends js.Object {
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

