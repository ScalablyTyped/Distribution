package typings.axon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: js.UndefOr[String] = js.undefined
  var pathname: String
  var port: String | Double
  var protocol: js.UndefOr[String] = js.undefined
}

object Anon_Hostname {
  @scala.inline
  def apply(pathname: String, port: String | Double, hostname: String = null, protocol: String = null): Anon_Hostname = {
    val __obj = js.Dynamic.literal(pathname = pathname, port = port.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[Anon_Hostname]
  }
}

