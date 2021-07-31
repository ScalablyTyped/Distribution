package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDetail extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * A list of the managed policies attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * A list of IAM groups that the user is in.
    */
  var GroupList: js.UndefOr[groupNameListType] = js.undefined
  
  /**
    * The path to the user. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  
  /**
    * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.undefined
  
  /**
    * The friendly name identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
  
  /**
    * A list of the inline policies embedded in the user.
    */
  var UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined
}
object UserDetail {
  
  @scala.inline
  def apply(): UserDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDetail]
  }
  
  @scala.inline
  implicit class UserDetailMutableBuilder[Self <: UserDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAttachedManagedPolicies(value: attachedPoliciesListType): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AttachedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setGroupList(value: groupNameListType): Self = StObject.set(x, "GroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupListUndefined: Self = StObject.set(x, "GroupList", js.undefined)
    
    @scala.inline
    def setGroupListVarargs(value: groupNameType*): Self = StObject.set(x, "GroupList", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: idType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    @scala.inline
    def setUserPolicyList(value: policyDetailListType): Self = StObject.set(x, "UserPolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPolicyListUndefined: Self = StObject.set(x, "UserPolicyList", js.undefined)
    
    @scala.inline
    def setUserPolicyListVarargs(value: PolicyDetail*): Self = StObject.set(x, "UserPolicyList", js.Array(value :_*))
  }
}
