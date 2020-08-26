package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayPeeringAttachmentRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The AWS account ID of the owner of the peer transit gateway.
    */
  var PeerAccountId: String = js.native
  /**
    * The Region where the peer transit gateway is located.
    */
  var PeerRegion: String = js.native
  /**
    * The ID of the peer transit gateway with which to create the peering attachment.
    */
  var PeerTransitGatewayId: TransitAssociationGatewayId = js.native
  /**
    * The tags to apply to the transit gateway peering attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typings.awsSdk.ec2Mod.TransitGatewayId = js.native
}

object CreateTransitGatewayPeeringAttachmentRequest {
  @scala.inline
  def apply(
    PeerAccountId: String,
    PeerRegion: String,
    PeerTransitGatewayId: TransitAssociationGatewayId,
    TransitGatewayId: TransitGatewayId
  ): CreateTransitGatewayPeeringAttachmentRequest = {
    val __obj = js.Dynamic.literal(PeerAccountId = PeerAccountId.asInstanceOf[js.Any], PeerRegion = PeerRegion.asInstanceOf[js.Any], PeerTransitGatewayId = PeerTransitGatewayId.asInstanceOf[js.Any], TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentRequest]
  }
  @scala.inline
  implicit class CreateTransitGatewayPeeringAttachmentRequestOps[Self <: CreateTransitGatewayPeeringAttachmentRequest] (val x: Self) extends AnyVal {
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
    def setPeerAccountId(value: String): Self = this.set("PeerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerRegion(value: String): Self = this.set("PeerRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerTransitGatewayId(value: TransitAssociationGatewayId): Self = this.set("PeerTransitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
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

