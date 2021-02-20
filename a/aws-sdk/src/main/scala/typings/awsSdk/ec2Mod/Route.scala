package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
  /**
    * The ID of the carrier gateway.
    */
  var CarrierGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGatewayId] = js.native
  
  /**
    * The IPv4 CIDR block used for the destination match.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR block used for the destination match.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The prefix of the AWS service.
    */
  var DestinationPrefixListId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of a gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of a NAT instance in your VPC.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * Describes how the route was created.    CreateRouteTable - The route was automatically created when the route table was created.    CreateRoute - The route was manually added to the route table.    EnableVgwRoutePropagation - The route was propagated by route propagation.  
    */
  var Origin: js.UndefOr[RouteOrigin] = js.native
  
  /**
    * The state of the route. The blackhole state indicates that the route's target isn't available (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
    */
  var State: js.UndefOr[RouteState] = js.native
  
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}
object Route {
  
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
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
    def setDestinationPrefixListId(value: String): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    @scala.inline
    def setEgressOnlyInternetGatewayId(value: String): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceOwnerId(value: String): Self = StObject.set(x, "InstanceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOwnerIdUndefined: Self = StObject.set(x, "InstanceOwnerId", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setNatGatewayId(value: String): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayIdUndefined: Self = StObject.set(x, "NatGatewayId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setOrigin(value: RouteOrigin): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    @scala.inline
    def setState(value: RouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
