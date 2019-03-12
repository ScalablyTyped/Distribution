package typings
package chromeLib.chromeNs.pageActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.pageAction")
@js.native
object ^ extends js.Object {
  var onClicked: PageActionClickedEvent = js.native
  def getPopup(details: GetDetails, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getTitle(details: GetDetails, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def hide(tabId: scala.Double): scala.Unit = js.native
  def hide(tabId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setIcon(details: IconDetails): scala.Unit = js.native
  def setIcon(details: IconDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setPopup(details: PopupDetails): scala.Unit = js.native
  def setTitle(details: TitleDetails): scala.Unit = js.native
  def show(tabId: scala.Double): scala.Unit = js.native
  def show(tabId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

