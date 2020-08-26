package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBatchInferenceJobsRequest extends js.Object {
  /**
    * The maximum number of batch inference job results to return in each page. The default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution version from which the batch inference jobs were created.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object ListBatchInferenceJobsRequest {
  @scala.inline
  def apply(): ListBatchInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsRequest]
  }
  @scala.inline
  implicit class ListBatchInferenceJobsRequestOps[Self <: ListBatchInferenceJobsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionVersionArn: Self = this.set("solutionVersionArn", js.undefined)
  }
  
}

