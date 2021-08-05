package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLifecyclePolicyRequest extends StObject {
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsSdk.dlmMod.PolicyId
}
object DeleteLifecyclePolicyRequest {
  
  inline def apply(PolicyId: PolicyId): DeleteLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyRequest]
  }
  
  extension [Self <: DeleteLifecyclePolicyRequest](x: Self) {
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
