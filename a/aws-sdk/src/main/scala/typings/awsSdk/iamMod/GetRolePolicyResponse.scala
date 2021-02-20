package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRolePolicyResponse extends StObject {
  
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType = js.native
  
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType = js.native
  
  /**
    * The role the policy is associated with.
    */
  var RoleName: roleNameType = js.native
}
object GetRolePolicyResponse {
  
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType, RoleName: roleNameType): GetRolePolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolePolicyResponse]
  }
  
  @scala.inline
  implicit class GetRolePolicyResponseMutableBuilder[Self <: GetRolePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDocument(value: policyDocumentType): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
