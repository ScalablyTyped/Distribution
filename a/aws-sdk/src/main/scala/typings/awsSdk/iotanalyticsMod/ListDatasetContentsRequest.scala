package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetContentsRequest extends js.Object {
  /**
    * The name of the data set whose contents information you want to list.
    */
  var datasetName: DatasetName = js.native
  /**
    * The maximum number of results to return in this request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A filter to limit results to those data set contents whose creation is scheduled before the given time. See the field triggers.schedule in the CreateDataset request. (timestamp)
    */
  var scheduledBefore: js.UndefOr[Timestamp] = js.native
  /**
    * A filter to limit results to those data set contents whose creation is scheduled on or after the given time. See the field triggers.schedule in the CreateDataset request. (timestamp)
    */
  var scheduledOnOrAfter: js.UndefOr[Timestamp] = js.native
}

object ListDatasetContentsRequest {
  @scala.inline
  def apply(datasetName: DatasetName): ListDatasetContentsRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetContentsRequest]
  }
  @scala.inline
  implicit class ListDatasetContentsRequestOps[Self <: ListDatasetContentsRequest] (val x: Self) extends AnyVal {
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
    def setDatasetName(value: DatasetName): Self = this.set("datasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setScheduledBefore(value: Timestamp): Self = this.set("scheduledBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledBefore: Self = this.set("scheduledBefore", js.undefined)
    @scala.inline
    def setScheduledOnOrAfter(value: Timestamp): Self = this.set("scheduledOnOrAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledOnOrAfter: Self = this.set("scheduledOnOrAfter", js.undefined)
  }
  
}

