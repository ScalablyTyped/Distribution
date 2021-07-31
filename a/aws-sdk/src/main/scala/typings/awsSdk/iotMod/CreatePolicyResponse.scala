package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePolicyResponse extends StObject {
  
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
  
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}
object CreatePolicyResponse {
  
  @scala.inline
  def apply(): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyResponse]
  }
  
  @scala.inline
  implicit class CreatePolicyResponseMutableBuilder[Self <: CreatePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionIdUndefined: Self = StObject.set(x, "policyVersionId", js.undefined)
  }
}
