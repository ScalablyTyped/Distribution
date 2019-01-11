package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.input.ime")
@js.native
object ^ extends js.Object {
  var onActivate: chromeLib.chromeNs.inputNs.imeNs.ActivateEvent = js.native
  var onBlur: chromeLib.chromeNs.inputNs.imeNs.BlurEvent = js.native
  var onCandidateClicked: chromeLib.chromeNs.inputNs.imeNs.CandidateClickedEvent = js.native
  var onDeactivated: chromeLib.chromeNs.inputNs.imeNs.DeactivatedEvent = js.native
  var onFocus: chromeLib.chromeNs.inputNs.imeNs.FocusEvent = js.native
  var onInputContextUpdate: chromeLib.chromeNs.inputNs.imeNs.InputContextUpdateEvent = js.native
  var onKeyEvent: chromeLib.chromeNs.inputNs.imeNs.KeyEventEvent = js.native
  var onMenuItemActivated: chromeLib.chromeNs.inputNs.imeNs.MenuItemActivatedEvent = js.native
  var onReset: chromeLib.chromeNs.inputNs.imeNs.InputResetEvent = js.native
  var onSurroundingTextChanged: chromeLib.chromeNs.inputNs.imeNs.SurroundingTextChangedEvent = js.native
  def clearComposition(parameters: chromeLib.chromeNs.inputNs.imeNs.ClearCompositionParameters): scala.Unit = js.native
  def clearComposition(
    parameters: chromeLib.chromeNs.inputNs.imeNs.ClearCompositionParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def commitText(parameters: chromeLib.chromeNs.inputNs.imeNs.CommitTextParameters): scala.Unit = js.native
  def commitText(
    parameters: chromeLib.chromeNs.inputNs.imeNs.CommitTextParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def deleteSurroundingText(parameters: chromeLib.chromeNs.inputNs.imeNs.DeleteSurroundingTextParameters): scala.Unit = js.native
  def deleteSurroundingText(
    parameters: chromeLib.chromeNs.inputNs.imeNs.DeleteSurroundingTextParameters,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def hideInputView(): scala.Unit = js.native
  def keyEventHandled(requestId: java.lang.String, response: scala.Boolean): scala.Unit = js.native
  def sendKeyEvents(parameters: chromeLib.chromeNs.inputNs.imeNs.SendKeyEventParameters): scala.Unit = js.native
  def sendKeyEvents(
    parameters: chromeLib.chromeNs.inputNs.imeNs.SendKeyEventParameters,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setCandidateWindowProperties(parameters: chromeLib.chromeNs.inputNs.imeNs.CandidateWindowParameter): scala.Unit = js.native
  def setCandidateWindowProperties(
    parameters: chromeLib.chromeNs.inputNs.imeNs.CandidateWindowParameter,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setCandidates(parameters: chromeLib.chromeNs.inputNs.imeNs.CandidatesParameters): scala.Unit = js.native
  def setCandidates(
    parameters: chromeLib.chromeNs.inputNs.imeNs.CandidatesParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setComposition(parameters: chromeLib.chromeNs.inputNs.imeNs.CompositionParameters): scala.Unit = js.native
  def setComposition(
    parameters: chromeLib.chromeNs.inputNs.imeNs.CompositionParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setCursorPosition(parameters: chromeLib.chromeNs.inputNs.imeNs.CursorPositionParameters): scala.Unit = js.native
  def setCursorPosition(
    parameters: chromeLib.chromeNs.inputNs.imeNs.CursorPositionParameters,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setMenuItems(parameters: chromeLib.chromeNs.inputNs.imeNs.ImeParameters): scala.Unit = js.native
  def setMenuItems(parameters: chromeLib.chromeNs.inputNs.imeNs.ImeParameters, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def updateMenuItems(parameters: chromeLib.chromeNs.inputNs.imeNs.MenuItemParameters): scala.Unit = js.native
  def updateMenuItems(
    parameters: chromeLib.chromeNs.inputNs.imeNs.MenuItemParameters,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

