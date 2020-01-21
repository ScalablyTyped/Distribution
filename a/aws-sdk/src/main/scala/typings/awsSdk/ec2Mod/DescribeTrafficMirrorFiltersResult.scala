package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorFiltersResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more Traffic Mirror filters.
    */
  var TrafficMirrorFilters: js.UndefOr[TrafficMirrorFilterSet] = js.native
}

object DescribeTrafficMirrorFiltersResult {
  @scala.inline
  def apply(NextToken: String = null, TrafficMirrorFilters: TrafficMirrorFilterSet = null): DescribeTrafficMirrorFiltersResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrafficMirrorFilters != null) __obj.updateDynamic("TrafficMirrorFilters")(TrafficMirrorFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrafficMirrorFiltersResult]
  }
}

