package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The attributes for the load balancer.
    */
  var LoadBalancerAttributes: typings.awsSdk.elbMod.LoadBalancerAttributes = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes, LoadBalancerName: AccessPointName): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerAttributes = LoadBalancerAttributes.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
}

