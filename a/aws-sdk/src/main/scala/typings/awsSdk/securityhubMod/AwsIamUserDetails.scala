package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamUserDetails extends StObject {
  
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
  implicit class AwsIamUserDetailsMutableBuilder[Self <: AwsIamUserDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedManagedPolicies(value: AwsIamAttachedManagedPolicyList): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    @scala.inline
    def setAttachedManagedPoliciesVarargs(value: AwsIamAttachedManagedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setGroupList(value: StringList): Self = StObject.set(x, "GroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupListUndefined: Self = StObject.set(x, "GroupList", js.undefined)
    
    @scala.inline
    def setGroupListVarargs(value: NonEmptyString*): Self = StObject.set(x, "GroupList", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AwsIamPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    @scala.inline
    def setUserPolicyList(value: AwsIamUserPolicyList): Self = StObject.set(x, "UserPolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPolicyListUndefined: Self = StObject.set(x, "UserPolicyList", js.undefined)
    
    @scala.inline
    def setUserPolicyListVarargs(value: AwsIamUserPolicy*): Self = StObject.set(x, "UserPolicyList", js.Array(value :_*))
  }
}
