package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossZoneLoadBalancing extends js.Object {
  
  /**
    * Specifies whether cross-zone load balancing is enabled for the load balancer.
    */
  var Enabled: CrossZoneLoadBalancingEnabled = js.native
}
object CrossZoneLoadBalancing {
  
  @scala.inline
  def apply(Enabled: CrossZoneLoadBalancingEnabled): CrossZoneLoadBalancing = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossZoneLoadBalancing]
  }
  
  @scala.inline
  implicit class CrossZoneLoadBalancingOps[Self <: CrossZoneLoadBalancing] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: CrossZoneLoadBalancingEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
  }
}
