package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEffectivePoliciesResponse extends StObject {
  
  /**
    * The effective policies.
    */
  var effectivePolicies: js.UndefOr[EffectivePolicies] = js.native
}
object GetEffectivePoliciesResponse {
  
  @scala.inline
  def apply(): GetEffectivePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePoliciesResponse]
  }
  
  @scala.inline
  implicit class GetEffectivePoliciesResponseMutableBuilder[Self <: GetEffectivePoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectivePolicies(value: EffectivePolicies): Self = StObject.set(x, "effectivePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePoliciesUndefined: Self = StObject.set(x, "effectivePolicies", js.undefined)
    
    @scala.inline
    def setEffectivePoliciesVarargs(value: EffectivePolicy*): Self = StObject.set(x, "effectivePolicies", js.Array(value :_*))
  }
}
