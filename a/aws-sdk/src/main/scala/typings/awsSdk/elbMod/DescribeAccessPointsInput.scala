package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsInput extends js.Object {
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerNames] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbMod.Marker] = js.native
  /**
    * The maximum number of results to return with this call (a number from 1 to 400). The default is 400.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbMod.PageSize] = js.native
}

object DescribeAccessPointsInput {
  @scala.inline
  def apply(
    LoadBalancerNames: LoadBalancerNames = null,
    Marker: Marker = null,
    PageSize: js.UndefOr[PageSize] = js.undefined
  ): DescribeAccessPointsInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerNames != null) __obj.updateDynamic("LoadBalancerNames")(LoadBalancerNames.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPointsInput]
  }
}

