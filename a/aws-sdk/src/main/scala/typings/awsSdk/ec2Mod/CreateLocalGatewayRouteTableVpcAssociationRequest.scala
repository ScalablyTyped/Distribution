package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteTableVpcAssociationRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId = js.native
  /**
    * The tags to assign to the local gateway route table VPC association.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object CreateLocalGatewayRouteTableVpcAssociationRequest {
  @scala.inline
  def apply(LocalGatewayRouteTableId: LocalGatewayRoutetableId, VpcId: VpcId): CreateLocalGatewayRouteTableVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationRequest]
  }
  @scala.inline
  implicit class CreateLocalGatewayRouteTableVpcAssociationRequestOps[Self <: CreateLocalGatewayRouteTableVpcAssociationRequest] (val x: Self) extends AnyVal {
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
    def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

