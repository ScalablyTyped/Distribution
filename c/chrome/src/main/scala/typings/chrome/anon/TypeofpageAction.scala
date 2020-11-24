package typings.chrome.anon

import typings.chrome.chrome.pageAction.GetDetails
import typings.chrome.chrome.pageAction.IconDetails
import typings.chrome.chrome.pageAction.PageActionClickedEvent
import typings.chrome.chrome.pageAction.PopupDetails
import typings.chrome.chrome.pageAction.TitleDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpageAction extends js.Object {
  
  def getPopup(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getTitle(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def hide(tabId: Double): Unit = js.native
  def hide(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  var onClicked: PageActionClickedEvent = js.native
  
  def setIcon(details: IconDetails): Unit = js.native
  def setIcon(details: IconDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setPopup(details: PopupDetails): Unit = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setTitle(details: TitleDetails): Unit = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def show(tabId: Double): Unit = js.native
  def show(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
}
