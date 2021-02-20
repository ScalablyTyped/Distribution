package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePoliciesResponse extends StObject {
  
  /**
    * Summary information about the lifecycle policies.
    */
  var Policies: js.UndefOr[LifecyclePolicySummaryList] = js.native
}
object GetLifecyclePoliciesResponse {
  
  @scala.inline
  def apply(): GetLifecyclePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePoliciesResponse]
  }
  
  @scala.inline
  implicit class GetLifecyclePoliciesResponseMutableBuilder[Self <: GetLifecyclePoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: LifecyclePolicySummaryList): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: LifecyclePolicySummary*): Self = StObject.set(x, "Policies", js.Array(value :_*))
  }
}
