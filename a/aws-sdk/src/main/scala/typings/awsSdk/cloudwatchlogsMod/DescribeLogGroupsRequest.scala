package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLogGroupsRequest extends js.Object {
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  /**
    * The prefix to match.
    */
  var logGroupNamePrefix: js.UndefOr[LogGroupName] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeLogGroupsRequest {
  @scala.inline
  def apply(limit: Int | Double = null, logGroupNamePrefix: LogGroupName = null, nextToken: NextToken = null): DescribeLogGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (logGroupNamePrefix != null) __obj.updateDynamic("logGroupNamePrefix")(logGroupNamePrefix.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLogGroupsRequest]
  }
}

