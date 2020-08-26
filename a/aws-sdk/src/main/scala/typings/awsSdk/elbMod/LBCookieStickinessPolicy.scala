package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LBCookieStickinessPolicy extends js.Object {
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsSdk.elbMod.CookieExpirationPeriod] = js.native
  /**
    * The name of the policy. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.native
}

object LBCookieStickinessPolicy {
  @scala.inline
  def apply(): LBCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LBCookieStickinessPolicy]
  }
  @scala.inline
  implicit class LBCookieStickinessPolicyOps[Self <: LBCookieStickinessPolicy] (val x: Self) extends AnyVal {
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
    def setCookieExpirationPeriod(value: CookieExpirationPeriod): Self = this.set("CookieExpirationPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieExpirationPeriod: Self = this.set("CookieExpirationPeriod", js.undefined)
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
  
}

