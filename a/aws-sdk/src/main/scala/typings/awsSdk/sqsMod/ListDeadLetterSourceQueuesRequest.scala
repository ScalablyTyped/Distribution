package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesRequest extends js.Object {
  /**
    * Maximum number of results to include in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * Pagination token to request the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The URL of a dead-letter queue. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object ListDeadLetterSourceQueuesRequest {
  @scala.inline
  def apply(QueueUrl: String): ListDeadLetterSourceQueuesRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
  }
  @scala.inline
  implicit class ListDeadLetterSourceQueuesRequestOps[Self <: ListDeadLetterSourceQueuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

