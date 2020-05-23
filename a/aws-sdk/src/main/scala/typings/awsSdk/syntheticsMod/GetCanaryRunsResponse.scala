package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCanaryRunsResponse extends js.Object {
  /**
    * An array of structures. Each structure contains the details of one of the retrieved canary runs.
    */
  var CanaryRuns: js.UndefOr[typings.awsSdk.syntheticsMod.CanaryRuns] = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCanaryRunsResponse {
  @scala.inline
  def apply(CanaryRuns: CanaryRuns = null, NextToken: Token = null): GetCanaryRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (CanaryRuns != null) __obj.updateDynamic("CanaryRuns")(CanaryRuns.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRunsResponse]
  }
}

