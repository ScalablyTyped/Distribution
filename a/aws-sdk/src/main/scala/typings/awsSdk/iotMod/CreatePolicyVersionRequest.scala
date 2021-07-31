package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePolicyVersionRequest extends StObject {
  
  /**
    * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
  
  /**
    * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version becomes the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
}
object CreatePolicyVersionRequest {
  
  @scala.inline
  def apply(policyDocument: PolicyDocument, policyName: PolicyName): CreatePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyVersionRequest]
  }
  
  @scala.inline
  implicit class CreatePolicyVersionRequestMutableBuilder[Self <: CreatePolicyVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsDefault(value: SetAsDefault): Self = StObject.set(x, "setAsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsDefaultUndefined: Self = StObject.set(x, "setAsDefault", js.undefined)
  }
}
