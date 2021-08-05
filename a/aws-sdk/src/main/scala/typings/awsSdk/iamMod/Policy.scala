package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The number of entities (users, groups, and roles) that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The identifier for the version of the policy that is set as the default version.
    */
  var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined
  
  /**
    * A friendly description of the policy. This element is included in the response to the GetPolicy operation. It is not included in the response to the ListPolicies operation. 
    */
  var Description: js.UndefOr[policyDescriptionType] = js.undefined
  
  /**
    * Specifies whether the policy can be attached to an IAM user, group, or role.
    */
  var IsAttachable: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The path to the policy. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[policyPathType] = js.undefined
  
  /**
    * The number of entities (users and roles) for which the policy is used to set the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined
  
  /**
    * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var PolicyId: js.UndefOr[idType] = js.undefined
  
  /**
    * The friendly name (not ARN) identifying the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
    */
  var UpdateDate: js.UndefOr[dateType] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttachmentCount(value: attachmentCountType): Self = StObject.set(x, "AttachmentCount", value.asInstanceOf[js.Any])
    
    inline def setAttachmentCountUndefined: Self = StObject.set(x, "AttachmentCount", js.undefined)
    
    inline def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDefaultVersionId(value: policyVersionIdType): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    inline def setDescription(value: policyDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsAttachable(value: booleanType): Self = StObject.set(x, "IsAttachable", value.asInstanceOf[js.Any])
    
    inline def setIsAttachableUndefined: Self = StObject.set(x, "IsAttachable", js.undefined)
    
    inline def setPath(value: policyPathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPermissionsBoundaryUsageCount(value: attachmentCountType): Self = StObject.set(x, "PermissionsBoundaryUsageCount", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUsageCountUndefined: Self = StObject.set(x, "PermissionsBoundaryUsageCount", js.undefined)
    
    inline def setPolicyId(value: idType): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setUpdateDate(value: dateType): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
