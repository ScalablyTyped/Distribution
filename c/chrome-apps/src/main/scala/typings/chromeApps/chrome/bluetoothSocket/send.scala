package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.send")
@js.native
object send extends js.Object {
  /**
    * Sends data on the given Bluetooth socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param [callback] Called with the number of bytes sent.
    */
  def apply(socketId: integer, data: ArrayBuffer): Unit = js.native
  def apply(socketId: integer, data: ArrayBuffer, callback: js.Function1[/* bytesSent */ integer, Unit]): Unit = js.native
}

