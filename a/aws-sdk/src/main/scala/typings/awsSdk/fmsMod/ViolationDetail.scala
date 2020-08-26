package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViolationDetail extends js.Object {
  /**
    * The AWS account that the violation details were requested for.
    */
  var MemberAccount: AWSAccountId = js.native
  /**
    * The ID of the AWS Firewall Manager policy that the violation details were requested for.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
  /**
    * Brief description for the requested resource.
    */
  var ResourceDescription: js.UndefOr[LengthBoundedString] = js.native
  /**
    * The resource ID that the violation details were requested for.
    */
  var ResourceId: typings.awsSdk.fmsMod.ResourceId = js.native
  /**
    * The ResourceTag objects associated with the resource.
    */
  var ResourceTags: js.UndefOr[TagList] = js.native
  /**
    * The resource type that the violation details were requested for.
    */
  var ResourceType: typings.awsSdk.fmsMod.ResourceType = js.native
  /**
    * List of violations for the requested resource.
    */
  var ResourceViolations: typings.awsSdk.fmsMod.ResourceViolations = js.native
}

object ViolationDetail {
  @scala.inline
  def apply(
    MemberAccount: AWSAccountId,
    PolicyId: PolicyId,
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    ResourceViolations: ResourceViolations
  ): ViolationDetail = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResourceViolations = ResourceViolations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolationDetail]
  }
  @scala.inline
  implicit class ViolationDetailOps[Self <: ViolationDetail] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setResourceViolationsVarargs(value: ResourceViolation*): Self = this.set("ResourceViolations", js.Array(value :_*))
    @scala.inline
    def setResourceViolations(value: ResourceViolations): Self = this.set("ResourceViolations", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceDescription(value: LengthBoundedString): Self = this.set("ResourceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceDescription: Self = this.set("ResourceDescription", js.undefined)
    @scala.inline
    def setResourceTagsVarargs(value: Tag*): Self = this.set("ResourceTags", js.Array(value :_*))
    @scala.inline
    def setResourceTags(value: TagList): Self = this.set("ResourceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTags: Self = this.set("ResourceTags", js.undefined)
  }
  
}

