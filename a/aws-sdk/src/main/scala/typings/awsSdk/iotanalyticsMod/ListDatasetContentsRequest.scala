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
  def apply(
    datasetName: DatasetName,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    scheduledBefore: Timestamp = null,
    scheduledOnOrAfter: Timestamp = null
  ): ListDatasetContentsRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (scheduledBefore != null) __obj.updateDynamic("scheduledBefore")(scheduledBefore.asInstanceOf[js.Any])
    if (scheduledOnOrAfter != null) __obj.updateDynamic("scheduledOnOrAfter")(scheduledOnOrAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetContentsRequest]
  }
}

