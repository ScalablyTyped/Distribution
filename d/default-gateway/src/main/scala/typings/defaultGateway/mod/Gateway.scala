package typings.defaultGateway.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gateway extends js.Object {
  var gateway: String = js.native
  var interface: String = js.native
}

object Gateway {
  @scala.inline
  def apply(gateway: String, interface: String): Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gateway]
  }
  @scala.inline
  implicit class GatewayOps[Self <: Gateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGateway(value: String): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
  }
  
}

