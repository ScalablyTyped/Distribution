package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLbCookieStickinessPolicy extends js.Object {
  
  /**
    * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[Long] = js.native
  
  /**
    * The name of the policy. The name must be unique within the set of policies for the load balancer.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLbCookieStickinessPolicy {
  
  @scala.inline
  def apply(): AwsElbLbCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLbCookieStickinessPolicy]
  }
  
  @scala.inline
  implicit class AwsElbLbCookieStickinessPolicyOps[Self <: AwsElbLbCookieStickinessPolicy] (val x: Self) extends AnyVal {
    
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
    def setCookieExpirationPeriod(value: Long): Self = this.set("CookieExpirationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieExpirationPeriod: Self = this.set("CookieExpirationPeriod", js.undefined)
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
}
