package typings.chrome.anon

import typings.chrome.chrome.serial.ConnectionInfo
import typings.chrome.chrome.serial.ConnectionOptions
import typings.chrome.chrome.serial.DeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofserial extends StObject {
  
  val DataBits: EIGHT
  
  val ParityBit: EVEN
  
  val StopBits: ONE
  
  def clearBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  
  def connect(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit
  
  def disconnect(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  
  def flush(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  
  def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit
  
  def getControlSignals(connectionId: Double, callback: js.Function1[/* signals */ js.Object, Unit]): Unit
  
  def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]): Unit
  
  def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit
  
  val onReceive: TypeofonReceive
  
  val onReceiveError: TypeofonReceiveError
  
  def send(
    connectionId: Double,
    data: js.typedarray.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, Unit]
  ): Unit
  
  def setBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  
  def setControlSignals(connectionId: Double, signals: js.Object, callback: js.Function1[/* result */ Boolean, Unit]): Unit
  
  def setPaused(connectionId: Double, paused: Boolean, callback: js.Function0[Unit]): Unit
  
  def update(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit
}
object Typeofserial {
  
  inline def apply(
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
    send: (Double, js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Unit,
    setBreak: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit,
    setControlSignals: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Unit,
    setPaused: (Double, Boolean, js.Function0[Unit]) => Unit,
    update: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Unit
  ): Typeofserial = {
    val __obj = js.Dynamic.literal(DataBits = DataBits.asInstanceOf[js.Any], ParityBit = ParityBit.asInstanceOf[js.Any], StopBits = StopBits.asInstanceOf[js.Any], clearBreak = js.Any.fromFunction2(clearBreak), connect = js.Any.fromFunction3(connect), disconnect = js.Any.fromFunction2(disconnect), flush = js.Any.fromFunction2(flush), getConnections = js.Any.fromFunction1(getConnections), getControlSignals = js.Any.fromFunction2(getControlSignals), getDevices = js.Any.fromFunction1(getDevices), getInfo = js.Any.fromFunction1(getInfo), onReceive = onReceive.asInstanceOf[js.Any], onReceiveError = onReceiveError.asInstanceOf[js.Any], send = js.Any.fromFunction3(send), setBreak = js.Any.fromFunction2(setBreak), setControlSignals = js.Any.fromFunction3(setControlSignals), setPaused = js.Any.fromFunction3(setPaused), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Typeofserial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofserial] (val x: Self) extends AnyVal {
    
    inline def setClearBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "clearBreak", js.Any.fromFunction2(value))
    
    inline def setConnect(
      value: (String, ConnectionOptions, js.Function1[/* connectionInfo */ ConnectionInfo, Unit]) => Unit
    ): Self = StObject.set(x, "connect", js.Any.fromFunction3(value))
    
    inline def setDataBits(value: EIGHT): Self = StObject.set(x, "DataBits", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction2(value))
    
    inline def setFlush(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction2(value))
    
    inline def setGetConnections(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit): Self = StObject.set(x, "getConnections", js.Any.fromFunction1(value))
    
    inline def setGetControlSignals(value: (Double, js.Function1[/* signals */ js.Object, Unit]) => Unit): Self = StObject.set(x, "getControlSignals", js.Any.fromFunction2(value))
    
    inline def setGetDevices(value: js.Function1[/* ports */ js.Array[DeviceInfo], Unit] => Unit): Self = StObject.set(x, "getDevices", js.Any.fromFunction1(value))
    
    inline def setGetInfo(value: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setOnReceive(value: TypeofonReceive): Self = StObject.set(x, "onReceive", value.asInstanceOf[js.Any])
    
    inline def setOnReceiveError(value: TypeofonReceiveError): Self = StObject.set(x, "onReceiveError", value.asInstanceOf[js.Any])
    
    inline def setParityBit(value: EVEN): Self = StObject.set(x, "ParityBit", value.asInstanceOf[js.Any])
    
    inline def setSend(value: (Double, js.typedarray.ArrayBuffer, js.Function1[/* sendInfo */ js.Object, Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction3(value))
    
    inline def setSetBreak(value: (Double, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "setBreak", js.Any.fromFunction2(value))
    
    inline def setSetControlSignals(value: (Double, js.Object, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "setControlSignals", js.Any.fromFunction3(value))
    
    inline def setSetPaused(value: (Double, Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setPaused", js.Any.fromFunction3(value))
    
    inline def setStopBits(value: ONE): Self = StObject.set(x, "StopBits", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Double, ConnectionOptions, js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
