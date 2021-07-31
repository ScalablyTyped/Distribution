package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamRoleDetails extends StObject {
  
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.undefined
  
  /**
    * The list of the managed policies that are attached to the role.
    */
  var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.undefined
  
  /**
    * Indicates when the role was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[AwsIamInstanceProfileList] = js.undefined
  
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role.
    */
  var MaxSessionDuration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  
  var PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary] = js.undefined
  
  /**
    * The stable and unique string identifying the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of inline policies that are embedded in the role.
    */
  var RolePolicyList: js.UndefOr[AwsIamRolePolicyList] = js.undefined
}
object AwsIamRoleDetails {
  
  @scala.inline
  def apply(): AwsIamRoleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamRoleDetails]
  }
  
  @scala.inline
  implicit class AwsIamRoleDetailsMutableBuilder[Self <: AwsIamRoleDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = StObject.set(x, "AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeRolePolicyDocumentUndefined: Self = StObject.set(x, "AssumeRolePolicyDocument", js.undefined)
    
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
    def setInstanceProfileList(value: AwsIamInstanceProfileList): Self = StObject.set(x, "InstanceProfileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileListUndefined: Self = StObject.set(x, "InstanceProfileList", js.undefined)
    
    @scala.inline
    def setInstanceProfileListVarargs(value: AwsIamInstanceProfile*): Self = StObject.set(x, "InstanceProfileList", js.Array(value :_*))
    
    @scala.inline
    def setMaxSessionDuration(value: Integer): Self = StObject.set(x, "MaxSessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSessionDurationUndefined: Self = StObject.set(x, "MaxSessionDuration", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AwsIamPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setRoleId(value: NonEmptyString): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleIdUndefined: Self = StObject.set(x, "RoleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: NonEmptyString): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    @scala.inline
    def setRolePolicyList(value: AwsIamRolePolicyList): Self = StObject.set(x, "RolePolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolePolicyListUndefined: Self = StObject.set(x, "RolePolicyList", js.undefined)
    
    @scala.inline
    def setRolePolicyListVarargs(value: AwsIamRolePolicy*): Self = StObject.set(x, "RolePolicyList", js.Array(value :_*))
  }
}
