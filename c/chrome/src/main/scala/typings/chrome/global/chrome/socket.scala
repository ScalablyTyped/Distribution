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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Socket
////////////////////
object socket {
  
  @JSGlobal("chrome.socket.accept")
  @js.native
  def accept(socketId: Double): Unit = js.native
  @JSGlobal("chrome.socket.accept")
  @js.native
  def accept(socketId: Double, callback: js.Function1[/* acceptInfo */ AcceptInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.bind")
  @js.native
  def bind(socketId: Double, address: String, port: Double, callback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.connect")
  @js.native
  def connect(
    socketId: Double,
    hostname: String,
    port: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.socket.create")
  @js.native
  def create(`type`: String): Unit = js.native
  @JSGlobal("chrome.socket.create")
  @js.native
  def create(
    `type`: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* createInfo */ CreateInfo, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.socket.create")
  @js.native
  def create(`type`: String, options: js.Object): Unit = js.native
  @JSGlobal("chrome.socket.create")
  @js.native
  def create(`type`: String, options: js.Object, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.destroy")
  @js.native
  def destroy(socketId: Double): Unit = js.native
  
  @JSGlobal("chrome.socket.disconnect")
  @js.native
  def disconnect(socketId: Double): Unit = js.native
  
  @JSGlobal("chrome.socket.getInfo")
  @js.native
  def getInfo(socketId: Double, callback: js.Function1[/* result */ SocketInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.getNetworkList")
  @js.native
  def getNetworkList(callback: js.Function1[/* result */ js.Array[NetworkInterface], Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.listen")
  @js.native
  def listen(socketId: Double, address: String, port: Double): Unit = js.native
  @JSGlobal("chrome.socket.listen")
  @js.native
  def listen(
    socketId: Double,
    address: String,
    port: Double,
    backlog: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.socket.listen")
  @js.native
  def listen(socketId: Double, address: String, port: Double, backlog: Double): Unit = js.native
  @JSGlobal("chrome.socket.listen")
  @js.native
  def listen(
    socketId: Double,
    address: String,
    port: Double,
    backlog: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.socket.read")
  @js.native
  def read(socketId: Double): Unit = js.native
  @JSGlobal("chrome.socket.read")
  @js.native
  def read(
    socketId: Double,
    bufferSize: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* readInfo */ ReadInfo, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.socket.read")
  @js.native
  def read(socketId: Double, bufferSize: Double): Unit = js.native
  @JSGlobal("chrome.socket.read")
  @js.native
  def read(socketId: Double, bufferSize: Double, callback: js.Function1[/* readInfo */ ReadInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.recvFrom")
  @js.native
  def recvFrom(socketId: Double): Unit = js.native
  @JSGlobal("chrome.socket.recvFrom")
  @js.native
  def recvFrom(
    socketId: Double,
    bufferSize: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* recvFromInfo */ RecvFromInfo, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.socket.recvFrom")
  @js.native
  def recvFrom(socketId: Double, bufferSize: Double): Unit = js.native
  @JSGlobal("chrome.socket.recvFrom")
  @js.native
  def recvFrom(
    socketId: Double,
    bufferSize: Double,
    callback: js.Function1[/* recvFromInfo */ RecvFromInfo, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.socket.sendTo")
  @js.native
  def sendTo(socketId: Double, data: ArrayBuffer, address: String, port: Double): Unit = js.native
  @JSGlobal("chrome.socket.sendTo")
  @js.native
  def sendTo(
    socketId: Double,
    data: ArrayBuffer,
    address: String,
    port: Double,
    callback: js.Function1[/* writeInfo */ WriteInfo, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.socket.setKeepAlive")
  @js.native
  def setKeepAlive(socketId: Double, enable: Boolean): Unit = js.native
  @JSGlobal("chrome.socket.setKeepAlive")
  @js.native
  def setKeepAlive(
    socketId: Double,
    enable: Boolean,
    delay: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.socket.setKeepAlive")
  @js.native
  def setKeepAlive(socketId: Double, enable: Boolean, delay: Double): Unit = js.native
  @JSGlobal("chrome.socket.setKeepAlive")
  @js.native
  def setKeepAlive(
    socketId: Double,
    enable: Boolean,
    delay: Double,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.socket.setNoDelay")
  @js.native
  def setNoDelay(socketId: Double, noDelay: Boolean): Unit = js.native
  @JSGlobal("chrome.socket.setNoDelay")
  @js.native
  def setNoDelay(socketId: Double, noDelay: Boolean, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.socket.write")
  @js.native
  def write(socketId: Double, data: ArrayBuffer): Unit = js.native
  @JSGlobal("chrome.socket.write")
  @js.native
  def write(socketId: Double, data: ArrayBuffer, callback: js.Function1[/* writeInfo */ WriteInfo, Unit]): Unit = js.native
}
