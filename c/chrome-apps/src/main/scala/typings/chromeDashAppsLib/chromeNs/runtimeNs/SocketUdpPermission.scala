package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketUdpPermission extends js.Object {
  /**
    * The host:port pattern for bind operations.
    * *:* are allowed
    */
  var bind: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The host:port pattern for joinGroup operations.
    * *:* are allowed
    */
  var multicastMembership: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The host:port pattern for send operations.
    * *:* are allowed
    */
  var send: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object SocketUdpPermission {
  @scala.inline
  def apply(
    bind: java.lang.String | js.Array[java.lang.String] = null,
    multicastMembership: java.lang.String | js.Array[java.lang.String] = null,
    send: java.lang.String | js.Array[java.lang.String] = null
  ): SocketUdpPermission = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (multicastMembership != null) __obj.updateDynamic("multicastMembership")(multicastMembership.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketUdpPermission]
  }
}

