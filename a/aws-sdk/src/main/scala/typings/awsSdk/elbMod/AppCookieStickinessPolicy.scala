package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCookieStickinessPolicy extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[typings.awsSdk.elbMod.CookieName] = js.native
  /**
    * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.native
}

object AppCookieStickinessPolicy {
  @scala.inline
  def apply(): AppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCookieStickinessPolicy]
  }
  @scala.inline
  implicit class AppCookieStickinessPolicyOps[Self <: AppCookieStickinessPolicy] (val x: Self) extends AnyVal {
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
    def setCookieName(value: CookieName): Self = this.set("CookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieName: Self = this.set("CookieName", js.undefined)
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
  
}

