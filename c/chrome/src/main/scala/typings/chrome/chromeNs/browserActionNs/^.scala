package typings.chrome.chromeNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction")
@js.native
object ^ extends js.Object {
  var onClicked: BrowserClickedEvent = js.native
  def disable(): Unit = js.native
  def disable(tabId: Double): Unit = js.native
  def disable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def enable(): Unit = js.native
  def enable(tabId: Double): Unit = js.native
  def enable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = js.native
  def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[Unit]): Unit = js.native
  def setBadgeText(details: BadgeTextDetails): Unit = js.native
  def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = js.native
  def setIcon(details: TabIconDetails): Unit = js.native
  def setIcon(details: TabIconDetails, callback: js.Function): Unit = js.native
  def setPopup(details: PopupDetails): Unit = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  def setTitle(details: TitleDetails): Unit = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
}

