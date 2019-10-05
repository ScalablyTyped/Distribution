package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.setKeepAlive")
@js.native
object setKeepAlive extends js.Object {
  def apply(socketId: Double, enable: Boolean): Unit = js.native
  def apply(socketId: Double, enable: Boolean, delay: Double): Unit = js.native
  def apply(
    socketId: Double,
    enable: Boolean,
    delay: Double,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
}

