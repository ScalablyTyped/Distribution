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
  def apply(): DescribeRecommendationExportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationExportJobsRequest]
  }
  @scala.inline
  implicit class DescribeRecommendationExportJobsRequestOps[Self <: DescribeRecommendationExportJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: JobFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: JobFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setJobIdsVarargs(value: JobId*): Self = this.set("jobIds", js.Array(value :_*))
    @scala.inline
    def setJobIds(value: JobIds): Self = this.set("jobIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobIds: Self = this.set("jobIds", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

