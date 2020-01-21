package typings.browserSync.mod

import typings.browserSync.AnonHeartbeatTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var clientPath: js.UndefOr[String] = js.undefined
  var clients: js.UndefOr[AnonHeartbeatTimeout] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    clientPath: String = null,
    clients: AnonHeartbeatTimeout = null,
    domain: String = null,
    namespace: String = null,
    path: String = null,
    port: Int | Double = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (clientPath != null) __obj.updateDynamic("clientPath")(clientPath.asInstanceOf[js.Any])
    if (clients != null) __obj.updateDynamic("clients")(clients.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

