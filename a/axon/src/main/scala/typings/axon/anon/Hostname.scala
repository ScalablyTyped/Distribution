package typings.axon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hostname extends js.Object {
  var hostname: js.UndefOr[String] = js.undefined
  var pathname: String
  var port: String | Double
  var protocol: js.UndefOr[String] = js.undefined
}

object Hostname {
  @scala.inline
  def apply(pathname: String, port: String | Double, hostname: String = null, protocol: String = null): Hostname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
}

