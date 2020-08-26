package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesInput extends js.Object {
  /**
    * The load balancer attributes.
    */
  var Attributes: LoadBalancerAttributes = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn = js.native
}

object ModifyLoadBalancerAttributesInput {
  @scala.inline
  def apply(Attributes: LoadBalancerAttributes, LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  @scala.inline
  implicit class ModifyLoadBalancerAttributesInputOps[Self <: ModifyLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributesVarargs(value: LoadBalancerAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: LoadBalancerAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
  }
  
}

