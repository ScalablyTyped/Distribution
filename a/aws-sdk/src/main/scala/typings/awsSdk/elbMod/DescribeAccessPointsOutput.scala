package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsOutput extends js.Object {
  /**
    * Information about the load balancers.
    */
  var LoadBalancerDescriptions: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerDescriptions] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeAccessPointsOutput {
  @scala.inline
  def apply(LoadBalancerDescriptions: LoadBalancerDescriptions = null, NextMarker: Marker = null): DescribeAccessPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerDescriptions != null) __obj.updateDynamic("LoadBalancerDescriptions")(LoadBalancerDescriptions.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPointsOutput]
  }
}

