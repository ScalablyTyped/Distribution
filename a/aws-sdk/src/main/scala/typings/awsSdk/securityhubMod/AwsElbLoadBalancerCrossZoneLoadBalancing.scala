package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerCrossZoneLoadBalancing extends StObject {
  
  /**
    * Indicates whether cross-zone load balancing is enabled for the load balancer.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object AwsElbLoadBalancerCrossZoneLoadBalancing {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerCrossZoneLoadBalancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerCrossZoneLoadBalancing]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerCrossZoneLoadBalancingMutableBuilder[Self <: AwsElbLoadBalancerCrossZoneLoadBalancing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
