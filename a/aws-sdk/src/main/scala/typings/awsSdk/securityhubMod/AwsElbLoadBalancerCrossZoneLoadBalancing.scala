package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerCrossZoneLoadBalancing extends js.Object {
  
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
  implicit class AwsElbLoadBalancerCrossZoneLoadBalancingOps[Self <: AwsElbLoadBalancerCrossZoneLoadBalancing] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
