package typings.chrome.global.chrome

import typings.chrome.chrome.action.BadgeColorDetails
import typings.chrome.chrome.action.BadgeTextDetails
import typings.chrome.chrome.action.BrowserClickedEvent
import typings.chrome.chrome.action.ColorArray
import typings.chrome.chrome.action.OpenPopupOptions
import typings.chrome.chrome.action.PopupDetails
import typings.chrome.chrome.action.TabDetails
import typings.chrome.chrome.action.TabIconDetails
import typings.chrome.chrome.action.TitleDetails
import typings.chrome.chrome.action.UserSettings
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
  
  inline def disable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.Promise[Unit]]
  inline def disable(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disable(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def disable(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[js.Promise[Unit]]
  inline def enable(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enable(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def enable(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBadgeBackgroundColor(details: TabDetails): js.Promise[ColorArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ColorArray]]
  inline def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBadgeText(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBadgeTextColor(details: TabDetails): js.Promise[ColorArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeTextColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ColorArray]]
  inline def getBadgeTextColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeTextColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPopup(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTitle(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getUserSettings(): js.Promise[UserSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserSettings")().asInstanceOf[js.Promise[UserSettings]]
  inline def getUserSettings(callback: js.Function1[/* userSettings */ UserSettings, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserSettings")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[js.Promise[Boolean]]
  inline def isEnabled(tabId: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def isEnabled(tabId: Double, callback: js.Function1[/* isEnabled */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isEnabled(tabId: Unit, callback: js.Function1[/* isEnabled */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.action.onClicked")
  @js.native
  def onClicked: BrowserClickedEvent = js.native
  inline def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  inline def openPopup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")().asInstanceOf[js.Promise[Unit]]
  inline def openPopup(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def openPopup(options: OpenPopupOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def openPopup(options: OpenPopupOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeBackgroundColor(details: BadgeColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setBadgeBackgroundColor(details: BadgeColorDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeText(details: BadgeTextDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeTextColor(details: BadgeColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeTextColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setBadgeTextColor(details: BadgeColorDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeTextColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setIcon(details: TabIconDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setIcon(details: TabIconDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPopup(details: PopupDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTitle(details: TitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
