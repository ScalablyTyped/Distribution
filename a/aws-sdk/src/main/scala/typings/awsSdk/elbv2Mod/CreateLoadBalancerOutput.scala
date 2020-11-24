package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoadBalancerOutput extends js.Object {
  
  /**
    * Information about the load balancer.
    */
  var LoadBalancers: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancers] = js.native
}
object CreateLoadBalancerOutput {
  
  @scala.inline
  def apply(): CreateLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoadBalancerOutput]
  }
  
  @scala.inline
  implicit class CreateLoadBalancerOutputOps[Self <: CreateLoadBalancerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = this.set("LoadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = this.set("LoadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancers: Self = this.set("LoadBalancers", js.undefined)
  }
}
