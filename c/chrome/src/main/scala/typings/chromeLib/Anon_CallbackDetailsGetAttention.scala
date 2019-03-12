package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDetailsGetAttention extends js.Object {
  var onClicked: chromeLib.chromeNs.scriptBadgeNs.ScriptBadgeClickedEvent
  def getAttention(details: chromeLib.chromeNs.scriptBadgeNs.AttentionDetails): scala.Unit
  def getPopup(details: chromeLib.chromeNs.scriptBadgeNs.GetPopupDetails, callback: js.Function): scala.Unit
  def setPopup(details: chromeLib.chromeNs.scriptBadgeNs.SetPopupDetails): scala.Unit
}

object Anon_CallbackDetailsGetAttention {
  @scala.inline
  def apply(
    getAttention: chromeLib.chromeNs.scriptBadgeNs.AttentionDetails => scala.Unit,
    getPopup: (chromeLib.chromeNs.scriptBadgeNs.GetPopupDetails, js.Function) => scala.Unit,
    onClicked: chromeLib.chromeNs.scriptBadgeNs.ScriptBadgeClickedEvent,
    setPopup: chromeLib.chromeNs.scriptBadgeNs.SetPopupDetails => scala.Unit
  ): Anon_CallbackDetailsGetAttention = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1(getAttention), getPopup = js.Any.fromFunction2(getPopup), onClicked = onClicked, setPopup = js.Any.fromFunction1(setPopup))
  
    __obj.asInstanceOf[Anon_CallbackDetailsGetAttention]
  }
}

