package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProcessingJobsRequest extends js.Object {
  /**
    * A filter that returns only processing jobs created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only processing jobs created after the specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only processing jobs modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only processing jobs modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of processing jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the processing job name. This filter returns only processing jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[String] = js.native
  /**
    * If the result of the previous ListProcessingJobs request was truncated, the response includes a NextToken. To retrieve the next set of processing jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typings.awsSdk.sagemakerMod.SortBy] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves only processing jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[ProcessingJobStatus] = js.native
}

object ListProcessingJobsRequest {
  @scala.inline
  def apply(): ListProcessingJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProcessingJobsRequest]
  }
  @scala.inline
  implicit class ListProcessingJobsRequestOps[Self <: ListProcessingJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    @scala.inline
    def setLastModifiedTimeAfter(value: Timestamp): Self = this.set("LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimeAfter: Self = this.set("LastModifiedTimeAfter", js.undefined)
    @scala.inline
    def setLastModifiedTimeBefore(value: Timestamp): Self = this.set("LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimeBefore: Self = this.set("LastModifiedTimeBefore", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNameContains(value: String): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortBy(value: SortBy): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setStatusEquals(value: ProcessingJobStatus): Self = this.set("StatusEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusEquals: Self = this.set("StatusEquals", js.undefined)
  }
  
}

