package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends js.Object {
  
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
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
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
    def setCarrierGatewayId(value: CarrierGatewayId): Self = this.set("CarrierGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierGatewayId: Self = this.set("CarrierGatewayId", js.undefined)
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationIpv6CidrBlock(value: String): Self = this.set("DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIpv6CidrBlock: Self = this.set("DestinationIpv6CidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationPrefixListId(value: String): Self = this.set("DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPrefixListId: Self = this.set("DestinationPrefixListId", js.undefined)
    
    @scala.inline
    def setEgressOnlyInternetGatewayId(value: String): Self = this.set("EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgressOnlyInternetGatewayId: Self = this.set("EgressOnlyInternetGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceOwnerId(value: String): Self = this.set("InstanceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceOwnerId: Self = this.set("InstanceOwnerId", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    
    @scala.inline
    def setNatGatewayId(value: String): Self = this.set("NatGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatGatewayId: Self = this.set("NatGatewayId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setOrigin(value: RouteOrigin): Self = this.set("Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("Origin", js.undefined)
    
    @scala.inline
    def setState(value: RouteState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
}
