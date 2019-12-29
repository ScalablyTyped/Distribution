package typings.defaultDashGateway.defaultDashGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gateway extends js.Object {
  var gateway: String
  var interface: String
}

object Gateway {
  @scala.inline
  def apply(gateway: String, interface: String): Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gateway]
  }
}

