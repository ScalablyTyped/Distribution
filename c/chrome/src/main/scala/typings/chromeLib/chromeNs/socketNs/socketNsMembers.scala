package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket")
@js.native
object socketNsMembers extends js.Object {
  def accept(socketId: scala.Double): scala.Unit = js.native
  def accept(socketId: scala.Double, callback: js.Function1[/* acceptInfo */ AcceptInfo, scala.Unit]): scala.Unit = js.native
  def bind(
    socketId: scala.Double,
    address: java.lang.String,
    port: scala.Double,
    callback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def connect(
    socketId: scala.Double,
    hostname: java.lang.String,
    port: scala.Double,
    callback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def create(`type`: java.lang.String): scala.Unit = js.native
  def create(`type`: java.lang.String, options: js.Object): scala.Unit = js.native
  def create(
    `type`: java.lang.String,
    options: js.Object,
    callback: js.Function1[/* createInfo */ CreateInfo, scala.Unit]
  ): scala.Unit = js.native
  def destroy(socketId: scala.Double): scala.Unit = js.native
  def disconnect(socketId: scala.Double): scala.Unit = js.native
  def getInfo(socketId: scala.Double, callback: js.Function1[/* result */ SocketInfo, scala.Unit]): scala.Unit = js.native
  def getNetworkList(callback: js.Function1[/* result */ js.Array[NetworkInterface], scala.Unit]): scala.Unit = js.native
  def listen(socketId: scala.Double, address: java.lang.String, port: scala.Double): scala.Unit = js.native
  def listen(socketId: scala.Double, address: java.lang.String, port: scala.Double, backlog: scala.Double): scala.Unit = js.native
  def listen(
    socketId: scala.Double,
    address: java.lang.String,
    port: scala.Double,
    backlog: scala.Double,
    callback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def read(socketId: scala.Double): scala.Unit = js.native
  def read(socketId: scala.Double, bufferSize: scala.Double): scala.Unit = js.native
  def read(
    socketId: scala.Double,
    bufferSize: scala.Double,
    callback: js.Function1[/* readInfo */ ReadInfo, scala.Unit]
  ): scala.Unit = js.native
  def recvFrom(socketId: scala.Double): scala.Unit = js.native
  def recvFrom(socketId: scala.Double, bufferSize: scala.Double): scala.Unit = js.native
  def recvFrom(
    socketId: scala.Double,
    bufferSize: scala.Double,
    callback: js.Function1[/* recvFromInfo */ RecvFromInfo, scala.Unit]
  ): scala.Unit = js.native
  def sendTo(socketId: scala.Double, data: stdLib.ArrayBuffer, address: java.lang.String, port: scala.Double): scala.Unit = js.native
  def sendTo(
    socketId: scala.Double,
    data: stdLib.ArrayBuffer,
    address: java.lang.String,
    port: scala.Double,
    callback: js.Function1[/* writeInfo */ WriteInfo, scala.Unit]
  ): scala.Unit = js.native
  def setKeepAlive(socketId: scala.Double, enable: scala.Boolean): scala.Unit = js.native
  def setKeepAlive(socketId: scala.Double, enable: scala.Boolean, delay: scala.Double): scala.Unit = js.native
  def setKeepAlive(
    socketId: scala.Double,
    enable: scala.Boolean,
    delay: scala.Double,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def setNoDelay(socketId: scala.Double, noDelay: scala.Boolean): scala.Unit = js.native
  def setNoDelay(
    socketId: scala.Double,
    noDelay: scala.Boolean,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def write(socketId: scala.Double, data: stdLib.ArrayBuffer): scala.Unit = js.native
  def write(
    socketId: scala.Double,
    data: stdLib.ArrayBuffer,
    callback: js.Function1[/* writeInfo */ WriteInfo, scala.Unit]
  ): scala.Unit = js.native
}

