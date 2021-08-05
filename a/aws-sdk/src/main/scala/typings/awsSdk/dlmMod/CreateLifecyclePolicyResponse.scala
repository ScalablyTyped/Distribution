package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLifecyclePolicyResponse extends StObject {
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.dlmMod.PolicyId] = js.undefined
}
object CreateLifecyclePolicyResponse {
  
  inline def apply(): CreateLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLifecyclePolicyResponse]
  }
  
  extension [Self <: CreateLifecyclePolicyResponse](x: Self) {
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
  }
}
