package typings.chrome.chromeNs.serialNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial")
@js.native
object ^ extends js.Object {
  def clearBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def connect(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit = js.native
  def disconnect(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def flush(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
  def getControlSignals(connectionId: Double, callback: js.Function1[/* signals */ js.Object, Unit]): Unit = js.native
  def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]): Unit = js.native
  def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
  def send(connectionId: Double, data: ArrayBuffer, callback: js.Function1[/* sendInfo */ js.Object, Unit]): Unit = js.native
  def setBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def setControlSignals(connectionId: Double, signals: js.Object, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def setPaused(connectionId: Double, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def update(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
}

