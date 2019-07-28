package typings.chrome.chromeNs.scriptBadgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.scriptBadge")
@js.native
object ^ extends js.Object {
  var onClicked: ScriptBadgeClickedEvent = js.native
  def getAttention(details: AttentionDetails): Unit = js.native
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  def setPopup(details: SetPopupDetails): Unit = js.native
}

