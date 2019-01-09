package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreateCreateData extends js.Object {
  var WINDOW_ID_CURRENT: scala.Double = js.native
  var WINDOW_ID_NONE: scala.Double = js.native
  var onCreated: chromeLib.chromeNs.windowsNs.WindowReferenceEvent = js.native
  var onFocusChanged: chromeLib.chromeNs.windowsNs.WindowIdEvent = js.native
  var onRemoved: chromeLib.chromeNs.windowsNs.WindowIdEvent = js.native
  def create(): scala.Unit = js.native
  def create(callback: js.Function1[/* window */ js.UndefOr[this.type], scala.Unit]): scala.Unit = js.native
  def create(createData: chromeLib.chromeNs.windowsNs.CreateData): scala.Unit = js.native
  def create(
    createData: chromeLib.chromeNs.windowsNs.CreateData,
    callback: js.Function1[/* window */ js.UndefOr[this.type], scala.Unit]
  ): scala.Unit = js.native
  def get(windowId: scala.Double, callback: js.Function1[/* window */ this.type, scala.Unit]): scala.Unit = js.native
  def get(
    windowId: scala.Double,
    getInfo: chromeLib.chromeNs.windowsNs.GetInfo,
    callback: js.Function1[/* window */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def getAll(callback: js.Function1[/* windows */ js.Array[this.type], scala.Unit]): scala.Unit = js.native
  def getAll(
    getInfo: chromeLib.chromeNs.windowsNs.GetInfo,
    callback: js.Function1[/* windows */ js.Array[this.type], scala.Unit]
  ): scala.Unit = js.native
  def getCurrent(callback: js.Function1[/* window */ this.type, scala.Unit]): scala.Unit = js.native
  def getCurrent(
    getInfo: chromeLib.chromeNs.windowsNs.GetInfo,
    callback: js.Function1[/* window */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def getLastFocused(callback: js.Function1[/* window */ this.type, scala.Unit]): scala.Unit = js.native
  def getLastFocused(
    getInfo: chromeLib.chromeNs.windowsNs.GetInfo,
    callback: js.Function1[/* window */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def remove(windowId: scala.Double): scala.Unit = js.native
  def remove(windowId: scala.Double, callback: js.Function): scala.Unit = js.native
  def update(windowId: scala.Double, updateInfo: chromeLib.chromeNs.windowsNs.UpdateInfo): scala.Unit = js.native
  def update(
    windowId: scala.Double,
    updateInfo: chromeLib.chromeNs.windowsNs.UpdateInfo,
    callback: js.Function1[/* window */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

