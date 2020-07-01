package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecommendationExportJobsRequest extends js.Object {
  /**
    * An array of objects that describe a filter to return a more specific list of export jobs.
    */
  var filters: js.UndefOr[JobFilters] = js.native
  /**
    * The identification numbers of the export jobs to return. An export job ID is returned when you create an export using the ExportAutoScalingGroupRecommendations or ExportEC2InstanceRecommendations actions. All export jobs created in the last seven days are returned if this parameter is omitted.
    */
  var jobIds: js.UndefOr[JobIds] = js.native
  /**
    * The maximum number of export jobs to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to advance to the next page of export jobs.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeRecommendationExportJobsRequest {
  @scala.inline
  def apply(
    filters: JobFilters = null,
    jobIds: JobIds = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): DescribeRecommendationExportJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (jobIds != null) __obj.updateDynamic("jobIds")(jobIds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommendationExportJobsRequest]
  }
}

