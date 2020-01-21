package typings.axon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var hostname: js.UndefOr[String] = js.undefined
  var pathname: String
  var port: String | Double
  var protocol: js.UndefOr[String] = js.undefined
}

object AnonHostname {
  @scala.inline
  def apply(pathname: String, port: String | Double, hostname: String = null, protocol: String = null): AnonHostname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
}

