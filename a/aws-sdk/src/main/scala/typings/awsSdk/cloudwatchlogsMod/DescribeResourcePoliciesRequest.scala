package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourcePoliciesRequest extends js.Object {
  /**
    * The maximum number of resource policies to be displayed with one call of this API.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeResourcePoliciesRequest {
  @scala.inline
  def apply(limit: Int | Double = null, nextToken: NextToken = null): DescribeResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePoliciesRequest]
  }
}

