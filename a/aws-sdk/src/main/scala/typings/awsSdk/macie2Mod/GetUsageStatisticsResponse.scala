package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageStatisticsResponse extends js.Object {
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * An array of objects that contains the results of the query. Each object contains the data for an account that meets the filter criteria specified in the request.
    */
  var records: js.UndefOr[listOfUsageRecord] = js.native
}

object GetUsageStatisticsResponse {
  @scala.inline
  def apply(nextToken: string = null, records: listOfUsageRecord = null): GetUsageStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageStatisticsResponse]
  }
}

