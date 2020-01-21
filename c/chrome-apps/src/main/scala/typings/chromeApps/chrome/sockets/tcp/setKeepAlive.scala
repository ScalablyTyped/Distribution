package typings.chromeApps.chrome.sockets.tcp

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.setKeepAlive")
@js.native
object setKeepAlive extends js.Object {
  /**
    * @description Enables or disables the keep-alive functionality for a TCP connection.
    * @param socketId The socket identifier.
    * @param enable If true, enable keep-alive functionality.
    * @param callback Provides the result code returned from the underlying network call. A negative value indicates an error.
    */
  def apply(socketId: integer, enable: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * @description Enables or disables the keep-alive functionality for a TCP connection.
    * @param socketId The socket identifier.
    * @param enable If true, enable keep-alive functionality.
    * @param [delay] Set the delay seconds between the last data packet received and the first keepalive probe. Default is 0.
    * @param callback Provides the result code returned from the underlying network call. A negative value indicates an error.
    */
  def apply(
    socketId: integer,
    enable: Boolean,
    delay: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
}

