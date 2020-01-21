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
  def apply(
    AppCookieStickinessPolicies: AppCookieStickinessPolicies = null,
    LBCookieStickinessPolicies: LBCookieStickinessPolicies = null,
    OtherPolicies: PolicyNames = null
  ): Policies = {
    val __obj = js.Dynamic.literal()
    if (AppCookieStickinessPolicies != null) __obj.updateDynamic("AppCookieStickinessPolicies")(AppCookieStickinessPolicies.asInstanceOf[js.Any])
    if (LBCookieStickinessPolicies != null) __obj.updateDynamic("LBCookieStickinessPolicies")(LBCookieStickinessPolicies.asInstanceOf[js.Any])
    if (OtherPolicies != null) __obj.updateDynamic("OtherPolicies")(OtherPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policies]
  }
}

