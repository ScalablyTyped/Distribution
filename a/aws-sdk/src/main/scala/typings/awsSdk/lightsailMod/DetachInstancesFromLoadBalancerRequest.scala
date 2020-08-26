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
  @scala.inline
  implicit class DetachInstancesFromLoadBalancerRequestOps[Self <: DetachInstancesFromLoadBalancerRequest] (val x: Self) extends AnyVal {
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
    def setInstanceNamesVarargs(value: ResourceName*): Self = this.set("instanceNames", js.Array(value :_*))
    @scala.inline
    def setInstanceNames(value: ResourceNameList): Self = this.set("instanceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
  }
  
}

