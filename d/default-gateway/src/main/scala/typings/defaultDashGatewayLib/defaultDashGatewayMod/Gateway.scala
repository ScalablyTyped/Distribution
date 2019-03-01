package typings
package defaultDashGatewayLib.defaultDashGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gateway extends js.Object {
  var gateway: java.lang.String
  var interface: java.lang.String | scala.Null
}

object Gateway {
  @scala.inline
  def apply(gateway: java.lang.String, interface: java.lang.String = null): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gateway")(gateway)
    if (interface != null) __obj.updateDynamic("interface")(interface)
    __obj.asInstanceOf[Gateway]
  }
}

