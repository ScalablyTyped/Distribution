package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTcpServerPermission extends js.Object {
  /**
    * The host:port pattern for listen operations.
    * *:* are allowed
    */
  var listen: js.UndefOr[String | js.Array[String]] = js.undefined
}

object SocketTcpServerPermission {
  @scala.inline
  def apply(listen: String | js.Array[String] = null): SocketTcpServerPermission = {
    val __obj = js.Dynamic.literal()
    if (listen != null) __obj.updateDynamic("listen")(listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTcpServerPermission]
  }
}

