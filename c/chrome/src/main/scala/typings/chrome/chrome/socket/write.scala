package typings.chrome.chrome.socket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.write")
@js.native
object write extends js.Object {
  def apply(socketId: Double, data: ArrayBuffer): Unit = js.native
  def apply(socketId: Double, data: ArrayBuffer, callback: js.Function1[/* writeInfo */ WriteInfo, Unit]): Unit = js.native
}

