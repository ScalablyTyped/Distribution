package typings
package axonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var pathname: java.lang.String
  var port: java.lang.String | scala.Double
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Hostname {
  @scala.inline
  def apply(
    pathname: java.lang.String,
    port: java.lang.String | scala.Double,
    hostname: java.lang.String = null,
    protocol: java.lang.String = null
  ): Anon_Hostname = {
    val __obj = js.Dynamic.literal(pathname = pathname, port = port.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[Anon_Hostname]
  }
}

