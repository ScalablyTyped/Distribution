package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExecutionStatusResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of remediation execution statuses objects.
    */
  var RemediationExecutionStatuses: js.UndefOr[typings.awsSdk.configserviceMod.RemediationExecutionStatuses] = js.native
}

object DescribeRemediationExecutionStatusResponse {
  @scala.inline
  def apply(NextToken: String = null, RemediationExecutionStatuses: RemediationExecutionStatuses = null): DescribeRemediationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RemediationExecutionStatuses != null) __obj.updateDynamic("RemediationExecutionStatuses")(RemediationExecutionStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
  }
}

