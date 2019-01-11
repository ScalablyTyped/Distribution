package typings
package chromeLib.chromeNs.scriptBadgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.scriptBadge")
@js.native
object ^ extends js.Object {
  var onClicked: chromeLib.chromeNs.scriptBadgeNs.ScriptBadgeClickedEvent = js.native
  def getAttention(details: chromeLib.chromeNs.scriptBadgeNs.AttentionDetails): scala.Unit = js.native
  def getPopup(details: chromeLib.chromeNs.scriptBadgeNs.GetPopupDetails, callback: js.Function): scala.Unit = js.native
  def setPopup(details: chromeLib.chromeNs.scriptBadgeNs.SetPopupDetails): scala.Unit = js.native
}

