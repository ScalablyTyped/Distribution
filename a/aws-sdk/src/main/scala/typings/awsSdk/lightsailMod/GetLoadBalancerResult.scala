package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerResult extends js.Object {
  /**
    * An object containing information about your load balancer.
    */
  var loadBalancer: js.UndefOr[LoadBalancer] = js.native
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
  @scala.inline
  implicit class GetLoadBalancerResultOps[Self <: GetLoadBalancerResult] (val x: Self) extends AnyVal {
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
    def setLoadBalancer(value: LoadBalancer): Self = this.set("loadBalancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancer: Self = this.set("loadBalancer", js.undefined)
  }
  
}

