package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRouteRequest extends StObject {
  
  /**
    * [IPv4 traffic only] The ID of a carrier gateway.
    */
  var CarrierGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGatewayId] = js.undefined
  
  /**
    * The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an existing route in the table.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an existing route in the table.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the prefix list for the route.
    */
  var DestinationPrefixListId: js.UndefOr[PrefixListResourceId] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [IPv6 traffic only] The ID of an egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.undefined
  
  /**
    * The ID of an internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.undefined
  
  /**
    * The ID of a NAT instance in your VPC.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.undefined
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.undefined
  
  /**
    * Specifies whether to reset the local route to its default target (local).
    */
  var LocalTarget: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [IPv4 traffic only] The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.NatGatewayId] = js.undefined
  
  /**
    * The ID of a network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId
  
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayId] = js.undefined
  
  /**
    * The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointId] = js.undefined
  
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnectionId] = js.undefined
}
object ReplaceRouteRequest {
  
  @scala.inline
  def apply(RouteTableId: RouteTableId): ReplaceRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRouteRequest]
  }
  
  @scala.inline
  implicit class ReplaceRouteRequestMutableBuilder[Self <: ReplaceRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierGatewayId(value: CarrierGatewayId): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierGatewayIdUndefined: Self = StObject.set(x, "CarrierGatewayId", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: RouteGatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalTarget(value: Boolean): Self = StObject.set(x, "LocalTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTargetUndefined: Self = StObject.set(x, "LocalTarget", js.undefined)
    
    @scala.inline
    def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: RouteTableId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
