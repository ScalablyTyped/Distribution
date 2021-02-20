package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedPolicyDetail extends StObject {
  
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
  implicit class ManagedPolicyDetailMutableBuilder[Self <: ManagedPolicyDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAttachmentCount(value: attachmentCountType): Self = StObject.set(x, "AttachmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentCountUndefined: Self = StObject.set(x, "AttachmentCount", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setDefaultVersionId(value: policyVersionIdType): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: policyDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsAttachable(value: booleanType): Self = StObject.set(x, "IsAttachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttachableUndefined: Self = StObject.set(x, "IsAttachable", js.undefined)
    
    @scala.inline
    def setPath(value: policyPathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPermissionsBoundaryUsageCount(value: attachmentCountType): Self = StObject.set(x, "PermissionsBoundaryUsageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsBoundaryUsageCountUndefined: Self = StObject.set(x, "PermissionsBoundaryUsageCount", js.undefined)
    
    @scala.inline
    def setPolicyId(value: idType): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyVersionList(value: policyDocumentVersionListType): Self = StObject.set(x, "PolicyVersionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionListUndefined: Self = StObject.set(x, "PolicyVersionList", js.undefined)
    
    @scala.inline
    def setPolicyVersionListVarargs(value: PolicyVersion*): Self = StObject.set(x, "PolicyVersionList", js.Array(value :_*))
    
    @scala.inline
    def setUpdateDate(value: dateType): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
