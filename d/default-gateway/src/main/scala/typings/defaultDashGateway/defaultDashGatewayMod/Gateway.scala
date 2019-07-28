package typings.defaultDashGateway.defaultDashGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gateway extends js.Object {
  var gateway: String
  var interface: String | Null
}

object Gateway {
  @scala.inline
  def apply(gateway: String, interface: String = null): Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway)
    if (interface != null) __obj.updateDynamic("interface")(interface)
    __obj.asInstanceOf[Gateway]
  }
}

