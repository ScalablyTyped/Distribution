package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetsResponse extends js.Object {
  /**
    * A list of "DatasetSummary" objects.
    */
  var datasetSummaries: js.UndefOr[DatasetSummaries] = js.native
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetsResponse {
  @scala.inline
  def apply(datasetSummaries: DatasetSummaries = null, nextToken: NextToken = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetSummaries != null) __obj.updateDynamic("datasetSummaries")(datasetSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

