package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCanariesLastRunResponse extends js.Object {
  /**
    * An array that contains the information from the most recent run of each canary.
    */
  var CanariesLastRun: js.UndefOr[typings.awsSdk.syntheticsMod.CanariesLastRun] = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanariesLastRun operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeCanariesLastRunResponse {
  @scala.inline
  def apply(CanariesLastRun: CanariesLastRun = null, NextToken: Token = null): DescribeCanariesLastRunResponse = {
    val __obj = js.Dynamic.literal()
    if (CanariesLastRun != null) __obj.updateDynamic("CanariesLastRun")(CanariesLastRun.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCanariesLastRunResponse]
  }
}

