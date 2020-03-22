package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayVpcAttachmentRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The VPC attachment options.
    */
  var Options: js.UndefOr[CreateTransitGatewayVpcAttachmentRequestOptions] = js.native
  /**
    * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one IP address from each specified subnet.
    */
  var SubnetIds: TransitGatewaySubnetIdList = js.native
  /**
    * The tags to apply to the VPC attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typings.awsSdk.ec2Mod.TransitGatewayId = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object CreateTransitGatewayVpcAttachmentRequest {
  @scala.inline
  def apply(
    SubnetIds: TransitGatewaySubnetIdList,
    TransitGatewayId: TransitGatewayId,
    VpcId: VpcId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Options: CreateTransitGatewayVpcAttachmentRequestOptions = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any], TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentRequest]
  }
}

