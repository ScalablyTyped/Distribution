package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancersInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArns] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The names of the load balancers.
    */
  var Names: js.UndefOr[LoadBalancerNames] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
}

object DescribeLoadBalancersInput {
  @scala.inline
  def apply(): DescribeLoadBalancersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersInput]
  }
  @scala.inline
  implicit class DescribeLoadBalancersInputOps[Self <: DescribeLoadBalancersInput] (val x: Self) extends AnyVal {
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
    def setLoadBalancerArnsVarargs(value: LoadBalancerArn*): Self = this.set("LoadBalancerArns", js.Array(value :_*))
    @scala.inline
    def setLoadBalancerArns(value: LoadBalancerArns): Self = this.set("LoadBalancerArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerArns: Self = this.set("LoadBalancerArns", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setNamesVarargs(value: LoadBalancerName*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: LoadBalancerNames): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
  
}

