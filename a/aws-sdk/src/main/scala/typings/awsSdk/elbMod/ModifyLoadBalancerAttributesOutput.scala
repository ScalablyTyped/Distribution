package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerAttributes] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
}

object ModifyLoadBalancerAttributesOutput {
  @scala.inline
  def apply(): ModifyLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
  }
  @scala.inline
  implicit class ModifyLoadBalancerAttributesOutputOps[Self <: ModifyLoadBalancerAttributesOutput] (val x: Self) extends AnyVal {
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
    def setLoadBalancerAttributes(value: LoadBalancerAttributes): Self = this.set("LoadBalancerAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerAttributes: Self = this.set("LoadBalancerAttributes", js.undefined)
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("LoadBalancerName", js.undefined)
  }
  
}

