package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscriptionFiltersRequest extends js.Object {
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var filterNamePrefix: js.UndefOr[FilterName] = js.native
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeSubscriptionFiltersRequest {
  @scala.inline
  def apply(
    logGroupName: LogGroupName,
    filterNamePrefix: FilterName = null,
    limit: Int | Double = null,
    nextToken: NextToken = null
  ): DescribeSubscriptionFiltersRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    if (filterNamePrefix != null) __obj.updateDynamic("filterNamePrefix")(filterNamePrefix.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscriptionFiltersRequest]
  }
}

