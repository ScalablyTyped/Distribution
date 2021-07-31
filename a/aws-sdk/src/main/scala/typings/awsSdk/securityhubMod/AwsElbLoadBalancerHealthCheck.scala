package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerHealthCheck extends StObject {
  
  /**
    * The number of consecutive health check successes required before the instance is moved to the Healthy state.
    */
  var HealthyThreshold: js.UndefOr[Integer] = js.undefined
  
  /**
    * The approximate interval, in seconds, between health checks of an individual instance.
    */
  var Interval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance that is being checked. The target specifies the protocol and port. The available protocols are TCP, SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535. For the HTTP and HTTPS protocols, the target also specifies the ping path. For the TCP protocol, the target is specified as TCP: &lt;port&gt; . For the SSL protocol, the target is specified as SSL.&lt;port&gt; . For the HTTP and HTTPS protocols, the target is specified as  &lt;protocol&gt;:&lt;port&gt;/&lt;path to ping&gt; .
    */
  var Target: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check.
    */
  var Timeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of consecutive health check failures that must occur before the instance is moved to the Unhealthy state.
    */
  var UnhealthyThreshold: js.UndefOr[Integer] = js.undefined
}
object AwsElbLoadBalancerHealthCheck {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerHealthCheck]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerHealthCheckMutableBuilder[Self <: AwsElbLoadBalancerHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthyThreshold(value: Integer): Self = StObject.set(x, "HealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdUndefined: Self = StObject.set(x, "HealthyThreshold", js.undefined)
    
    @scala.inline
    def setInterval(value: Integer): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setTarget(value: NonEmptyString): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    @scala.inline
    def setTimeout(value: Integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: Integer): Self = StObject.set(x, "UnhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdUndefined: Self = StObject.set(x, "UnhealthyThreshold", js.undefined)
  }
}
