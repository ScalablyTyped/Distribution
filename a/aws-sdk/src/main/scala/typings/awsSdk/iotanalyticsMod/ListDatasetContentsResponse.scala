package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetContentsResponse extends js.Object {
  /**
    * Summary information about data set contents that have been created.
    */
  var datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.native
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetContentsResponse {
  @scala.inline
  def apply(): ListDatasetContentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetContentsResponse]
  }
  @scala.inline
  implicit class ListDatasetContentsResponseOps[Self <: ListDatasetContentsResponse] (val x: Self) extends AnyVal {
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
    def setDatasetContentSummariesVarargs(value: DatasetContentSummary*): Self = this.set("datasetContentSummaries", js.Array(value :_*))
    @scala.inline
    def setDatasetContentSummaries(value: DatasetContentSummaries): Self = this.set("datasetContentSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetContentSummaries: Self = this.set("datasetContentSummaries", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

