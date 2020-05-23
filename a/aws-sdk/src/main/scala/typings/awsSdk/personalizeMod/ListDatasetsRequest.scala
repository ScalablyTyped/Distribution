package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group that contains the datasets to list.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The maximum number of datasets to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListDatasetImportJobs for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetsRequest {
  @scala.inline
  def apply(
    datasetGroupArn: Arn = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsRequest]
  }
}

