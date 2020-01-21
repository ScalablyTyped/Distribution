package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointRequest extends js.Object {
  /**
    * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
    */
  var AddRouteTableIds: js.UndefOr[ValueStringList] = js.native
  /**
    * (Interface endpoint) One or more security group IDs to associate with the network interface.
    */
  var AddSecurityGroupIds: js.UndefOr[ValueStringList] = js.native
  /**
    * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
    */
  var AddSubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
    */
  var PolicyDocument: js.UndefOr[String] = js.native
  /**
    * (Interface endpoint) Indicates whether a private hosted zone is associated with the VPC.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
    */
  var RemoveRouteTableIds: js.UndefOr[ValueStringList] = js.native
  /**
    * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
    */
  var RemoveSecurityGroupIds: js.UndefOr[ValueStringList] = js.native
  /**
    * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
    */
  var RemoveSubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * (Gateway endpoint) Specify true to reset the policy document to the default policy. The default policy allows full access to the service.
    */
  var ResetPolicy: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: typings.awsSdk.ec2Mod.VpcEndpointId = js.native
}

object ModifyVpcEndpointRequest {
  @scala.inline
  def apply(
    VpcEndpointId: VpcEndpointId,
    AddRouteTableIds: ValueStringList = null,
    AddSecurityGroupIds: ValueStringList = null,
    AddSubnetIds: ValueStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PolicyDocument: String = null,
    PrivateDnsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    RemoveRouteTableIds: ValueStringList = null,
    RemoveSecurityGroupIds: ValueStringList = null,
    RemoveSubnetIds: ValueStringList = null,
    ResetPolicy: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any])
    if (AddRouteTableIds != null) __obj.updateDynamic("AddRouteTableIds")(AddRouteTableIds.asInstanceOf[js.Any])
    if (AddSecurityGroupIds != null) __obj.updateDynamic("AddSecurityGroupIds")(AddSecurityGroupIds.asInstanceOf[js.Any])
    if (AddSubnetIds != null) __obj.updateDynamic("AddSubnetIds")(AddSubnetIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (PolicyDocument != null) __obj.updateDynamic("PolicyDocument")(PolicyDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivateDnsEnabled)) __obj.updateDynamic("PrivateDnsEnabled")(PrivateDnsEnabled.asInstanceOf[js.Any])
    if (RemoveRouteTableIds != null) __obj.updateDynamic("RemoveRouteTableIds")(RemoveRouteTableIds.asInstanceOf[js.Any])
    if (RemoveSecurityGroupIds != null) __obj.updateDynamic("RemoveSecurityGroupIds")(RemoveSecurityGroupIds.asInstanceOf[js.Any])
    if (RemoveSubnetIds != null) __obj.updateDynamic("RemoveSubnetIds")(RemoveSubnetIds.asInstanceOf[js.Any])
    if (!js.isUndefined(ResetPolicy)) __obj.updateDynamic("ResetPolicy")(ResetPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointRequest]
  }
}

