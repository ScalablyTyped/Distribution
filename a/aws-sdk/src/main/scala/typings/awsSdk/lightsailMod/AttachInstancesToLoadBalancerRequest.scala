package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachInstancesToLoadBalancerRequest extends js.Object {
  /**
    * An array of strings representing the instance name(s) you want to attach to your load balancer. An instance must be running before you can attach it to your load balancer. There are no additional limits on the number of instances you can attach to your load balancer, aside from the limit of Lightsail instances you can create in your account (20).
    */
  var instanceNames: ResourceNameList = js.native
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName = js.native
}

object AttachInstancesToLoadBalancerRequest {
  @scala.inline
  def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): AttachInstancesToLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInstancesToLoadBalancerRequest]
  }
  @scala.inline
  implicit class AttachInstancesToLoadBalancerRequestOps[Self <: AttachInstancesToLoadBalancerRequest] (val x: Self) extends AnyVal {
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

