package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketUdpPermission extends js.Object {
  /**
    * The host:port pattern for bind operations.
    * *:* are allowed
    */
  var bind: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The host:port pattern for joinGroup operations.
    * *:* are allowed
    */
  var multicastMembership: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The host:port pattern for send operations.
    * *:* are allowed
    */
  var send: js.UndefOr[String | js.Array[String]] = js.undefined
}

object SocketUdpPermission {
  @scala.inline
  def apply(
    bind: String | js.Array[String] = null,
    multicastMembership: String | js.Array[String] = null,
    send: String | js.Array[String] = null
  ): SocketUdpPermission = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (multicastMembership != null) __obj.updateDynamic("multicastMembership")(multicastMembership.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketUdpPermission]
  }
}

