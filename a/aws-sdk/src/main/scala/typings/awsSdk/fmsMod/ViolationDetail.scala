package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolationDetail extends StObject {
  
  /**
    * The AWS account that the violation details were requested for.
    */
  var MemberAccount: AWSAccountId = js.native
  
  /**
    * The ID of the AWS Firewall Manager policy that the violation details were requested for.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
  
  /**
    * Brief description for the requested resource.
    */
  var ResourceDescription: js.UndefOr[LengthBoundedString] = js.native
  
  /**
    * The resource ID that the violation details were requested for.
    */
  var ResourceId: typings.awsSdk.fmsMod.ResourceId = js.native
  
  /**
    * The ResourceTag objects associated with the resource.
    */
  var ResourceTags: js.UndefOr[TagList] = js.native
  
  /**
    * The resource type that the violation details were requested for.
    */
  var ResourceType: typings.awsSdk.fmsMod.ResourceType = js.native
  
  /**
    * List of violations for the requested resource.
    */
  var ResourceViolations: typings.awsSdk.fmsMod.ResourceViolations = js.native
}
object ViolationDetail {
  
  @scala.inline
  def apply(
    MemberAccount: AWSAccountId,
    PolicyId: PolicyId,
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    ResourceViolations: ResourceViolations
  ): ViolationDetail = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResourceViolations = ResourceViolations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolationDetail]
  }
  
  @scala.inline
  implicit class ViolationDetailMutableBuilder[Self <: ViolationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDescription(value: LengthBoundedString): Self = StObject.set(x, "ResourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDescriptionUndefined: Self = StObject.set(x, "ResourceDescription", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTags(value: TagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    @scala.inline
    def setResourceTagsVarargs(value: Tag*): Self = StObject.set(x, "ResourceTags", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceViolations(value: ResourceViolations): Self = StObject.set(x, "ResourceViolations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceViolationsVarargs(value: ResourceViolation*): Self = StObject.set(x, "ResourceViolations", js.Array(value :_*))
  }
}
