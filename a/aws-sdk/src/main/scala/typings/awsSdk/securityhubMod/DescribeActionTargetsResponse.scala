package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActionTargetsResponse extends js.Object {
  /**
    * A list of ActionTarget objects. Each object includes the ActionTargetArn, Description, and Name of a custom action target available in Security Hub.
    */
  var ActionTargets: ActionTargetList = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object DescribeActionTargetsResponse {
  @scala.inline
  def apply(ActionTargets: ActionTargetList, NextToken: NextToken = null): DescribeActionTargetsResponse = {
    val __obj = js.Dynamic.literal(ActionTargets = ActionTargets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActionTargetsResponse]
  }
}

