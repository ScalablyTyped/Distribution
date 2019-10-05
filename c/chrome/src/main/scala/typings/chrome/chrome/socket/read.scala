package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.read")
@js.native
object read extends js.Object {
  def apply(socketId: Double): Unit = js.native
  def apply(socketId: Double, bufferSize: Double): Unit = js.native
  def apply(socketId: Double, bufferSize: Double, callback: js.Function1[/* readInfo */ ReadInfo, Unit]): Unit = js.native
}

