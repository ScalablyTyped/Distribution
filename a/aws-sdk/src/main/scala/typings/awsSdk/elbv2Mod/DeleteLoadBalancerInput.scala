package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn = js.native
}

object DeleteLoadBalancerInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn): DeleteLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerInput]
  }
  @scala.inline
  implicit class DeleteLoadBalancerInputOps[Self <: DeleteLoadBalancerInput] (val x: Self) extends AnyVal {
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
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
  }
  
}

