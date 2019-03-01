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
    getAttention: js.Function1[chromeLib.chromeNs.scriptBadgeNs.AttentionDetails, scala.Unit],
    getPopup: js.Function2[chromeLib.chromeNs.scriptBadgeNs.GetPopupDetails, js.Function, scala.Unit],
    onClicked: chromeLib.chromeNs.scriptBadgeNs.ScriptBadgeClickedEvent,
    setPopup: js.Function1[chromeLib.chromeNs.scriptBadgeNs.SetPopupDetails, scala.Unit]
  ): Anon_CallbackDetailsGetAttention = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttention")(getAttention)
    __obj.updateDynamic("getPopup")(getPopup)
    __obj.updateDynamic("onClicked")(onClicked)
    __obj.updateDynamic("setPopup")(setPopup)
    __obj.asInstanceOf[Anon_CallbackDetailsGetAttention]
  }
}

