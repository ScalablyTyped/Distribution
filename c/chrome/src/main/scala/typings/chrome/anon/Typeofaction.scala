package typings.chrome.anon

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

@js.native
trait Typeofaction extends StObject {
  
  def disable(): js.Promise[Unit] = js.native
  def disable(callback: js.Function0[Unit]): Unit = js.native
  def disable(tabId: Double): js.Promise[Unit] = js.native
  def disable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def enable(): js.Promise[Unit] = js.native
  def enable(callback: js.Function0[Unit]): Unit = js.native
  def enable(tabId: Double): js.Promise[Unit] = js.native
  def enable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def getBadgeBackgroundColor(details: TabDetails): js.Promise[ColorArray] = js.native
  def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = js.native
  
  def getBadgeText(details: TabDetails): js.Promise[String] = js.native
  def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getBadgeTextColor(details: TabDetails): js.Promise[ColorArray] = js.native
  def getBadgeTextColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = js.native
  
  def getPopup(details: TabDetails): js.Promise[String] = js.native
  def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getTitle(details: TabDetails): js.Promise[String] = js.native
  def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getUserSettings(): js.Promise[UserSettings] = js.native
  def getUserSettings(callback: js.Function1[/* userSettings */ UserSettings, Unit]): Unit = js.native
  
  def isEnabled(): js.Promise[Boolean] = js.native
  def isEnabled(tabId: Double): js.Promise[Boolean] = js.native
  def isEnabled(tabId: Double, callback: js.Function1[/* isEnabled */ Boolean, Unit]): Unit = js.native
  def isEnabled(tabId: Unit, callback: js.Function1[/* isEnabled */ Boolean, Unit]): Unit = js.native
  
  var onClicked: BrowserClickedEvent = js.native
  
  def openPopup(): js.Promise[Unit] = js.native
  def openPopup(callback: js.Function0[Unit]): Unit = js.native
  def openPopup(options: OpenPopupOptions): js.Promise[Unit] = js.native
  def openPopup(options: OpenPopupOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def setBadgeBackgroundColor(details: BadgeColorDetails): js.Promise[Unit] = js.native
  def setBadgeBackgroundColor(details: BadgeColorDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setBadgeText(details: BadgeTextDetails): js.Promise[Unit] = js.native
  def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setBadgeTextColor(details: BadgeColorDetails): js.Promise[Unit] = js.native
  def setBadgeTextColor(details: BadgeColorDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setIcon(details: TabIconDetails): js.Promise[Unit] = js.native
  def setIcon(details: TabIconDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setPopup(details: PopupDetails): js.Promise[Unit] = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setTitle(details: TitleDetails): js.Promise[Unit] = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
}
