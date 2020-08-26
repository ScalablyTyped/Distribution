package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointRequest extends js.Object {
  /**
    * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
    */
  var AddRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.native
  /**
    * (Interface endpoint) One or more security group IDs to associate with the network interface.
    */
  var AddSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.native
  /**
    * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
    */
  var AddSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.native
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
  var RemoveRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.native
  /**
    * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
    */
  var RemoveSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.native
  /**
    * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
    */
  var RemoveSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.native
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
  def apply(VpcEndpointId: VpcEndpointId): ModifyVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointRequest]
  }
  @scala.inline
  implicit class ModifyVpcEndpointRequestOps[Self <: ModifyVpcEndpointRequest] (val x: Self) extends AnyVal {
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
    def setVpcEndpointId(value: VpcEndpointId): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddRouteTableIdsVarargs(value: RouteTableId*): Self = this.set("AddRouteTableIds", js.Array(value :_*))
    @scala.inline
    def setAddRouteTableIds(value: VpcEndpointRouteTableIdList): Self = this.set("AddRouteTableIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddRouteTableIds: Self = this.set("AddRouteTableIds", js.undefined)
    @scala.inline
    def setAddSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("AddSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setAddSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = this.set("AddSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSecurityGroupIds: Self = this.set("AddSecurityGroupIds", js.undefined)
    @scala.inline
    def setAddSubnetIdsVarargs(value: SubnetId*): Self = this.set("AddSubnetIds", js.Array(value :_*))
    @scala.inline
    def setAddSubnetIds(value: VpcEndpointSubnetIdList): Self = this.set("AddSubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSubnetIds: Self = this.set("AddSubnetIds", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setPolicyDocument(value: String): Self = this.set("PolicyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDocument: Self = this.set("PolicyDocument", js.undefined)
    @scala.inline
    def setPrivateDnsEnabled(value: Boolean): Self = this.set("PrivateDnsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsEnabled: Self = this.set("PrivateDnsEnabled", js.undefined)
    @scala.inline
    def setRemoveRouteTableIdsVarargs(value: RouteTableId*): Self = this.set("RemoveRouteTableIds", js.Array(value :_*))
    @scala.inline
    def setRemoveRouteTableIds(value: VpcEndpointRouteTableIdList): Self = this.set("RemoveRouteTableIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveRouteTableIds: Self = this.set("RemoveRouteTableIds", js.undefined)
    @scala.inline
    def setRemoveSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("RemoveSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setRemoveSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = this.set("RemoveSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveSecurityGroupIds: Self = this.set("RemoveSecurityGroupIds", js.undefined)
    @scala.inline
    def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = this.set("RemoveSubnetIds", js.Array(value :_*))
    @scala.inline
    def setRemoveSubnetIds(value: VpcEndpointSubnetIdList): Self = this.set("RemoveSubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveSubnetIds: Self = this.set("RemoveSubnetIds", js.undefined)
    @scala.inline
    def setResetPolicy(value: Boolean): Self = this.set("ResetPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetPolicy: Self = this.set("ResetPolicy", js.undefined)
  }
  
}

