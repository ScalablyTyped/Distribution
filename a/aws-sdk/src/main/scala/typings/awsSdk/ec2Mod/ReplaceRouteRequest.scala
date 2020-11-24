package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceRouteRequest extends js.Object {
  
  /**
    * [IPv4 traffic only] The ID of a carrier gateway.
    */
  var CarrierGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGatewayId] = js.native
  
  /**
    * The IPv4 CIDR address block used for the destination match. The value that you provide must match the CIDR of an existing route in the table.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR address block used for the destination match. The value that you provide must match the CIDR of an existing route in the table.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The ID of the prefix list for the route.
    */
  var DestinationPrefixListId: js.UndefOr[PrefixListResourceId] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * [IPv6 traffic only] The ID of an egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.native
  
  /**
    * The ID of an internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.native
  
  /**
    * The ID of a NAT instance in your VPC.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.native
  
  /**
    * Specifies whether to reset the local route to its default target (local).
    */
  var LocalTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * [IPv4 traffic only] The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.NatGatewayId] = js.native
  
  /**
    * The ID of a network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
  
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayId] = js.native
  
  /**
    * The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints only.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointId] = js.native
  
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnectionId] = js.native
}
object ReplaceRouteRequest {
  
  @scala.inline
  def apply(RouteTableId: RouteTableId): ReplaceRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRouteRequest]
  }
  
  @scala.inline
  implicit class ReplaceRouteRequestOps[Self <: ReplaceRouteRequest] (val x: Self) extends AnyVal {
    
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
    def setRouteTableId(value: RouteTableId): Self = this.set("RouteTableId", value.asInstanceOf[js.Any])
    
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
    def setDestinationPrefixListId(value: PrefixListResourceId): Self = this.set("DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPrefixListId: Self = this.set("DestinationPrefixListId", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = this.set("EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgressOnlyInternetGatewayId: Self = this.set("EgressOnlyInternetGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: RouteGatewayId): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: LocalGatewayId): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalTarget(value: Boolean): Self = this.set("LocalTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalTarget: Self = this.set("LocalTarget", js.undefined)
    
    @scala.inline
    def setNatGatewayId(value: NatGatewayId): Self = this.set("NatGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatGatewayId: Self = this.set("NatGatewayId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
}
