package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRouteTableRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
}

object AssociateRouteTableRequest {
  @scala.inline
  def apply(RouteTableId: RouteTableId): AssociateRouteTableRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRouteTableRequest]
  }
  @scala.inline
  implicit class AssociateRouteTableRequestOps[Self <: AssociateRouteTableRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setGatewayId(value: RouteGatewayId): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

