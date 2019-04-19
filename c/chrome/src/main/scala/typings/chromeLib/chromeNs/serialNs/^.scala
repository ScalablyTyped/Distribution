package typings
package chromeLib.chromeNs.serialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial")
@js.native
object ^ extends js.Object {
  def clearBreak(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def connect(
    path: java.lang.String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, scala.Unit]
  ): scala.Unit = js.native
  def disconnect(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def flush(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], scala.Unit]): scala.Unit = js.native
  def getControlSignals(connectionId: scala.Double, callback: js.Function1[/* signals */ js.Object, scala.Unit]): scala.Unit = js.native
  def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], scala.Unit]): scala.Unit = js.native
  def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], scala.Unit]): scala.Unit = js.native
  def send(
    connectionId: scala.Double,
    data: stdLib.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def setBreak(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def setControlSignals(
    connectionId: scala.Double,
    signals: js.Object,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setPaused(connectionId: scala.Double, paused: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(
    connectionId: scala.Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

