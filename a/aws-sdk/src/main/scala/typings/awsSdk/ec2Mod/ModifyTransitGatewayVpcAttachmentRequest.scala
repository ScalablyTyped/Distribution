package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTransitGatewayVpcAttachmentRequest extends js.Object {
  /**
    * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
    */
  var AddSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The new VPC attachment options.  You cannot modify the IPv6 options. 
    */
  var Options: js.UndefOr[ModifyTransitGatewayVpcAttachmentRequestOptions] = js.native
  /**
    * The IDs of one or more subnets to remove.
    */
  var RemoveSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.ec2Mod.TransitGatewayAttachmentId = js.native
}

object ModifyTransitGatewayVpcAttachmentRequest {
  @scala.inline
  def apply(
    TransitGatewayAttachmentId: TransitGatewayAttachmentId,
    AddSubnetIds: TransitGatewaySubnetIdList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Options: ModifyTransitGatewayVpcAttachmentRequestOptions = null,
    RemoveSubnetIds: TransitGatewaySubnetIdList = null
  ): ModifyTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    if (AddSubnetIds != null) __obj.updateDynamic("AddSubnetIds")(AddSubnetIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (RemoveSubnetIds != null) __obj.updateDynamic("RemoveSubnetIds")(RemoveSubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequest]
  }
}

