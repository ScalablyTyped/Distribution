package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policies extends StObject {
  
  /**
    * The stickiness policies created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[typings.awsSdk.elbMod.AppCookieStickinessPolicies] = js.undefined
  
  /**
    * The stickiness policies created using CreateLBCookieStickinessPolicy.
    */
  var LBCookieStickinessPolicies: js.UndefOr[typings.awsSdk.elbMod.LBCookieStickinessPolicies] = js.undefined
  
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[PolicyNames] = js.undefined
}
object Policies {
  
  inline def apply(): Policies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policies]
  }
  
  extension [Self <: Policies](x: Self) {
    
    inline def setAppCookieStickinessPolicies(value: AppCookieStickinessPolicies): Self = StObject.set(x, "AppCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAppCookieStickinessPoliciesUndefined: Self = StObject.set(x, "AppCookieStickinessPolicies", js.undefined)
    
    inline def setAppCookieStickinessPoliciesVarargs(value: AppCookieStickinessPolicy*): Self = StObject.set(x, "AppCookieStickinessPolicies", js.Array(value :_*))
    
    inline def setLBCookieStickinessPolicies(value: LBCookieStickinessPolicies): Self = StObject.set(x, "LBCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    inline def setLBCookieStickinessPoliciesUndefined: Self = StObject.set(x, "LBCookieStickinessPolicies", js.undefined)
    
    inline def setLBCookieStickinessPoliciesVarargs(value: LBCookieStickinessPolicy*): Self = StObject.set(x, "LBCookieStickinessPolicies", js.Array(value :_*))
    
    inline def setOtherPolicies(value: PolicyNames): Self = StObject.set(x, "OtherPolicies", value.asInstanceOf[js.Any])
    
    inline def setOtherPoliciesUndefined: Self = StObject.set(x, "OtherPolicies", js.undefined)
    
    inline def setOtherPoliciesVarargs(value: PolicyName*): Self = StObject.set(x, "OtherPolicies", js.Array(value :_*))
  }
}
