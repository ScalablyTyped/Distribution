package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerConnectionDraining extends StObject {
  
  /**
    * Indicates whether connection draining is enabled for the load balancer.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
    */
  var Timeout: js.UndefOr[Integer] = js.native
}
object AwsElbLoadBalancerConnectionDraining {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerConnectionDraining]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerConnectionDrainingMutableBuilder[Self <: AwsElbLoadBalancerConnectionDraining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setTimeout(value: Integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
