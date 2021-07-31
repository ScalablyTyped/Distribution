package typings.chrome.global.chrome

import typings.chrome.anon.AnnounceString
import typings.chrome.anon.ContextID
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object input {
  
  ////////////////////
  // Input - IME
  ////////////////////
  /**
    * Use the chrome.input.ime API to implement a custom IME for Chrome OS. This allows your extension to handle keystrokes, set the composition, and manage the candidate window.
    * Permissions:  "input"
    * @since Chrome 21.
    */
  object ime {
    
    @JSGlobal("chrome.input.ime")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clearComposition(parameters: ClearCompositionParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearComposition")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def clearComposition(parameters: ClearCompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearComposition")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def commitText(parameters: CommitTextParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("commitText")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def commitText(parameters: CommitTextParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitText")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def deleteSurroundingText(parameters: DeleteSurroundingTextParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSurroundingText")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def deleteSurroundingText(parameters: DeleteSurroundingTextParameters, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSurroundingText")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def hideInputView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideInputView")().asInstanceOf[Unit]
    
    @scala.inline
    def keyEventHandled(requestId: String, response: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyEventHandled")(requestId.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("chrome.input.ime.onActivate")
    @js.native
    def onActivate: ActivateEvent = js.native
    @scala.inline
    def onActivate_=(x: ActivateEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onAssistiveWindowButtonClicked")
    @js.native
    def onAssistiveWindowButtonClicked: AssistiveWindowButtonClickedEvent = js.native
    @scala.inline
    def onAssistiveWindowButtonClicked_=(x: AssistiveWindowButtonClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAssistiveWindowButtonClicked")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onBlur")
    @js.native
    def onBlur: BlurEvent = js.native
    @scala.inline
    def onBlur_=(x: BlurEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onCandidateClicked")
    @js.native
    def onCandidateClicked: CandidateClickedEvent = js.native
    @scala.inline
    def onCandidateClicked_=(x: CandidateClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCandidateClicked")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onDeactivated")
    @js.native
    def onDeactivated: DeactivatedEvent = js.native
    @scala.inline
    def onDeactivated_=(x: DeactivatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeactivated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onFocus")
    @js.native
    def onFocus: FocusEvent = js.native
    @scala.inline
    def onFocus_=(x: FocusEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onInputContextUpdate")
    @js.native
    def onInputContextUpdate: InputContextUpdateEvent = js.native
    @scala.inline
    def onInputContextUpdate_=(x: InputContextUpdateEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputContextUpdate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onKeyEvent")
    @js.native
    def onKeyEvent: KeyEventEvent = js.native
    @scala.inline
    def onKeyEvent_=(x: KeyEventEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyEvent")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onMenuItemActivated")
    @js.native
    def onMenuItemActivated: MenuItemActivatedEvent = js.native
    @scala.inline
    def onMenuItemActivated_=(x: MenuItemActivatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMenuItemActivated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onReset")
    @js.native
    def onReset: InputResetEvent = js.native
    @scala.inline
    def onReset_=(x: InputResetEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReset")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.input.ime.onSurroundingTextChanged")
    @js.native
    def onSurroundingTextChanged: SurroundingTextChangedEvent = js.native
    @scala.inline
    def onSurroundingTextChanged_=(x: SurroundingTextChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSurroundingTextChanged")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sendKeyEvents(parameters: SendKeyEventParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendKeyEvents")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def sendKeyEvents(parameters: SendKeyEventParameters, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendKeyEvents")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setAssistiveWindowButtonHighlighted(parameters: AnnounceString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAssistiveWindowButtonHighlighted")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setAssistiveWindowButtonHighlighted(parameters: AnnounceString, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAssistiveWindowButtonHighlighted")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setAssistiveWindowProperties(parameters: ContextID): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAssistiveWindowProperties")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setAssistiveWindowProperties(parameters: ContextID, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAssistiveWindowProperties")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setCandidateWindowProperties(parameters: CandidateWindowParameter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCandidateWindowProperties")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setCandidateWindowProperties(parameters: CandidateWindowParameter, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCandidateWindowProperties")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setCandidates(parameters: CandidatesParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCandidates")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setCandidates(parameters: CandidatesParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCandidates")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setComposition(parameters: CompositionParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setComposition")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setComposition(parameters: CompositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setComposition")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setCursorPosition(parameters: CursorPositionParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCursorPosition")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setCursorPosition(parameters: CursorPositionParameters, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCursorPosition")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setMenuItems(parameters: ImeParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMenuItems")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def setMenuItems(parameters: ImeParameters, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMenuItems")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def updateMenuItems(parameters: MenuItemParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateMenuItems")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def updateMenuItems(parameters: MenuItemParameters, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMenuItems")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
