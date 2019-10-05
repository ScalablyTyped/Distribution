package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.listen")
@js.native
object listen extends js.Object {
  def apply(socketId: Double, address: String, port: Double): Unit = js.native
  def apply(socketId: Double, address: String, port: Double, backlog: Double): Unit = js.native
  def apply(
    socketId: Double,
    address: String,
    port: Double,
    backlog: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
}

