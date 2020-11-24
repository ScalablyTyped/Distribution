package typings.chrome.global.chrome

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Script Badge
////////////////////
@JSGlobal("chrome.scriptBadge")
@js.native
object scriptBadge extends js.Object {
  
  def getAttention(details: AttentionDetails): Unit = js.native
  
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  
  var onClicked: ScriptBadgeClickedEvent = js.native
  
  def setPopup(details: SetPopupDetails): Unit = js.native
}
