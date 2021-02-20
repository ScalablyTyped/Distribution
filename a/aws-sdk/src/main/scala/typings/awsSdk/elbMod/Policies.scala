package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policies extends StObject {
  
  /**
    * The stickiness policies created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[typings.awsSdk.elbMod.AppCookieStickinessPolicies] = js.native
  
  /**
    * The stickiness policies created using CreateLBCookieStickinessPolicy.
    */
  var LBCookieStickinessPolicies: js.UndefOr[typings.awsSdk.elbMod.LBCookieStickinessPolicies] = js.native
  
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[PolicyNames] = js.native
}
object Policies {
  
  @scala.inline
  def apply(): Policies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policies]
  }
  
  @scala.inline
  implicit class PoliciesMutableBuilder[Self <: Policies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppCookieStickinessPolicies(value: AppCookieStickinessPolicies): Self = StObject.set(x, "AppCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCookieStickinessPoliciesUndefined: Self = StObject.set(x, "AppCookieStickinessPolicies", js.undefined)
    
    @scala.inline
    def setAppCookieStickinessPoliciesVarargs(value: AppCookieStickinessPolicy*): Self = StObject.set(x, "AppCookieStickinessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setLBCookieStickinessPolicies(value: LBCookieStickinessPolicies): Self = StObject.set(x, "LBCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLBCookieStickinessPoliciesUndefined: Self = StObject.set(x, "LBCookieStickinessPolicies", js.undefined)
    
    @scala.inline
    def setLBCookieStickinessPoliciesVarargs(value: LBCookieStickinessPolicy*): Self = StObject.set(x, "LBCookieStickinessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setOtherPolicies(value: PolicyNames): Self = StObject.set(x, "OtherPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherPoliciesUndefined: Self = StObject.set(x, "OtherPolicies", js.undefined)
    
    @scala.inline
    def setOtherPoliciesVarargs(value: PolicyName*): Self = StObject.set(x, "OtherPolicies", js.Array(value :_*))
  }
}
