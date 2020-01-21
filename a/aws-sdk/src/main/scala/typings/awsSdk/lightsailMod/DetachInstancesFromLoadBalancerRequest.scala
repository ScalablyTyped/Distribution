package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachInstancesFromLoadBalancerRequest extends js.Object {
  /**
    * An array of strings containing the names of the instances you want to detach from the load balancer.
    */
  var instanceNames: ResourceNameList = js.native
  /**
    * The name of the Lightsail load balancer.
    */
  var loadBalancerName: ResourceName = js.native
}

object DetachInstancesFromLoadBalancerRequest {
  @scala.inline
  def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): DetachInstancesFromLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachInstancesFromLoadBalancerRequest]
  }
}

