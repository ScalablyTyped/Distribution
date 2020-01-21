package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetImportJobsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to list the dataset import jobs for.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  /**
    * The maximum number of dataset import jobs to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListDatasetImportJobs for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetImportJobsRequest {
  @scala.inline
  def apply(datasetArn: Arn = null, maxResults: Int | Double = null, nextToken: NextToken = null): ListDatasetImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetImportJobsRequest]
  }
}

