package typings.chrome

import typings.chrome.chromeNs.socketNs.AcceptInfo
import typings.chrome.chromeNs.socketNs.CreateInfo
import typings.chrome.chromeNs.socketNs.NetworkInterface
import typings.chrome.chromeNs.socketNs.ReadInfo
import typings.chrome.chromeNs.socketNs.RecvFromInfo
import typings.chrome.chromeNs.socketNs.SocketInfo
import typings.chrome.chromeNs.socketNs.WriteInfo
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsocket extends js.Object {
  def accept(socketId: Double): Unit = js.native
  def accept(socketId: Double, callback: js.Function1[/* acceptInfo */ AcceptInfo, Unit]): Unit = js.native
  def bind(socketId: Double, address: String, port: Double, callback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def connect(
    socketId: Double,
    hostname: String,
    port: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def create(`type`: String): Unit = js.native
  def create(`type`: String, options: js.Object): Unit = js.native
  def create(`type`: String, options: js.Object, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  def destroy(socketId: Double): Unit = js.native
  def disconnect(socketId: Double): Unit = js.native
  def getInfo(socketId: Double, callback: js.Function1[/* result */ SocketInfo, Unit]): Unit = js.native
  def getNetworkList(callback: js.Function1[/* result */ js.Array[NetworkInterface], Unit]): Unit = js.native
  def listen(socketId: Double, address: String, port: Double): Unit = js.native
  def listen(socketId: Double, address: String, port: Double, backlog: Double): Unit = js.native
  def listen(
    socketId: Double,
    address: String,
    port: Double,
    backlog: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def read(socketId: Double): Unit = js.native
  def read(socketId: Double, bufferSize: Double): Unit = js.native
  def read(socketId: Double, bufferSize: Double, callback: js.Function1[/* readInfo */ ReadInfo, Unit]): Unit = js.native
  def recvFrom(socketId: Double): Unit = js.native
  def recvFrom(socketId: Double, bufferSize: Double): Unit = js.native
  def recvFrom(
    socketId: Double,
    bufferSize: Double,
    callback: js.Function1[/* recvFromInfo */ RecvFromInfo, Unit]
  ): Unit = js.native
  def sendTo(socketId: Double, data: ArrayBuffer, address: String, port: Double): Unit = js.native
  def sendTo(
    socketId: Double,
    data: ArrayBuffer,
    address: String,
    port: Double,
    callback: js.Function1[/* writeInfo */ WriteInfo, Unit]
  ): Unit = js.native
  def setKeepAlive(socketId: Double, enable: Boolean): Unit = js.native
  def setKeepAlive(socketId: Double, enable: Boolean, delay: Double): Unit = js.native
  def setKeepAlive(
    socketId: Double,
    enable: Boolean,
    delay: Double,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def setNoDelay(socketId: Double, noDelay: Boolean): Unit = js.native
  def setNoDelay(socketId: Double, noDelay: Boolean, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def write(socketId: Double, data: ArrayBuffer): Unit = js.native
  def write(socketId: Double, data: ArrayBuffer, callback: js.Function1[/* writeInfo */ WriteInfo, Unit]): Unit = js.native
}

