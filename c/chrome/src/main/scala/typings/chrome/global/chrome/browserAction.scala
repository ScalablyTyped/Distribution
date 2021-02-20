package typings.chrome.global.chrome

import typings.chrome.chrome.browserAction.BadgeBackgroundColorDetails
import typings.chrome.chrome.browserAction.BadgeTextDetails
import typings.chrome.chrome.browserAction.BrowserClickedEvent
import typings.chrome.chrome.browserAction.ColorArray
import typings.chrome.chrome.browserAction.PopupDetails
import typings.chrome.chrome.browserAction.TabDetails
import typings.chrome.chrome.browserAction.TabIconDetails
import typings.chrome.chrome.browserAction.TitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Browser Action
////////////////////
/**
  * Use browser actions to put icons in the main Google Chrome toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
  * Availability: Since Chrome 5.
  * Manifest:  "browser_action": {...}
  */
object browserAction {
  
  @JSGlobal("chrome.browserAction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.browserAction.disable")
  @js.native
  def disable(): Unit = js.native
  @JSGlobal("chrome.browserAction.disable")
  @js.native
  def disable(tabId: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.browserAction.disable")
  @js.native
  def disable(tabId: Double): Unit = js.native
  @JSGlobal("chrome.browserAction.disable")
  @js.native
  def disable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.enable")
  @js.native
  def enable(): Unit = js.native
  @JSGlobal("chrome.browserAction.enable")
  @js.native
  def enable(tabId: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.browserAction.enable")
  @js.native
  def enable(tabId: Double): Unit = js.native
  @JSGlobal("chrome.browserAction.enable")
  @js.native
  def enable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.getBadgeBackgroundColor")
  @js.native
  def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.getBadgeText")
  @js.native
  def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.getPopup")
  @js.native
  def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.getTitle")
  @js.native
  def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.onClicked")
  @js.native
  def onClicked: BrowserClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.browserAction.setBadgeBackgroundColor")
  @js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
  @JSGlobal("chrome.browserAction.setBadgeBackgroundColor")
  @js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.setBadgeText")
  @js.native
  def setBadgeText(details: BadgeTextDetails): Unit = js.native
  @JSGlobal("chrome.browserAction.setBadgeText")
  @js.native
  def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.setIcon")
  @js.native
  def setIcon(details: TabIconDetails): Unit = js.native
  @JSGlobal("chrome.browserAction.setIcon")
  @js.native
  def setIcon(details: TabIconDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.browserAction.setPopup")
  @js.native
  def setPopup(details: PopupDetails): Unit = js.native
  @JSGlobal("chrome.browserAction.setPopup")
  @js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.browserAction.setTitle")
  @js.native
  def setTitle(details: TitleDetails): Unit = js.native
  @JSGlobal("chrome.browserAction.setTitle")
  @js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
}
