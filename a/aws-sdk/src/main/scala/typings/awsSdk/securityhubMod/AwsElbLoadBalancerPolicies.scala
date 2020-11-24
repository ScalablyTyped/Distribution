package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerPolicies extends js.Object {
  
  /**
    * The stickiness policies that are created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[AwsElbAppCookieStickinessPolicies] = js.native
  
  /**
    * The stickiness policies that are created using CreateLBCookieStickinessPolicy.
    */
  var LbCookieStickinessPolicies: js.UndefOr[AwsElbLbCookieStickinessPolicies] = js.native
  
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[StringList] = js.native
}
object AwsElbLoadBalancerPolicies {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerPolicies]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerPoliciesOps[Self <: AwsElbLoadBalancerPolicies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppCookieStickinessPoliciesVarargs(value: AwsElbAppCookieStickinessPolicy*): Self = this.set("AppCookieStickinessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAppCookieStickinessPolicies(value: AwsElbAppCookieStickinessPolicies): Self = this.set("AppCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppCookieStickinessPolicies: Self = this.set("AppCookieStickinessPolicies", js.undefined)
    
    @scala.inline
    def setLbCookieStickinessPoliciesVarargs(value: AwsElbLbCookieStickinessPolicy*): Self = this.set("LbCookieStickinessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setLbCookieStickinessPolicies(value: AwsElbLbCookieStickinessPolicies): Self = this.set("LbCookieStickinessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLbCookieStickinessPolicies: Self = this.set("LbCookieStickinessPolicies", js.undefined)
    
    @scala.inline
    def setOtherPoliciesVarargs(value: NonEmptyString*): Self = this.set("OtherPolicies", js.Array(value :_*))
    
    @scala.inline
    def setOtherPolicies(value: StringList): Self = this.set("OtherPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherPolicies: Self = this.set("OtherPolicies", js.undefined)
  }
}
