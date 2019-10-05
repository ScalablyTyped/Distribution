package typings.chromeDashApps.chrome.sockets.tcp

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.secure")
@js.native
object secure extends js.Object {
  /**
    * Start a TLS client connection over the connected TCP client socket.
    * @since Chrome 38.
    * @param socketId The existing, connected socket to use.
    * @param callback Called when the connection attempt is complete.
    */
  def apply(socketId: integer, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * Start a TLS client connection over the connected TCP client socket.
    * @since Chrome 38.
    * @param socketId The existing, connected socket to use.
    * @param [options] Constraints and parameters for the TLS connection.
    * @param callback Called when the connection attempt is complete.
    */
  def apply(socketId: integer, options: SecureOptions, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
}

