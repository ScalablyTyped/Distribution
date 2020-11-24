package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleDetail extends js.Object {
  
  var Arn: js.UndefOr[arnType] = js.native
  
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.native
  
  /**
    * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  
  /**
    * A list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[instanceProfileListType] = js.native
  
  /**
    * The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.native
  
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.native
  
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions Where Data Is Tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typings.awsSdk.iamMod.RoleLastUsed] = js.native
  
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.native
  
  /**
    * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
    */
  var RolePolicyList: js.UndefOr[policyDetailListType] = js.native
  
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
}
object RoleDetail {
  
  @scala.inline
  def apply(): RoleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleDetail]
  }
  
  @scala.inline
  implicit class RoleDetailOps[Self <: RoleDetail] (val x: Self) extends AnyVal {
    
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
    def setAssumeRolePolicyDocument(value: policyDocumentType): Self = this.set("AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeRolePolicyDocument: Self = this.set("AssumeRolePolicyDocument", js.undefined)
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AttachedPolicy*): Self = this.set("AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAttachedManagedPolicies(value: attachedPoliciesListType): Self = this.set("AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedManagedPolicies: Self = this.set("AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setInstanceProfileListVarargs(value: InstanceProfile*): Self = this.set("InstanceProfileList", js.Array(value :_*))
    
    @scala.inline
    def setInstanceProfileList(value: instanceProfileListType): Self = this.set("InstanceProfileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileList: Self = this.set("InstanceProfileList", js.undefined)
    
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setRoleId(value: idType): Self = this.set("RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("RoleId", js.undefined)
    
    @scala.inline
    def setRoleLastUsed(value: RoleLastUsed): Self = this.set("RoleLastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleLastUsed: Self = this.set("RoleLastUsed", js.undefined)
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
    
    @scala.inline
    def setRolePolicyListVarargs(value: PolicyDetail*): Self = this.set("RolePolicyList", js.Array(value :_*))
    
    @scala.inline
    def setRolePolicyList(value: policyDetailListType): Self = this.set("RolePolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolePolicyList: Self = this.set("RolePolicyList", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
