package typings
package chromeDashAppsLib.chromeNs.bluetoothSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveErrorEventData extends js.Object {
  /**
    * An error code indicating what went wrong.
    *
    * disconnected
    *  > The connection was disconnected.
    * system_error
    *  > A system error occurred and the connection may be unrecoverable.
    * not_connected
    *  > The socket has not been connected.
    */
  var error: OnAcceptErrorCode
  /** The error message */
  var errorMessage: java.lang.String
  /** The server socket identifier. */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

object OnReceiveErrorEventData {
  @scala.inline
  def apply(
    error: OnAcceptErrorCode,
    errorMessage: java.lang.String,
    socketId: chromeDashAppsLib.chromeNs.integer
  ): OnReceiveErrorEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("socketId")(socketId)
    __obj.asInstanceOf[OnReceiveErrorEventData]
  }
}

