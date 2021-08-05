package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachPrincipalPolicyRequest extends StObject {
  
  /**
    * The name of the policy to detach.
    */
  var policyName: PolicyName
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: Principal
}
object DetachPrincipalPolicyRequest {
  
  inline def apply(policyName: PolicyName, principal: Principal): DetachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachPrincipalPolicyRequest]
  }
  
  extension [Self <: DetachPrincipalPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
  }
}
