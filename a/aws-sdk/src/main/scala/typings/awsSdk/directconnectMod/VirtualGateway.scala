package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGateway extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  /**
    * The state of the virtual private gateway. The following are the possible values:    pending: Initial state after creating the virtual private gateway.    available: Ready for use by a private virtual interface.    deleting: Initial state after deleting the virtual private gateway.    deleted: The virtual private gateway is deleted. The private virtual interface is unable to send traffic over this gateway.  
    */
  var virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.native
}

object VirtualGateway {
  @scala.inline
  def apply(): VirtualGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGateway]
  }
  @scala.inline
  implicit class VirtualGatewayOps[Self <: VirtualGateway] (val x: Self) extends AnyVal {
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
    def setVirtualGatewayId(value: VirtualGatewayId): Self = this.set("virtualGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualGatewayId: Self = this.set("virtualGatewayId", js.undefined)
    @scala.inline
    def setVirtualGatewayState(value: VirtualGatewayState): Self = this.set("virtualGatewayState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualGatewayState: Self = this.set("virtualGatewayState", js.undefined)
  }
  
}

