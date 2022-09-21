package typings.chrome.global.chrome

import typings.chrome.chrome.action.BadgeBackgroundColorDetails
import typings.chrome.chrome.action.BadgeTextDetails
import typings.chrome.chrome.action.BrowserClickedEvent
import typings.chrome.chrome.action.ColorArray
import typings.chrome.chrome.action.PopupDetails
import typings.chrome.chrome.action.TabDetails
import typings.chrome.chrome.action.TabIconDetails
import typings.chrome.chrome.action.TitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Action
////////////////////
/**
  * Use the chrome.action API to control the extension's icon in the Google Chrome toolbar.
  * Availability: Since Chrome 88. Manifest v3.
  * Manifest:  "action": {...}
  */
object action {
  
  @JSGlobal("chrome.action")
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  inline def disable(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disable(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def disable(tabId: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disable_Promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.Promise[Unit]]
  inline def disable_Promise(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  inline def enable(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enable(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enable(tabId: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enable_Promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[js.Promise[Unit]]
  inline def enable_Promise(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBadgeBackgroundColor(details: TabDetails): js.Promise[ColorArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ColorArray]]
  inline def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBadgeText(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPopup(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTitle(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.action.onClicked")
  @js.native
  def onClicked: BrowserClickedEvent = js.native
  inline def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  inline def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeBackgroundColor_Promise(details: BadgeBackgroundColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setBadgeText(details: BadgeTextDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeText_Promise(details: BadgeTextDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setIcon(details: TabIconDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setIcon(details: TabIconDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPopup(details: PopupDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPopup_Promise(details: PopupDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setTitle(details: TitleDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTitle_Promise(details: TitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
