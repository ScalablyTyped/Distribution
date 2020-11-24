package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamPolicyDetails extends js.Object {
  
  /**
    * The number of users, groups, and roles that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[Integer] = js.native
  
  /**
    * When the policy was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the default version of the policy.
    */
  var DefaultVersionId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A description of the policy.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the policy can be attached to a user, group, or role.
    */
  var IsAttachable: js.UndefOr[Boolean] = js.native
  
  /**
    * The path to the policy.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of users and roles that use the policy to set the permissions boundary.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[Integer] = js.native
  
  /**
    * The unique identifier of the policy.
    */
  var PolicyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * List of versions of the policy.
    */
  var PolicyVersionList: js.UndefOr[AwsIamPolicyVersionList] = js.native
  
  /**
    * When the policy was most recently updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdateDate: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamPolicyDetails {
  
  @scala.inline
  def apply(): AwsIamPolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamPolicyDetails]
  }
  
  @scala.inline
  implicit class AwsIamPolicyDetailsOps[Self <: AwsIamPolicyDetails] (val x: Self) extends AnyVal {
    
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
    def setAttachmentCount(value: Integer): Self = this.set("AttachmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentCount: Self = this.set("AttachmentCount", js.undefined)
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setDefaultVersionId(value: NonEmptyString): Self = this.set("DefaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("DefaultVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsAttachable(value: Boolean): Self = this.set("IsAttachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAttachable: Self = this.set("IsAttachable", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundaryUsageCount(value: Integer): Self = this.set("PermissionsBoundaryUsageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundaryUsageCount: Self = this.set("PermissionsBoundaryUsageCount", js.undefined)
    
    @scala.inline
    def setPolicyId(value: NonEmptyString): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyVersionListVarargs(value: AwsIamPolicyVersion*): Self = this.set("PolicyVersionList", js.Array(value :_*))
    
    @scala.inline
    def setPolicyVersionList(value: AwsIamPolicyVersionList): Self = this.set("PolicyVersionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyVersionList: Self = this.set("PolicyVersionList", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: NonEmptyString): Self = this.set("UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDate: Self = this.set("UpdateDate", js.undefined)
  }
}
