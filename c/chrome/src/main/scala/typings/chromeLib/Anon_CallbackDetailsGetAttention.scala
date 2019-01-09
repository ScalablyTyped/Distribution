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

