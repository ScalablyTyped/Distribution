package typings.chrome.global.chrome

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Script Badge
////////////////////
object scriptBadge {
  
  @JSGlobal("chrome.scriptBadge")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.scriptBadge.getAttention")
  @js.native
  def getAttention(details: AttentionDetails): Unit = js.native
  
  @JSGlobal("chrome.scriptBadge.getPopup")
  @js.native
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.scriptBadge.onClicked")
  @js.native
  def onClicked: ScriptBadgeClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: ScriptBadgeClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.scriptBadge.setPopup")
  @js.native
  def setPopup(details: SetPopupDetails): Unit = js.native
}
