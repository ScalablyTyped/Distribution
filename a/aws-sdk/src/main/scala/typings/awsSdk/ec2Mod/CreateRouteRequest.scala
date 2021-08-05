package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteRequest extends StObject {
  
  /**
    * The ID of the carrier gateway. You can only use this option when the VPC contains a subnet which is associated with a Wavelength Zone.
    */
  var CarrierGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGatewayId] = js.undefined
  
  /**
    * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific match. We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a prefix list used for the destination match.
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
    * The ID of an internet gateway or virtual private gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.undefined
  
  /**
    * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one network interface is attached.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.undefined
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.undefined
  
  /**
    * [IPv4 traffic only] The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.NatGatewayId] = js.undefined
  
  /**
    * The ID of a network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.undefined
  
  /**
    * The ID of the route table for the route.
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
object CreateRouteRequest {
  
  inline def apply(RouteTableId: RouteTableId): CreateRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteRequest]
  }
  
  extension [Self <: CreateRouteRequest](x: Self) {
    
    inline def setCarrierGatewayId(value: CarrierGatewayId): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewayIdUndefined: Self = StObject.set(x, "CarrierGatewayId", js.undefined)
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    inline def setDestinationPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    inline def setGatewayId(value: RouteGatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLocalGatewayId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    inline def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setRouteTableId(value: RouteTableId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
