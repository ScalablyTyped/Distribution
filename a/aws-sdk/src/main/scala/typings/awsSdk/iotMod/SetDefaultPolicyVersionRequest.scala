package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultPolicyVersionRequest extends StObject {
  
  /**
    * The policy name.
    */
  var policyName: PolicyName
  
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}
object SetDefaultPolicyVersionRequest {
  
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
  
  @scala.inline
  implicit class SetDefaultPolicyVersionRequestMutableBuilder[Self <: SetDefaultPolicyVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
  }
}
