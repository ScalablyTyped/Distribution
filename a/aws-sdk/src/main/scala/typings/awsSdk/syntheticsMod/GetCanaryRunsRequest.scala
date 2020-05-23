package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCanaryRunsRequest extends js.Object {
  /**
    * Specify this parameter to limit how many runs are returned each time you use the GetCanaryRuns operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.native
  /**
    * The name of the canary that you want to see runs for.
    */
  var Name: CanaryName = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCanaryRunsRequest {
  @scala.inline
  def apply(Name: CanaryName, MaxResults: js.UndefOr[MaxSize100] = js.undefined, NextToken: Token = null): GetCanaryRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRunsRequest]
  }
}

