package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetGroupsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The names of the target groups.
    */
  var Names: js.UndefOr[TargetGroupNames] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups.
    */
  var TargetGroupArns: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupArns] = js.native
}

object DescribeTargetGroupsInput {
  @scala.inline
  def apply(
    LoadBalancerArn: LoadBalancerArn = null,
    Marker: Marker = null,
    Names: TargetGroupNames = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    TargetGroupArns: TargetGroupArns = null
  ): DescribeTargetGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    if (TargetGroupArns != null) __obj.updateDynamic("TargetGroupArns")(TargetGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetGroupsInput]
  }
}

