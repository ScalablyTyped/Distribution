package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policies extends js.Object {
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
  implicit class PoliciesOps[Self <: Policies] (val x: Self) extends AnyVal {
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
    def setAppCookieStickinessPoliciesVarargs(value: AppCookieStickinessPolicy*): Self = this.set("AppCookieStickinessPolicies", js.Array(value :_*))
    @scala.inline
    def setAppCookieStickinessPolicies(value: AppCookieStickinessPolicies): Self = this.set("AppCookieStickinessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppCookieStickinessPolicies: Self = this.set("AppCookieStickinessPolicies", js.undefined)
    @scala.inline
    def setLBCookieStickinessPoliciesVarargs(value: LBCookieStickinessPolicy*): Self = this.set("LBCookieStickinessPolicies", js.Array(value :_*))
    @scala.inline
    def setLBCookieStickinessPolicies(value: LBCookieStickinessPolicies): Self = this.set("LBCookieStickinessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLBCookieStickinessPolicies: Self = this.set("LBCookieStickinessPolicies", js.undefined)
    @scala.inline
    def setOtherPoliciesVarargs(value: PolicyName*): Self = this.set("OtherPolicies", js.Array(value :_*))
    @scala.inline
    def setOtherPolicies(value: PolicyNames): Self = this.set("OtherPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherPolicies: Self = this.set("OtherPolicies", js.undefined)
  }
  
}

