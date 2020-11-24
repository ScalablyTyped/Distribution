package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamRoleDetails extends js.Object {
  
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.native
  
  /**
    * The list of the managed policies that are attached to the role.
    */
  var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.native
  
  /**
    * Indicates when the role was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[AwsIamInstanceProfileList] = js.native
  
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role.
    */
  var MaxSessionDuration: js.UndefOr[Integer] = js.native
  
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  var PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary] = js.native
  
  /**
    * The stable and unique string identifying the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of inline policies that are embedded in the role.
    */
  var RolePolicyList: js.UndefOr[AwsIamRolePolicyList] = js.native
}
object AwsIamRoleDetails {
  
  @scala.inline
  def apply(): AwsIamRoleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamRoleDetails]
  }
  
  @scala.inline
  implicit class AwsIamRoleDetailsOps[Self <: AwsIamRoleDetails] (val x: Self) extends AnyVal {
    
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
    def setAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = this.set("AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeRolePolicyDocument: Self = this.set("AssumeRolePolicyDocument", js.undefined)
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AwsIamAttachedManagedPolicy*): Self = this.set("AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAttachedManagedPolicies(value: AwsIamAttachedManagedPolicyList): Self = this.set("AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedManagedPolicies: Self = this.set("AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setInstanceProfileListVarargs(value: AwsIamInstanceProfile*): Self = this.set("InstanceProfileList", js.Array(value :_*))
    
    @scala.inline
    def setInstanceProfileList(value: AwsIamInstanceProfileList): Self = this.set("InstanceProfileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileList: Self = this.set("InstanceProfileList", js.undefined)
    
    @scala.inline
    def setMaxSessionDuration(value: Integer): Self = this.set("MaxSessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSessionDuration: Self = this.set("MaxSessionDuration", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AwsIamPermissionsBoundary): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setRoleId(value: NonEmptyString): Self = this.set("RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("RoleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: NonEmptyString): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
    
    @scala.inline
    def setRolePolicyListVarargs(value: AwsIamRolePolicy*): Self = this.set("RolePolicyList", js.Array(value :_*))
    
    @scala.inline
    def setRolePolicyList(value: AwsIamRolePolicyList): Self = this.set("RolePolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolePolicyList: Self = this.set("RolePolicyList", js.undefined)
  }
}
