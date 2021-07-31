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
  
  @scala.inline
  def apply(PolicyId: PolicyId): DeleteLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteLifecyclePolicyRequestMutableBuilder[Self <: DeleteLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
