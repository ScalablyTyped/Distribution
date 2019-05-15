package typings
package chromeLib.chromeNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction")
@js.native
object ^ extends js.Object {
  var onClicked: BrowserClickedEvent = js.native
  def disable(): scala.Unit = js.native
  def disable(tabId: scala.Double): scala.Unit = js.native
  def disable(tabId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(tabId: scala.Double): scala.Unit = js.native
  def enable(tabId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, scala.Unit]): scala.Unit = js.native
  def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getPopup(details: TabDetails, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getTitle(details: TabDetails, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): scala.Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setBadgeText(details: BadgeTextDetails): scala.Unit = js.native
  def setBadgeText(details: BadgeTextDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setIcon(details: TabIconDetails): scala.Unit = js.native
  def setIcon(details: TabIconDetails, callback: js.Function): scala.Unit = js.native
  def setPopup(details: PopupDetails): scala.Unit = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setTitle(details: TitleDetails): scala.Unit = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

