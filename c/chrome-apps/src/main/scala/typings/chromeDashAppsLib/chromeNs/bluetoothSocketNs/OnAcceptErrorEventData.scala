package typings
package chromeDashAppsLib.chromeNs.bluetoothSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnAcceptErrorEventData extends js.Object {
  /**
               * An error code indicating what went wrong.
               *
               * system_error
               *  > A system error occurred and the connection may be unrecoverable.
               * not_listening
               *  > The socket is not listening.
               */
  var error: OnAcceptErrorCode
  /** The error message */
  var errorMessage: java.lang.String
  /** The server socket identifier. */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

