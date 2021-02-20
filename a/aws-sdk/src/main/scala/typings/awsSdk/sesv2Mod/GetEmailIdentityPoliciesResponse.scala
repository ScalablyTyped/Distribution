package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailIdentityPoliciesResponse extends StObject {
  
  /**
    * A map of policy names to policies.
    */
  var Policies: js.UndefOr[PolicyMap] = js.native
}
object GetEmailIdentityPoliciesResponse {
  
  @scala.inline
  def apply(): GetEmailIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEmailIdentityPoliciesResponse]
  }
  
  @scala.inline
  implicit class GetEmailIdentityPoliciesResponseMutableBuilder[Self <: GetEmailIdentityPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: PolicyMap): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
  }
}
