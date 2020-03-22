package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTransitGatewayMulticastDomainRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the subnets;
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId] = js.native
}

object DisassociateTransitGatewayMulticastDomainRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    SubnetIds: ValueStringList = null,
    TransitGatewayAttachmentId: TransitGatewayAttachmentId = null,
    TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId = null
  ): DisassociateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    if (TransitGatewayMulticastDomainId != null) __obj.updateDynamic("TransitGatewayMulticastDomainId")(TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainRequest]
  }
}

