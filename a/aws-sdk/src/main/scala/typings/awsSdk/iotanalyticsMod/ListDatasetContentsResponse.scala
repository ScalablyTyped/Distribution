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
  def apply(datasetContentSummaries: DatasetContentSummaries = null, nextToken: NextToken = null): ListDatasetContentsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetContentSummaries != null) __obj.updateDynamic("datasetContentSummaries")(datasetContentSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetContentsResponse]
  }
}

