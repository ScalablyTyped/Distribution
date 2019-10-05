package typings.chrome.chrome.socket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.sendTo")
@js.native
object sendTo extends js.Object {
  def apply(socketId: Double, data: ArrayBuffer, address: String, port: Double): Unit = js.native
  def apply(
    socketId: Double,
    data: ArrayBuffer,
    address: String,
    port: Double,
    callback: js.Function1[/* writeInfo */ WriteInfo, Unit]
  ): Unit = js.native
}

