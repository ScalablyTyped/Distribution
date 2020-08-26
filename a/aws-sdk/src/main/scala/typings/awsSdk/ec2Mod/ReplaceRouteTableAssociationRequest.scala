package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceRouteTableAssociationRequest extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: RouteTableAssociationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the new route table to associate with the subnet.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
}

object ReplaceRouteTableAssociationRequest {
  @scala.inline
  def apply(AssociationId: RouteTableAssociationId, RouteTableId: RouteTableId): ReplaceRouteTableAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRouteTableAssociationRequest]
  }
  @scala.inline
  implicit class ReplaceRouteTableAssociationRequestOps[Self <: ReplaceRouteTableAssociationRequest] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: RouteTableAssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteTableId(value: RouteTableId): Self = this.set("RouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

