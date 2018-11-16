package typings
package chromeDashAppsLib.chromeNs.socketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SocketProperties extends js.Object {
  /**
               * The size of the buffer used to receive data.
               * @default: 4096
               */
  var bufferSize: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** An application-defined string associated with the socket. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Flag indicating if the socket is left open when the event page of the
               * application is unloaded. When the application is loaded, any sockets
               * previously opened with persistent=true can be fetched with *getSockets*.
               * @default false
               */
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
}

