package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnRoute extends StObject {
  
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
  implicit class ClientVpnRouteMutableBuilder[Self <: ClientVpnRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestinationCidr(value: String): Self = StObject.set(x, "DestinationCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrUndefined: Self = StObject.set(x, "DestinationCidr", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnRouteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetSubnet(value: String): Self = StObject.set(x, "TargetSubnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSubnetUndefined: Self = StObject.set(x, "TargetSubnet", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
