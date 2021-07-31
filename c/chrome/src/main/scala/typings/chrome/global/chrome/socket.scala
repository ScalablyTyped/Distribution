package typings.chrome.global.chrome

import typings.chrome.chrome.socket.AcceptInfo
import typings.chrome.chrome.socket.CreateInfo
import typings.chrome.chrome.socket.NetworkInterface
import typings.chrome.chrome.socket.ReadInfo
import typings.chrome.chrome.socket.RecvFromInfo
import typings.chrome.chrome.socket.SocketInfo
import typings.chrome.chrome.socket.WriteInfo
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Socket
////////////////////
object socket {
  
  @JSGlobal("chrome.socket")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def accept(socketId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accept")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def accept(socketId: Double, callback: js.Function1[/* acceptInfo */ AcceptInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accept")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def bind(socketId: Double, address: String, port: Double, callback: js.Function1[/* result */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def connect(
    socketId: Double,
    hostname: String,
    port: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(socketId.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def create(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def create(`type`: String, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(`type`: String, options: js.Object, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(`type`: String, options: Unit, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def destroy(socketId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def disconnect(socketId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getInfo(socketId: Double, callback: js.Function1[/* result */ SocketInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getNetworkList(callback: js.Function1[/* result */ js.Array[NetworkInterface], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkList")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def listen(socketId: Double, address: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def listen(socketId: Double, address: String, port: Double, backlog: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], backlog.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def listen(
    socketId: Double,
    address: String,
    port: Double,
    backlog: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], backlog.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def listen(
    socketId: Double,
    address: String,
    port: Double,
    backlog: Unit,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], backlog.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def read(socketId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def read(socketId: Double, bufferSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(socketId.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(socketId: Double, bufferSize: Double, callback: js.Function1[/* readInfo */ ReadInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(socketId.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(socketId: Double, bufferSize: Unit, callback: js.Function1[/* readInfo */ ReadInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(socketId.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def recvFrom(socketId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("recvFrom")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def recvFrom(socketId: Double, bufferSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recvFrom")(socketId.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def recvFrom(
    socketId: Double,
    bufferSize: Double,
    callback: js.Function1[/* recvFromInfo */ RecvFromInfo, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recvFrom")(socketId.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def recvFrom(socketId: Double, bufferSize: Unit, callback: js.Function1[/* recvFromInfo */ RecvFromInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recvFrom")(socketId.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sendTo(socketId: Double, data: ArrayBuffer, address: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sendTo(
    socketId: Double,
    data: ArrayBuffer,
    address: String,
    port: Double,
    callback: js.Function1[/* writeInfo */ WriteInfo, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTo")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setKeepAlive(socketId: Double, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAlive")(socketId.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setKeepAlive(socketId: Double, enable: Boolean, delay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAlive")(socketId.asInstanceOf[js.Any], enable.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setKeepAlive(
    socketId: Double,
    enable: Boolean,
    delay: Double,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAlive")(socketId.asInstanceOf[js.Any], enable.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setKeepAlive(socketId: Double, enable: Boolean, delay: Unit, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAlive")(socketId.asInstanceOf[js.Any], enable.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setNoDelay(socketId: Double, noDelay: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNoDelay")(socketId.asInstanceOf[js.Any], noDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setNoDelay(socketId: Double, noDelay: Boolean, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNoDelay")(socketId.asInstanceOf[js.Any], noDelay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def write(socketId: Double, data: ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(socketId: Double, data: ArrayBuffer, callback: js.Function1[/* writeInfo */ WriteInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
