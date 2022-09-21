package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEffectivePoliciesResponse extends StObject {
  
  /**
    * The effective policies.
    */
  var effectivePolicies: js.UndefOr[EffectivePolicies] = js.undefined
}
object GetEffectivePoliciesResponse {
  
  inline def apply(): GetEffectivePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePoliciesResponse]
  }
  
  extension [Self <: GetEffectivePoliciesResponse](x: Self) {
    
    inline def setEffectivePolicies(value: EffectivePolicies): Self = StObject.set(x, "effectivePolicies", value.asInstanceOf[js.Any])
    
    inline def setEffectivePoliciesUndefined: Self = StObject.set(x, "effectivePolicies", js.undefined)
    
    inline def setEffectivePoliciesVarargs(value: EffectivePolicy*): Self = StObject.set(x, "effectivePolicies", js.Array(value*))
  }
}
