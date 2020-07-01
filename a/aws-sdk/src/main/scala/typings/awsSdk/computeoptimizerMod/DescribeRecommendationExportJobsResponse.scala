package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecommendationExportJobsResponse extends js.Object {
  /**
    * The token to use to advance to the next page of export jobs. This value is null when there are no more pages of export jobs to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects that describe recommendation export jobs.
    */
  var recommendationExportJobs: js.UndefOr[RecommendationExportJobs] = js.native
}

object DescribeRecommendationExportJobsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, recommendationExportJobs: RecommendationExportJobs = null): DescribeRecommendationExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (recommendationExportJobs != null) __obj.updateDynamic("recommendationExportJobs")(recommendationExportJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommendationExportJobsResponse]
  }
}

