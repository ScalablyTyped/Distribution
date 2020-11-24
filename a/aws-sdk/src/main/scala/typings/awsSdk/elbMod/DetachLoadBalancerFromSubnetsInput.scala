package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachLoadBalancerFromSubnetsInput extends js.Object {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  
  /**
    * The IDs of the subnets.
    */
  var Subnets: typings.awsSdk.elbMod.Subnets = js.native
}
object DetachLoadBalancerFromSubnetsInput {
  
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): DetachLoadBalancerFromSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsInput]
  }
  
  @scala.inline
  implicit class DetachLoadBalancerFromSubnetsInputOps[Self <: DetachLoadBalancerFromSubnetsInput] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = this.set("Subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = this.set("Subnets", value.asInstanceOf[js.Any])
  }
}
