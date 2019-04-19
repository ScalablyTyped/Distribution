package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackClearBreak extends js.Object {
  val DataBits: Anon_EIGHT
  val ParityBit: Anon_EVEN
  val StopBits: Anon_ONE
  val onReceiveErrorNs: Anon_AddListenerCallback
  val onReceiveNs: Anon_AddListener
  def clearBreak(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
  def connect(
    path: java.lang.String,
    options: chromeLib.chromeNs.serialNs.ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ chromeLib.chromeNs.serialNs.ConnectionInfo, scala.Unit]
  ): scala.Unit
  def disconnect(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
  def flush(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
  def getConnections(
    callback: js.Function1[
      /* connectionInfos */ js.Array[chromeLib.chromeNs.serialNs.ConnectionInfo], 
      scala.Unit
    ]
  ): scala.Unit
  def getControlSignals(connectionId: scala.Double, callback: js.Function1[/* signals */ js.Object, scala.Unit]): scala.Unit
  def getDevices(callback: js.Function1[/* ports */ js.Array[chromeLib.chromeNs.serialNs.DeviceInfo], scala.Unit]): scala.Unit
  def getInfo(
    callback: js.Function1[
      /* connectionInfos */ js.Array[chromeLib.chromeNs.serialNs.ConnectionInfo], 
      scala.Unit
    ]
  ): scala.Unit
  def send(
    connectionId: scala.Double,
    data: stdLib.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, scala.Unit]
  ): scala.Unit
  def setBreak(connectionId: scala.Double, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
  def setControlSignals(
    connectionId: scala.Double,
    signals: js.Object,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit
  def setPaused(connectionId: scala.Double, paused: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  def update(
    connectionId: scala.Double,
    options: chromeLib.chromeNs.serialNs.ConnectionOptions,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit
}

object Anon_CallbackClearBreak {
  @scala.inline
  def apply(
    DataBits: Anon_EIGHT,
    ParityBit: Anon_EVEN,
    StopBits: Anon_ONE,
    clearBreak: (scala.Double, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit,
    connect: (java.lang.String, chromeLib.chromeNs.serialNs.ConnectionOptions, js.Function1[/* connectionInfo */ chromeLib.chromeNs.serialNs.ConnectionInfo, scala.Unit]) => scala.Unit,
    disconnect: (scala.Double, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit,
    flush: (scala.Double, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit,
    getConnections: js.Function1[
      /* connectionInfos */ js.Array[chromeLib.chromeNs.serialNs.ConnectionInfo], 
      scala.Unit
    ] => scala.Unit,
    getControlSignals: (scala.Double, js.Function1[/* signals */ js.Object, scala.Unit]) => scala.Unit,
    getDevices: js.Function1[/* ports */ js.Array[chromeLib.chromeNs.serialNs.DeviceInfo], scala.Unit] => scala.Unit,
    getInfo: js.Function1[
      /* connectionInfos */ js.Array[chromeLib.chromeNs.serialNs.ConnectionInfo], 
      scala.Unit
    ] => scala.Unit,
    onReceiveErrorNs: Anon_AddListenerCallback,
    onReceiveNs: Anon_AddListener,
    send: (scala.Double, stdLib.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, scala.Unit]) => scala.Unit,
    setBreak: (scala.Double, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit,
    setControlSignals: (scala.Double, js.Object, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit,
    setPaused: (scala.Double, scala.Boolean, js.Function0[scala.Unit]) => scala.Unit,
    update: (scala.Double, chromeLib.chromeNs.serialNs.ConnectionOptions, js.Function1[/* result */ scala.Boolean, scala.Unit]) => scala.Unit
  ): Anon_CallbackClearBreak = {
    val __obj = js.Dynamic.literal(DataBits = DataBits, ParityBit = ParityBit, StopBits = StopBits, clearBreak = js.Any.fromFunction2(clearBreak), connect = js.Any.fromFunction3(connect), disconnect = js.Any.fromFunction2(disconnect), flush = js.Any.fromFunction2(flush), getConnections = js.Any.fromFunction1(getConnections), getControlSignals = js.Any.fromFunction2(getControlSignals), getDevices = js.Any.fromFunction1(getDevices), getInfo = js.Any.fromFunction1(getInfo), onReceiveErrorNs = onReceiveErrorNs, onReceiveNs = onReceiveNs, send = js.Any.fromFunction3(send), setBreak = js.Any.fromFunction2(setBreak), setControlSignals = js.Any.fromFunction3(setControlSignals), setPaused = js.Any.fromFunction3(setPaused), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Anon_CallbackClearBreak]
  }
}

