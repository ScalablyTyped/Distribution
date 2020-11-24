package typings.chrome.anon

import typings.chrome.chrome.input.ime.ActivateEvent
import typings.chrome.chrome.input.ime.AssistiveWindowButtonClickedEvent
import typings.chrome.chrome.input.ime.BlurEvent
import typings.chrome.chrome.input.ime.CandidateClickedEvent
import typings.chrome.chrome.input.ime.CandidateWindowParameter
import typings.chrome.chrome.input.ime.CandidatesParameters
import typings.chrome.chrome.input.ime.ClearCompositionParameters
import typings.chrome.chrome.input.ime.CommitTextParameters
import typings.chrome.chrome.input.ime.CompositionParameters
import typings.chrome.chrome.input.ime.CursorPositionParameters
import typings.chrome.chrome.input.ime.DeactivatedEvent
import typings.chrome.chrome.input.ime.DeleteSurroundingTextParameters
import typings.chrome.chrome.input.ime.FocusEvent
import typings.chrome.chrome.input.ime.ImeParameters
import typings.chrome.chrome.input.ime.InputContextUpdateEvent
import typings.chrome.chrome.input.ime.InputResetEvent
import typings.chrome.chrome.input.ime.KeyEventEvent
import typings.chrome.chrome.input.ime.MenuItemActivatedEvent
import typings.chrome.chrome.input.ime.MenuItemParameters
import typings.chrome.chrome.input.ime.SendKeyEventParameters
import typings.chrome.chrome.input.ime.SurroundingTextChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofime extends js.Object {
  
  def clearComposition(parameters: ClearCompositionParameters): Unit = js.native
  def clearComposition(parameters: ClearCompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  def commitText(parameters: CommitTextParameters): Unit = js.native
  def commitText(parameters: CommitTextParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters): Unit = js.native
  def deleteSurroundingText(parameters: DeleteSurroundingTextParameters, callback: js.Function0[Unit]): Unit = js.native
  
  def hideInputView(): Unit = js.native
  
  def keyEventHandled(requestId: String, response: Boolean): Unit = js.native
  
  var onActivate: ActivateEvent = js.native
  
  var onAssistiveWindowButtonClicked: AssistiveWindowButtonClickedEvent = js.native
  
  var onBlur: BlurEvent = js.native
  
  var onCandidateClicked: CandidateClickedEvent = js.native
  
  var onDeactivated: DeactivatedEvent = js.native
  
  var onFocus: FocusEvent = js.native
  
  var onInputContextUpdate: InputContextUpdateEvent = js.native
  
  var onKeyEvent: KeyEventEvent = js.native
  
  var onMenuItemActivated: MenuItemActivatedEvent = js.native
  
  var onReset: InputResetEvent = js.native
  
  var onSurroundingTextChanged: SurroundingTextChangedEvent = js.native
  
  def sendKeyEvents(parameters: SendKeyEventParameters): Unit = js.native
  def sendKeyEvents(parameters: SendKeyEventParameters, callback: js.Function0[Unit]): Unit = js.native
  
  def setAssistiveWindowButtonHighlighted(parameters: AnnounceString): Unit = js.native
  def setAssistiveWindowButtonHighlighted(parameters: AnnounceString, callback: js.Function0[Unit]): Unit = js.native
  
  def setAssistiveWindowProperties(parameters: ContextID): Unit = js.native
  def setAssistiveWindowProperties(parameters: ContextID, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
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
