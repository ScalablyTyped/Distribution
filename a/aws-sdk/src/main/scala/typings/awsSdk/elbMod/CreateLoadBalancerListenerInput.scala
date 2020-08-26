package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerListenerInput extends js.Object {
  /**
    * The listeners.
    */
  var Listeners: typings.awsSdk.elbMod.Listeners = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object CreateLoadBalancerListenerInput {
  @scala.inline
  def apply(Listeners: Listeners, LoadBalancerName: AccessPointName): CreateLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(Listeners = Listeners.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerListenerInput]
  }
  @scala.inline
  implicit class CreateLoadBalancerListenerInputOps[Self <: CreateLoadBalancerListenerInput] (val x: Self) extends AnyVal {
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
    def setListenersVarargs(value: Listener*): Self = this.set("Listeners", js.Array(value :_*))
    @scala.inline
    def setListeners(value: Listeners): Self = this.set("Listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
  }
  
}

