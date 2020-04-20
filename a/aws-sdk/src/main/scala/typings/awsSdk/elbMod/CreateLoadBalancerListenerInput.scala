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
}

