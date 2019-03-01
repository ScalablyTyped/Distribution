package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// For chrome.sockets ///
trait SocketTcpPermission extends js.Object {
  /**
    * The host:port pattern for connect operations.
    * *:* are allowed
    */
  var connect: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object SocketTcpPermission {
  @scala.inline
  def apply(connect: java.lang.String | js.Array[java.lang.String] = null): SocketTcpPermission = {
    val __obj = js.Dynamic.literal()
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTcpPermission]
  }
}

