package typings.chrome.anon

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

@js.native
trait Typeofaction extends StObject {
  
  def disable(): Unit = js.native
  def disable(tabId: Double): Unit = js.native
  def disable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def disable(tabId: Unit, callback: js.Function0[Unit]): Unit = js.native
  @JSName("disable")
  def disable_Promise(): js.Promise[Unit] = js.native
  @JSName("disable")
  def disable_Promise(tabId: Double): js.Promise[Unit] = js.native
  
  def enable(): Unit = js.native
  def enable(tabId: Double): Unit = js.native
  def enable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def enable(tabId: Unit, callback: js.Function0[Unit]): Unit = js.native
  @JSName("enable")
  def enable_Promise(): js.Promise[Unit] = js.native
  @JSName("enable")
  def enable_Promise(tabId: Double): js.Promise[Unit] = js.native
  
  def getBadgeBackgroundColor(details: TabDetails): js.Promise[ColorArray] = js.native
  def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = js.native
  
  def getBadgeText(details: TabDetails): js.Promise[String] = js.native
  def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getPopup(details: TabDetails): js.Promise[String] = js.native
  def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getTitle(details: TabDetails): js.Promise[String] = js.native
  def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  var onClicked: BrowserClickedEvent = js.native
  
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[Unit]): Unit = js.native
  @JSName("setBadgeBackgroundColor")
  def setBadgeBackgroundColor_Promise(details: BadgeBackgroundColorDetails): js.Promise[Unit] = js.native
  
  def setBadgeText(details: BadgeTextDetails): Unit = js.native
  def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = js.native
  @JSName("setBadgeText")
  def setBadgeText_Promise(details: BadgeTextDetails): js.Promise[Unit] = js.native
  
  def setIcon(details: TabIconDetails): Unit = js.native
  def setIcon(details: TabIconDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setPopup(details: PopupDetails): Unit = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  @JSName("setPopup")
  def setPopup_Promise(details: PopupDetails): js.Promise[Unit] = js.native
  
  def setTitle(details: TitleDetails): Unit = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
  @JSName("setTitle")
  def setTitle_Promise(details: TitleDetails): js.Promise[Unit] = js.native
}
