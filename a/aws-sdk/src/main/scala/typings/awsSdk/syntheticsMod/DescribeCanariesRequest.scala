package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCanariesRequest extends js.Object {
  /**
    * Specify this parameter to limit how many canaries are returned each time you use the DescribeCanaries operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxCanaryResults] = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeCanariesRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxCanaryResults] = js.undefined, NextToken: Token = null): DescribeCanariesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCanariesRequest]
  }
}

