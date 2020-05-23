package typings.chrome.global.chrome

import typings.chrome.chrome.windows.CreateData
import typings.chrome.chrome.windows.GetInfo
import typings.chrome.chrome.windows.UpdateInfo
import typings.chrome.chrome.windows.Window
import typings.chrome.chrome.windows.WindowIdEvent
import typings.chrome.chrome.windows.WindowReferenceEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Windows
////////////////////
/**
  * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
  * @since Chrome 5.
  */
@JSGlobal("chrome.windows")
@js.native
object windows extends js.Object {
  var WINDOW_ID_CURRENT: Double = js.native
  var WINDOW_ID_NONE: Double = js.native
  var onCreated: WindowReferenceEvent = js.native
  var onFocusChanged: WindowIdEvent = js.native
  var onRemoved: WindowIdEvent = js.native
  def create(): Unit = js.native
  def create(callback: js.Function1[/* window */ js.UndefOr[Window], Unit]): Unit = js.native
  def create(createData: CreateData): Unit = js.native
  def create(createData: CreateData, callback: js.Function1[/* window */ js.UndefOr[Window], Unit]): Unit = js.native
  def get(windowId: Double, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  def get(windowId: Double, getInfo: GetInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  def getAll(callback: js.Function1[/* windows */ js.Array[Window], Unit]): Unit = js.native
  def getAll(getInfo: GetInfo, callback: js.Function1[/* windows */ js.Array[Window], Unit]): Unit = js.native
  def getCurrent(callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  def getCurrent(getInfo: GetInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  def getLastFocused(callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  def getLastFocused(getInfo: GetInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  def remove(windowId: Double): Unit = js.native
  def remove(windowId: Double, callback: js.Function): Unit = js.native
  def update(windowId: Double, updateInfo: UpdateInfo): Unit = js.native
  def update(windowId: Double, updateInfo: UpdateInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
}

