package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerToSubnetsOutput extends js.Object {
  /**
    * The IDs of the subnets attached to the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.native
}

object AttachLoadBalancerToSubnetsOutput {
  @scala.inline
  def apply(): AttachLoadBalancerToSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsOutput]
  }
  @scala.inline
  implicit class AttachLoadBalancerToSubnetsOutputOps[Self <: AttachLoadBalancerToSubnetsOutput] (val x: Self) extends AnyVal {
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
    def setSubnetsVarargs(value: SubnetId*): Self = this.set("Subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: Subnets): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
  }
  
}

