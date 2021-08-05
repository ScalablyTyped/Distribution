package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePolicyRequest extends StObject {
  
  /**
    * The name of the policy to delete.
    */
  var policyName: PolicyName
}
object DeletePolicyRequest {
  
  inline def apply(policyName: PolicyName): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyRequest]
  }
  
  extension [Self <: DeletePolicyRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
