package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LBCookieStickinessPolicy extends StObject {
  
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsSdk.elbMod.CookieExpirationPeriod] = js.undefined
  
  /**
    * The name of the policy. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.undefined
}
object LBCookieStickinessPolicy {
  
  @scala.inline
  def apply(): LBCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LBCookieStickinessPolicy]
  }
  
  @scala.inline
  implicit class LBCookieStickinessPolicyMutableBuilder[Self <: LBCookieStickinessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieExpirationPeriod(value: CookieExpirationPeriod): Self = StObject.set(x, "CookieExpirationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "CookieExpirationPeriod", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
