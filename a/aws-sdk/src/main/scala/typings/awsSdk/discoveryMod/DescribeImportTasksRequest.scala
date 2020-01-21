package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImportTasksRequest extends js.Object {
  /**
    * An array of name-value pairs that you provide to filter the results for the DescribeImportTask request to a specific subset of results. Currently, wildcard values aren't supported for filters.
    */
  var filters: js.UndefOr[DescribeImportTasksFilterList] = js.native
  /**
    * The maximum number of results that you want this request to return, up to 100.
    */
  var maxResults: js.UndefOr[DescribeImportTasksMaxResults] = js.native
  /**
    * The token to request a specific page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeImportTasksRequest {
  @scala.inline
  def apply(
    filters: DescribeImportTasksFilterList = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): DescribeImportTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImportTasksRequest]
  }
}

