package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerRequest extends js.Object {
  /**
    * The name of the load balancer you want to delete.
    */
  var loadBalancerName: ResourceName = js.native
}

object DeleteLoadBalancerRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): DeleteLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerRequest]
  }
  @scala.inline
  implicit class DeleteLoadBalancerRequestOps[Self <: DeleteLoadBalancerRequest] (val x: Self) extends AnyVal {
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
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
  }
  
}

