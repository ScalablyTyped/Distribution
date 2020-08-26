package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGateways extends js.Object {
  /**
    * The virtual private gateways.
    */
  var virtualGateways: js.UndefOr[VirtualGatewayList] = js.native
}

object VirtualGateways {
  @scala.inline
  def apply(): VirtualGateways = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGateways]
  }
  @scala.inline
  implicit class VirtualGatewaysOps[Self <: VirtualGateways] (val x: Self) extends AnyVal {
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
    def setVirtualGatewaysVarargs(value: VirtualGateway*): Self = this.set("virtualGateways", js.Array(value :_*))
    @scala.inline
    def setVirtualGateways(value: VirtualGatewayList): Self = this.set("virtualGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualGateways: Self = this.set("virtualGateways", js.undefined)
  }
  
}

