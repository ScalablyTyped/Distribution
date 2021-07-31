package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserPolicyResponse extends StObject {
  
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType
  
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType
  
  /**
    * The user the policy is associated with.
    */
  var UserName: existingUserNameType
}
object GetUserPolicyResponse {
  
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType, UserName: existingUserNameType): GetUserPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPolicyResponse]
  }
  
  @scala.inline
  implicit class GetUserPolicyResponseMutableBuilder[Self <: GetUserPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDocument(value: policyDocumentType): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
