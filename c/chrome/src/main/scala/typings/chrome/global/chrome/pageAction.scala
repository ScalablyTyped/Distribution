package typings.chrome.global.chrome

import typings.chrome.chrome.pageAction.GetDetails
import typings.chrome.chrome.pageAction.IconDetails
import typings.chrome.chrome.pageAction.PageActionClickedEvent
import typings.chrome.chrome.pageAction.PopupDetails
import typings.chrome.chrome.pageAction.TitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Page Action
////////////////////
/**
  * Use the chrome.pageAction API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
  * Manifest:  "page_action": {...}
  * @since Chrome 5.
  */
object pageAction {
  
  @JSGlobal("chrome.pageAction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.pageAction.getPopup")
  @js.native
  def getPopup(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.pageAction.getTitle")
  @js.native
  def getTitle(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.pageAction.hide")
  @js.native
  def hide(tabId: Double): Unit = js.native
  @JSGlobal("chrome.pageAction.hide")
  @js.native
  def hide(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.pageAction.onClicked")
  @js.native
  def onClicked: PageActionClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: PageActionClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.pageAction.setIcon")
  @js.native
  def setIcon(details: IconDetails): Unit = js.native
  @JSGlobal("chrome.pageAction.setIcon")
  @js.native
  def setIcon(details: IconDetails, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.pageAction.setPopup")
  @js.native
  def setPopup(details: PopupDetails): Unit = js.native
  @JSGlobal("chrome.pageAction.setPopup")
  @js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.pageAction.setTitle")
  @js.native
  def setTitle(details: TitleDetails): Unit = js.native
  @JSGlobal("chrome.pageAction.setTitle")
  @js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.pageAction.show")
  @js.native
  def show(tabId: Double): Unit = js.native
  @JSGlobal("chrome.pageAction.show")
  @js.native
  def show(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
}
