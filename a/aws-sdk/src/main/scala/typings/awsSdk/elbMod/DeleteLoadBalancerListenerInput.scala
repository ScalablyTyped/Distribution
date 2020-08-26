package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerListenerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The client port numbers of the listeners.
    */
  var LoadBalancerPorts: Ports = js.native
}

object DeleteLoadBalancerListenerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPorts = LoadBalancerPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
  }
  @scala.inline
  implicit class DeleteLoadBalancerListenerInputOps[Self <: DeleteLoadBalancerListenerInput] (val x: Self) extends AnyVal {
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
    def setLoadBalancerPortsVarargs(value: AccessPointPort*): Self = this.set("LoadBalancerPorts", js.Array(value :_*))
    @scala.inline
    def setLoadBalancerPorts(value: Ports): Self = this.set("LoadBalancerPorts", value.asInstanceOf[js.Any])
  }
  
}

