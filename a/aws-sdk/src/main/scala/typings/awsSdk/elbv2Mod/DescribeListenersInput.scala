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
  def apply(
    ListenerArns: ListenerArns = null,
    LoadBalancerArn: LoadBalancerArn = null,
    Marker: Marker = null,
    PageSize: js.UndefOr[PageSize] = js.undefined
  ): DescribeListenersInput = {
    val __obj = js.Dynamic.literal()
    if (ListenerArns != null) __obj.updateDynamic("ListenerArns")(ListenerArns.asInstanceOf[js.Any])
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenersInput]
  }
}

