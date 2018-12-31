package typings
package chromeDashAppsLib.chromeNs.socketsNs.tcpServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketProperties
  */
trait SocketProperties extends js.Object {
  /** An application-defined string associated with the socket. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Flag indicating if the socket remains open when the event page of the
    * application is unloaded. The default value is 'false.' When the
    * application is loaded, any sockets previously opened with
    * persistent=true can be fetched with getSockets.
    *
    * @see http://developer.chrome.com/apps/app_lifecycle.html
    */
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
}

