package typings.chrome.global.chrome

import typings.chrome.chrome.pageAction.GetDetails
import typings.chrome.chrome.pageAction.IconDetails
import typings.chrome.chrome.pageAction.PageActionClickedEvent
import typings.chrome.chrome.pageAction.PopupDetails
import typings.chrome.chrome.pageAction.TitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def getPopup(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getTitle(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def hide(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def hide(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hide")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.pageAction.onClicked")
  @js.native
  def onClicked: PageActionClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: PageActionClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setIcon(details: IconDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setIcon(details: IconDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setPopup(details: PopupDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTitle(details: TitleDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def show(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
