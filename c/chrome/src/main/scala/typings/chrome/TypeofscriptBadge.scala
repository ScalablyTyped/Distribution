package typings.chrome

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofscriptBadge extends js.Object {
  var onClicked: ScriptBadgeClickedEvent
  def getAttention(details: AttentionDetails): Unit
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit
  def setPopup(details: SetPopupDetails): Unit
}

object TypeofscriptBadge {
  @scala.inline
  def apply(
    getAttention: AttentionDetails => Unit,
    getPopup: (GetPopupDetails, js.Function) => Unit,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Unit
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1(getAttention), getPopup = js.Any.fromFunction2(getPopup), onClicked = onClicked, setPopup = js.Any.fromFunction1(setPopup))
  
    __obj.asInstanceOf[TypeofscriptBadge]
  }
}

