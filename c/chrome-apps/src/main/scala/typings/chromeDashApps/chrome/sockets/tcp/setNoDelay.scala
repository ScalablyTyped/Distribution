package typings.chromeDashApps.chrome.sockets.tcp

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.setNoDelay")
@js.native
object setNoDelay extends js.Object {
  /**
    * Sets or clears TCP_NODELAY for a TCP connection.
    * Nagle's algorithm will be disabled when TCP_NODELAY is set.
    * @param socketId The socket identifier.
    * @param noDelay If true, disables Nagle's algorithm.
    * @param callback Called when the setNoDelay attempt is complete. Provides the result code returned
    *                 from the underlying network call. A negative value indicates an error.
    */
  def apply(socketId: integer, noDelay: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
}

