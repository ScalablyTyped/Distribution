package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.connect")
@js.native
object connect extends js.Object {
  def apply(
    socketId: Double,
    hostname: String,
    port: Double,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
}

