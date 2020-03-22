package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDashboardsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the user whose dashboards you're searching for. 
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The filters to apply to the search. Currently, you can search only by user name. For example, "Filters": [ { "Name": "QUICKSIGHT_USER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1" } ] 
    */
  var Filters: DashboardSearchFilterList = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.quicksightMod.MaxResults] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SearchDashboardsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Filters: DashboardSearchFilterList,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): SearchDashboardsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDashboardsRequest]
  }
}

