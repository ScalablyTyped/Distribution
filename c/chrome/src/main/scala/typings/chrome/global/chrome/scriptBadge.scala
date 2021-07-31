package typings.chrome.global.chrome

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Script Badge
////////////////////
object scriptBadge {
  
  @JSGlobal("chrome.scriptBadge")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAttention(details: AttentionDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttention")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.scriptBadge.onClicked")
  @js.native
  def onClicked: ScriptBadgeClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: ScriptBadgeClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setPopup(details: SetPopupDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
