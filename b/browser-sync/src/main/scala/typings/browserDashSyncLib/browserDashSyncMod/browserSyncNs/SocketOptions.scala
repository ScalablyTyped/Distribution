package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var clientPath: js.UndefOr[java.lang.String] = js.undefined
  var clients: js.UndefOr[browserDashSyncLib.Anon_HeartbeatTimeout] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    clientPath: java.lang.String = null,
    clients: browserDashSyncLib.Anon_HeartbeatTimeout = null,
    domain: java.lang.String = null,
    namespace: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (clientPath != null) __obj.updateDynamic("clientPath")(clientPath)
    if (clients != null) __obj.updateDynamic("clients")(clients)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

