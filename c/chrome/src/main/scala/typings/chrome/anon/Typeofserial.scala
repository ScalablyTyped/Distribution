package typings.chrome.anon

import typings.chrome.chrome.serial.ConnectionInfo
import typings.chrome.chrome.serial.ConnectionOptions
import typings.chrome.chrome.serial.DeviceInfo
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofserial extends js.Object {
  val DataBits: EIGHT = js.native
  val ParityBit: EVEN = js.native
  val StopBits: ONE = js.native
  val onReceive: TypeofonReceive = js.native
  val onReceiveError: TypeofonReceiveError = js.native
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

object Typeofserial {
  @scala.inline
  def apply(
    DataBits: EIGHT,
    ParityBit: EVEN,
    StopBits: ONE,
    clearBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    connect: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Unit,
    disconnect: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    flush: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    getConnections: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit,
    getControlSignals: (Double, js.Function1[/* signals */ js.Object, Unit]) => Unit,
    getDevices: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Unit,
    getInfo: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit,
    onReceive: TypeofonReceive,
    onReceiveError: TypeofonReceiveError,
    send: (Double, ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Unit,
    setBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    setControlSignals: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Unit,
    setPaused: (Double, Boolean, js.Function0[Unit]) => Unit,
    update: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Unit
  ): Typeofserial = {
    val __obj = js.Dynamic.literal(DataBits = DataBits.asInstanceOf[js.Any], ParityBit = ParityBit.asInstanceOf[js.Any], StopBits = StopBits.asInstanceOf[js.Any], clearBreak = js.Any.fromFunction2(clearBreak), connect = js.Any.fromFunction3(connect), disconnect = js.Any.fromFunction2(disconnect), flush = js.Any.fromFunction2(flush), getConnections = js.Any.fromFunction1(getConnections), getControlSignals = js.Any.fromFunction2(getControlSignals), getDevices = js.Any.fromFunction1(getDevices), getInfo = js.Any.fromFunction1(getInfo), onReceive = onReceive.asInstanceOf[js.Any], onReceiveError = onReceiveError.asInstanceOf[js.Any], send = js.Any.fromFunction3(send), setBreak = js.Any.fromFunction2(setBreak), setControlSignals = js.Any.fromFunction3(setControlSignals), setPaused = js.Any.fromFunction3(setPaused), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Typeofserial]
  }
  @scala.inline
  implicit class TypeofserialOps[Self <: Typeofserial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataBits(value: EIGHT): Self = this.set("DataBits", value.asInstanceOf[js.Any])
    @scala.inline
    def setParityBit(value: EVEN): Self = this.set("ParityBit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopBits(value: ONE): Self = this.set("StopBits", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("clearBreak", js.Any.fromFunction2(value))
    @scala.inline
    def setConnect(
      value: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Unit
    ): Self = this.set("connect", js.Any.fromFunction3(value))
    @scala.inline
    def setDisconnect(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("disconnect", js.Any.fromFunction2(value))
    @scala.inline
    def setFlush(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("flush", js.Any.fromFunction2(value))
    @scala.inline
    def setGetConnections(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit): Self = this.set("getConnections", js.Any.fromFunction1(value))
    @scala.inline
    def setGetControlSignals(value: (Double, js.Function1[/* signals */ js.Object, Unit]) => Unit): Self = this.set("getControlSignals", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDevices(value: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Unit): Self = this.set("getDevices", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInfo(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit): Self = this.set("getInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReceive(value: TypeofonReceive): Self = this.set("onReceive", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReceiveError(value: TypeofonReceiveError): Self = this.set("onReceiveError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSend(value: (Double, ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Unit): Self = this.set("send", js.Any.fromFunction3(value))
    @scala.inline
    def setSetBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("setBreak", js.Any.fromFunction2(value))
    @scala.inline
    def setSetControlSignals(value: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("setControlSignals", js.Any.fromFunction3(value))
    @scala.inline
    def setSetPaused(value: (Double, Boolean, js.Function0[Unit]) => Unit): Self = this.set("setPaused", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
  }
  
}

