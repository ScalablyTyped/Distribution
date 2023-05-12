package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityPoliciesResponse extends StObject {
  
  /**
    * A map of policy names to policies.
    */
  var Policies: PolicyMap
}
object GetIdentityPoliciesResponse {
  
  inline def apply(Policies: PolicyMap): GetIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(Policies = Policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicies(value: PolicyMap): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
  }
}
