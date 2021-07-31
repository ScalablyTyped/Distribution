package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePolicyRequest extends StObject {
  
  /**
    * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the syntax for the policy's type. For more information, see Service Control Policy Syntax in the AWS Organizations User Guide. 
    */
  var Content: js.UndefOr[PolicyContent] = js.undefined
  
  /**
    * If provided, the new description for the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * If provided, the new name for the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.undefined
  
  /**
    * The unique identifier (ID) of the policy that you want to update. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase or uppercase letters, digits, or the underscore character (_).
    */
  var PolicyId: typings.awsSdk.organizationsMod.PolicyId
}
object UpdatePolicyRequest {
  
  @scala.inline
  def apply(PolicyId: PolicyId): UpdatePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePolicyRequest]
  }
  
  @scala.inline
  implicit class UpdatePolicyRequestMutableBuilder[Self <: UpdatePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: PolicyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: PolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
