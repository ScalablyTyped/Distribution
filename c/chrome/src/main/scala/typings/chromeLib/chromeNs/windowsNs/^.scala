package typings
package chromeLib.chromeNs.windowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows")
@js.native
object ^ extends js.Object {
  var WINDOW_ID_CURRENT: scala.Double = js.native
  var WINDOW_ID_NONE: scala.Double = js.native
  var onCreated: WindowReferenceEvent = js.native
  var onFocusChanged: WindowIdEvent = js.native
  var onRemoved: WindowIdEvent = js.native
  def create(): scala.Unit = js.native
  def create(callback: js.Function1[/* window */ js.UndefOr[Window], scala.Unit]): scala.Unit = js.native
  def create(createData: CreateData): scala.Unit = js.native
  def create(createData: CreateData, callback: js.Function1[/* window */ js.UndefOr[Window], scala.Unit]): scala.Unit = js.native
  def get(windowId: scala.Double, callback: js.Function1[/* window */ Window, scala.Unit]): scala.Unit = js.native
  def get(windowId: scala.Double, getInfo: GetInfo, callback: js.Function1[/* window */ Window, scala.Unit]): scala.Unit = js.native
  def getAll(callback: js.Function1[/* windows */ js.Array[Window], scala.Unit]): scala.Unit = js.native
  def getAll(getInfo: GetInfo, callback: js.Function1[/* windows */ js.Array[Window], scala.Unit]): scala.Unit = js.native
  def getCurrent(callback: js.Function1[/* window */ Window, scala.Unit]): scala.Unit = js.native
  def getCurrent(getInfo: GetInfo, callback: js.Function1[/* window */ Window, scala.Unit]): scala.Unit = js.native
  def getLastFocused(callback: js.Function1[/* window */ Window, scala.Unit]): scala.Unit = js.native
  def getLastFocused(getInfo: GetInfo, callback: js.Function1[/* window */ Window, scala.Unit]): scala.Unit = js.native
  def remove(windowId: scala.Double): scala.Unit = js.native
  def remove(windowId: scala.Double, callback: js.Function): scala.Unit = js.native
  def update(windowId: scala.Double, updateInfo: UpdateInfo): scala.Unit = js.native
  def update(
    windowId: scala.Double,
    updateInfo: UpdateInfo,
    callback: js.Function1[/* window */ Window, scala.Unit]
  ): scala.Unit = js.native
}

