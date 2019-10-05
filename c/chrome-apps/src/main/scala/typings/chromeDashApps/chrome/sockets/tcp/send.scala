package typings.chromeDashApps.chrome.sockets.tcp

import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.sockets.SendInfo
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.send")
@js.native
object send extends js.Object {
  /**
    * @description Sends data on the given TCP socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param callback Called when the send operation completes.
    */
  def apply(socketId: integer, data: ArrayBuffer, callback: js.Function1[/* sendInfo */ SendInfo, Unit]): Unit = js.native
}

