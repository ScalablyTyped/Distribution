package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleDetail extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  
  /**
    * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[instanceProfileListType] = js.undefined
  
  /**
    * The path to the role. For more information about paths, see IAM identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions boundaries for IAM identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.undefined
  
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions where data is tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typings.awsSdk.iamMod.RoleLastUsed] = js.undefined
  
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.undefined
  
  /**
    * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
    */
  var RolePolicyList: js.UndefOr[policyDetailListType] = js.undefined
  
  /**
    * A list of tags that are attached to the role. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}
object RoleDetail {
  
  inline def apply(): RoleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleDetail]
  }
  
  extension [Self <: RoleDetail](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssumeRolePolicyDocument(value: policyDocumentType): Self = StObject.set(x, "AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setAssumeRolePolicyDocumentUndefined: Self = StObject.set(x, "AssumeRolePolicyDocument", js.undefined)
    
    inline def setAttachedManagedPolicies(value: attachedPoliciesListType): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    inline def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    inline def setAttachedManagedPoliciesVarargs(value: AttachedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value*))
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setInstanceProfileList(value: instanceProfileListType): Self = StObject.set(x, "InstanceProfileList", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileListUndefined: Self = StObject.set(x, "InstanceProfileList", js.undefined)
    
    inline def setInstanceProfileListVarargs(value: InstanceProfile*): Self = StObject.set(x, "InstanceProfileList", js.Array(value*))
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    inline def setRoleId(value: idType): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "RoleId", js.undefined)
    
    inline def setRoleLastUsed(value: RoleLastUsed): Self = StObject.set(x, "RoleLastUsed", value.asInstanceOf[js.Any])
    
    inline def setRoleLastUsedUndefined: Self = StObject.set(x, "RoleLastUsed", js.undefined)
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    inline def setRolePolicyList(value: policyDetailListType): Self = StObject.set(x, "RolePolicyList", value.asInstanceOf[js.Any])
    
    inline def setRolePolicyListUndefined: Self = StObject.set(x, "RolePolicyList", js.undefined)
    
    inline def setRolePolicyListVarargs(value: PolicyDetail*): Self = StObject.set(x, "RolePolicyList", js.Array(value*))
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
