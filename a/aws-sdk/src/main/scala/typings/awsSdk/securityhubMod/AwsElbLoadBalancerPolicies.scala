package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerPolicies extends StObject {
  
  /**
    * The stickiness policies that are created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[AwsElbAppCookieStickinessPolicies] = js.undefined
  
  /**
    * The stickiness policies that are created using CreateLBCookieStickinessPolicy.
    */
  var LbCookieStickinessPolicies: js.UndefOr[AwsElbLbCookieStickinessPolicies] = js.undefined
  
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[StringList] = js.undefined
}
object AwsElbLoadBalancerPolicies {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerPolicies]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerPoliciesMutableBuilder[Self <: AwsElbLoadBalancerPolicies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppCookieStickinessPolicies(value: AwsElbAppCookieStickinessPolicies): Self = StObject.set(x, "AppCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCookieStickinessPoliciesUndefined: Self = StObject.set(x, "AppCookieStickinessPolicies", js.undefined)
    
    @scala.inline
    def setAppCookieStickinessPoliciesVarargs(value: AwsElbAppCookieStickinessPolicy*): Self = StObject.set(x, "AppCookieStickinessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setLbCookieStickinessPolicies(value: AwsElbLbCookieStickinessPolicies): Self = StObject.set(x, "LbCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLbCookieStickinessPoliciesUndefined: Self = StObject.set(x, "LbCookieStickinessPolicies", js.undefined)
    
    @scala.inline
    def setLbCookieStickinessPoliciesVarargs(value: AwsElbLbCookieStickinessPolicy*): Self = StObject.set(x, "LbCookieStickinessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setOtherPolicies(value: StringList): Self = StObject.set(x, "OtherPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherPoliciesUndefined: Self = StObject.set(x, "OtherPolicies", js.undefined)
    
    @scala.inline
    def setOtherPoliciesVarargs(value: NonEmptyString*): Self = StObject.set(x, "OtherPolicies", js.Array(value :_*))
  }
}
