package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetViolationDetailsRequest extends js.Object {
  /**
    * The AWS account ID that you want the details for.
    */
  var MemberAccount: AWSAccountId = js.native
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for. This currently only supports security group content audit policies.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
  /**
    * The ID of the resource that has violations.
    */
  var ResourceId: typings.awsSdk.fmsMod.ResourceId = js.native
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. Supported resource types are: AWS::EC2::Instance, AWS::EC2::NetworkInterface, or AWS::EC2::SecurityGroup. 
    */
  var ResourceType: typings.awsSdk.fmsMod.ResourceType = js.native
}

object GetViolationDetailsRequest {
  @scala.inline
  def apply(
    MemberAccount: AWSAccountId,
    PolicyId: PolicyId,
    ResourceId: ResourceId,
    ResourceType: ResourceType
  ): GetViolationDetailsRequest = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetViolationDetailsRequest]
  }
  @scala.inline
  implicit class GetViolationDetailsRequestOps[Self <: GetViolationDetailsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = this.set("MemberAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
  }
  
}

