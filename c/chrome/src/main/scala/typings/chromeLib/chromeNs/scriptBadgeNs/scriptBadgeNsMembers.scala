package typings
package chromeLib.chromeNs.scriptBadgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.scriptBadge")
@js.native
object scriptBadgeNsMembers extends js.Object {
  var onClicked: ScriptBadgeClickedEvent = js.native
  def getAttention(details: AttentionDetails): scala.Unit = js.native
  def getPopup(details: GetPopupDetails, callback: js.Function): scala.Unit = js.native
  def setPopup(details: SetPopupDetails): scala.Unit = js.native
}

