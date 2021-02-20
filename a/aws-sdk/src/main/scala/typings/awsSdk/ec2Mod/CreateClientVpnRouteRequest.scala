package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientVpnRouteRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Client VPN endpoint to which to add the route.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the route destination. For example:   To add a route for Internet access, enter 0.0.0.0/0    To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range   To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4 CIDR range   To add a route for the local network, enter the client CIDR range  
    */
  var DestinationCidrBlock: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the subnet through which you want to route traffic. The specified subnet must be an existing target network of the Client VPN endpoint. Alternatively, if you're adding a route for the local network, specify local.
    */
  var TargetVpcSubnetId: SubnetId = js.native
}
object CreateClientVpnRouteRequest {
  
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    DestinationCidrBlock: String,
    TargetVpcSubnetId: SubnetId
  ): CreateClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], TargetVpcSubnetId = TargetVpcSubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnRouteRequest]
  }
  
  @scala.inline
  implicit class CreateClientVpnRouteRequestMutableBuilder[Self <: CreateClientVpnRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTargetVpcSubnetId(value: SubnetId): Self = StObject.set(x, "TargetVpcSubnetId", value.asInstanceOf[js.Any])
  }
}
