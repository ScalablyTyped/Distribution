package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamUserDetails extends js.Object {
  
  /**
    * A list of the managed policies that are attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.native
  
  /**
    * Indicates when the user was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of IAM groups that the user belongs to.
    */
  var GroupList: js.UndefOr[StringList] = js.native
  
  /**
    * The path to the user.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The permissions boundary for the user.
    */
  var PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary] = js.native
  
  /**
    * The unique identifier for the user.
    */
  var UserId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of inline policies that are embedded in the user.
    */
  var UserPolicyList: js.UndefOr[AwsIamUserPolicyList] = js.native
}
object AwsIamUserDetails {
  
  @scala.inline
  def apply(): AwsIamUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamUserDetails]
  }
  
  @scala.inline
  implicit class AwsIamUserDetailsOps[Self <: AwsIamUserDetails] (val x: Self) extends AnyVal {
    
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
    def setGroupListVarargs(value: NonEmptyString*): Self = this.set("GroupList", js.Array(value :_*))
    
    @scala.inline
    def setGroupList(value: StringList): Self = this.set("GroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupList: Self = this.set("GroupList", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AwsIamPermissionsBoundary): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
    
    @scala.inline
    def setUserName(value: NonEmptyString): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
    
    @scala.inline
    def setUserPolicyListVarargs(value: AwsIamUserPolicy*): Self = this.set("UserPolicyList", js.Array(value :_*))
    
    @scala.inline
    def setUserPolicyList(value: AwsIamUserPolicyList): Self = this.set("UserPolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPolicyList: Self = this.set("UserPolicyList", js.undefined)
  }
}
