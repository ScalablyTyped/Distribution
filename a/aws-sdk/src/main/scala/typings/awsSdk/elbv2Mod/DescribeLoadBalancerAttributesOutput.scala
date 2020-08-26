package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var Attributes: js.UndefOr[LoadBalancerAttributes] = js.native
}

object DescribeLoadBalancerAttributesOutput {
  @scala.inline
  def apply(): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerAttributesOutputOps[Self <: DescribeLoadBalancerAttributesOutput] (val x: Self) extends AnyVal {
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
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

