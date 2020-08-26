package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExecutionHistoryInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution.
    */
  var executionArn: Arn = js.native
  /**
    * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
  /**
    * Lists events in descending order of their timeStamp.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.native
}

object GetExecutionHistoryInput {
  @scala.inline
  def apply(executionArn: Arn): GetExecutionHistoryInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExecutionHistoryInput]
  }
  @scala.inline
  implicit class GetExecutionHistoryInputOps[Self <: GetExecutionHistoryInput] (val x: Self) extends AnyVal {
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
    def setExecutionArn(value: Arn): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PageToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setReverseOrder(value: ReverseOrder): Self = this.set("reverseOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseOrder: Self = this.set("reverseOrder", js.undefined)
  }
  
}

