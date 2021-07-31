package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLbCookieStickinessPolicy extends StObject {
  
  /**
    * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the policy. The name must be unique within the set of policies for the load balancer.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLbCookieStickinessPolicy {
  
  @scala.inline
  def apply(): AwsElbLbCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLbCookieStickinessPolicy]
  }
  
  @scala.inline
  implicit class AwsElbLbCookieStickinessPolicyMutableBuilder[Self <: AwsElbLbCookieStickinessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieExpirationPeriod(value: Long): Self = StObject.set(x, "CookieExpirationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "CookieExpirationPeriod", js.undefined)
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
