package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenersInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the listeners.
    */
  var ListenerArns: js.UndefOr[typings.awsSdk.elbv2Mod.ListenerArns] = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
}

object DescribeListenersInput {
  @scala.inline
  def apply(): DescribeListenersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenersInput]
  }
  @scala.inline
  implicit class DescribeListenersInputOps[Self <: DescribeListenersInput] (val x: Self) extends AnyVal {
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
    def setListenerArnsVarargs(value: ListenerArn*): Self = this.set("ListenerArns", js.Array(value :_*))
    @scala.inline
    def setListenerArns(value: ListenerArns): Self = this.set("ListenerArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListenerArns: Self = this.set("ListenerArns", js.undefined)
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerArn: Self = this.set("LoadBalancerArn", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
  
}

