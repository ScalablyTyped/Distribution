package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLBCookieStickinessPolicyInput extends StObject {
  
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this parameter, the default value is 0, which indicates that the sticky session should last for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsSdk.elbMod.CookieExpirationPeriod] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName
}
object CreateLBCookieStickinessPolicyInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName): CreateLBCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLBCookieStickinessPolicyInput]
  }
  
  @scala.inline
  implicit class CreateLBCookieStickinessPolicyInputMutableBuilder[Self <: CreateLBCookieStickinessPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieExpirationPeriod(value: CookieExpirationPeriod): Self = StObject.set(x, "CookieExpirationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieExpirationPeriodUndefined: Self = StObject.set(x, "CookieExpirationPeriod", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
