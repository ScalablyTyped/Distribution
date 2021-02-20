package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePolicyResponse extends StObject {
  
  /**
    * Detailed information about the lifecycle policy.
    */
  var Policy: js.UndefOr[LifecyclePolicy] = js.native
}
object GetLifecyclePolicyResponse {
  
  @scala.inline
  def apply(): GetLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePolicyResponse]
  }
  
  @scala.inline
  implicit class GetLifecyclePolicyResponseMutableBuilder[Self <: GetLifecyclePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: LifecyclePolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
