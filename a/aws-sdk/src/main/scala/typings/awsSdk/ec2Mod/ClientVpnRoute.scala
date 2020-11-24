package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnRoute extends js.Object {
  
  /**
    * The ID of the Client VPN endpoint with which the route is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  var DestinationCidr: js.UndefOr[String] = js.native
  
  /**
    * Indicates how the route was associated with the Client VPN endpoint. associate indicates that the route was automatically added when the target network was associated with the Client VPN endpoint. add-route indicates that the route was manually added using the CreateClientVpnRoute action.
    */
  var Origin: js.UndefOr[String] = js.native
  
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.native
  
  /**
    * The ID of the subnet through which traffic is routed.
    */
  var TargetSubnet: js.UndefOr[String] = js.native
  
  /**
    * The route type.
    */
  var Type: js.UndefOr[String] = js.native
}
object ClientVpnRoute {
  
  @scala.inline
  def apply(): ClientVpnRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnRoute]
  }
  
  @scala.inline
  implicit class ClientVpnRouteOps[Self <: ClientVpnRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDestinationCidr(value: String): Self = this.set("DestinationCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCidr: Self = this.set("DestinationCidr", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("Origin", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnRouteStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTargetSubnet(value: String): Self = this.set("TargetSubnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSubnet: Self = this.set("TargetSubnet", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
