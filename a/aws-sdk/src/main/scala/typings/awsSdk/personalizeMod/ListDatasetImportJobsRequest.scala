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
  def apply(): ListDatasetImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsRequest]
  }
  @scala.inline
  implicit class ListDatasetImportJobsRequestOps[Self <: ListDatasetImportJobsRequest] (val x: Self) extends AnyVal {
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
    def setDatasetArn(value: Arn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArn: Self = this.set("datasetArn", js.undefined)
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

