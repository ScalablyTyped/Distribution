package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourceSyncJobsResponse extends js.Object {
  /**
    * A history of synchronization jobs for the data source.
    */
  var History: js.UndefOr[DataSourceSyncJobHistoryList] = js.native
  /**
    * The GetDataSourceSyncJobHistory operation returns a page of vocabularies at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Kendra returns the NextPage token. Include the token in the next request to the GetDataSourceSyncJobHistory operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.native
}

object ListDataSourceSyncJobsResponse {
  @scala.inline
  def apply(): ListDataSourceSyncJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourceSyncJobsResponse]
  }
  @scala.inline
  implicit class ListDataSourceSyncJobsResponseOps[Self <: ListDataSourceSyncJobsResponse] (val x: Self) extends AnyVal {
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
    def setHistoryVarargs(value: DataSourceSyncJob*): Self = this.set("History", js.Array(value :_*))
    @scala.inline
    def setHistory(value: DataSourceSyncJobHistoryList): Self = this.set("History", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("History", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

