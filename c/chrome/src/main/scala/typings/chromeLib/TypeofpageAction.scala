package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofpageAction extends js.Object {
  var onClicked: chromeLib.chromeNs.pageActionNs.PageActionClickedEvent = js.native
  def getPopup(
    details: chromeLib.chromeNs.pageActionNs.GetDetails,
    callback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getTitle(
    details: chromeLib.chromeNs.pageActionNs.GetDetails,
    callback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def hide(tabId: scala.Double): scala.Unit = js.native
  def hide(tabId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setIcon(details: chromeLib.chromeNs.pageActionNs.IconDetails): scala.Unit = js.native
  def setIcon(details: chromeLib.chromeNs.pageActionNs.IconDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setPopup(details: chromeLib.chromeNs.pageActionNs.PopupDetails): scala.Unit = js.native
  def setPopup(details: chromeLib.chromeNs.pageActionNs.PopupDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setTitle(details: chromeLib.chromeNs.pageActionNs.TitleDetails): scala.Unit = js.native
  def setTitle(details: chromeLib.chromeNs.pageActionNs.TitleDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def show(tabId: scala.Double): scala.Unit = js.native
  def show(tabId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

