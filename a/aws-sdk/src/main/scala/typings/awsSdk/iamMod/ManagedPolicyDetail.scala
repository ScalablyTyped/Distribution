package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedPolicyDetail extends js.Object {
  
  var Arn: js.UndefOr[arnType] = js.native
  
  /**
    * The number of principal entities (users, groups, and roles) that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[attachmentCountType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  
  /**
    * The identifier for the version of the policy that is set as the default (operative) version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. 
    */
  var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.native
  
  /**
    * A friendly description of the policy.
    */
  var Description: js.UndefOr[policyDescriptionType] = js.native
  
  /**
    * Specifies whether the policy can be attached to an IAM user, group, or role.
    */
  var IsAttachable: js.UndefOr[booleanType] = js.native
  
  /**
    * The path to the policy. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[policyPathType] = js.native
  
  /**
    * The number of entities (users and roles) for which the policy is used as the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.native
  
  /**
    * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var PolicyId: js.UndefOr[idType] = js.native
  
  /**
    * The friendly name (not ARN) identifying the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
  
  /**
    * A list containing information about the versions of the policy.
    */
  var PolicyVersionList: js.UndefOr[policyDocumentVersionListType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
    */
  var UpdateDate: js.UndefOr[dateType] = js.native
}
object ManagedPolicyDetail {
  
  @scala.inline
  def apply(): ManagedPolicyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPolicyDetail]
  }
  
  @scala.inline
  implicit class ManagedPolicyDetailOps[Self <: ManagedPolicyDetail] (val x: Self) extends AnyVal {
    
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
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAttachmentCount(value: attachmentCountType): Self = this.set("AttachmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentCount: Self = this.set("AttachmentCount", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setDefaultVersionId(value: policyVersionIdType): Self = this.set("DefaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("DefaultVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: policyDescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsAttachable(value: booleanType): Self = this.set("IsAttachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAttachable: Self = this.set("IsAttachable", js.undefined)
    
    @scala.inline
    def setPath(value: policyPathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundaryUsageCount(value: attachmentCountType): Self = this.set("PermissionsBoundaryUsageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundaryUsageCount: Self = this.set("PermissionsBoundaryUsageCount", js.undefined)
    
    @scala.inline
    def setPolicyId(value: idType): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyVersionListVarargs(value: PolicyVersion*): Self = this.set("PolicyVersionList", js.Array(value :_*))
    
    @scala.inline
    def setPolicyVersionList(value: policyDocumentVersionListType): Self = this.set("PolicyVersionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyVersionList: Self = this.set("PolicyVersionList", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: dateType): Self = this.set("UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDate: Self = this.set("UpdateDate", js.undefined)
  }
}
