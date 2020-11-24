package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerHealthCheck extends js.Object {
  
  /**
    * The number of consecutive health check successes required before the instance is moved to the Healthy state.
    */
  var HealthyThreshold: js.UndefOr[Integer] = js.native
  
  /**
    * The approximate interval, in seconds, between health checks of an individual instance.
    */
  var Interval: js.UndefOr[Integer] = js.native
  
  /**
    * The instance that is being checked. The target specifies the protocol and port. The available protocols are TCP, SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535. For the HTTP and HTTPS protocols, the target also specifies the ping path. For the TCP protocol, the target is specified as TCP: &lt;port&gt; . For the SSL protocol, the target is specified as SSL.&lt;port&gt; . For the HTTP and HTTPS protocols, the target is specified as  &lt;protocol&gt;:&lt;port&gt;/&lt;path to ping&gt; .
    */
  var Target: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check.
    */
  var Timeout: js.UndefOr[Integer] = js.native
  
  /**
    * The number of consecutive health check failures that must occur before the instance is moved to the Unhealthy state.
    */
  var UnhealthyThreshold: js.UndefOr[Integer] = js.native
}
object AwsElbLoadBalancerHealthCheck {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerHealthCheck]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerHealthCheckOps[Self <: AwsElbLoadBalancerHealthCheck] (val x: Self) extends AnyVal {
    
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
    def setHealthyThreshold(value: Integer): Self = this.set("HealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("HealthyThreshold", js.undefined)
    
    @scala.inline
    def setInterval(value: Integer): Self = this.set("Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    
    @scala.inline
    def setTarget(value: NonEmptyString): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
    
    @scala.inline
    def setTimeout(value: Integer): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: Integer): Self = this.set("UnhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("UnhealthyThreshold", js.undefined)
  }
}
