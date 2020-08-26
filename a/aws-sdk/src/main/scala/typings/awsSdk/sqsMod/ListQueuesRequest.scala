package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * Maximum number of results to include in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * Pagination token to request the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A string to use for filtering the list results. Only those queues whose name begins with the specified string are returned. Queue URLs and names are case-sensitive.
    */
  var QueueNamePrefix: js.UndefOr[String] = js.native
}

object ListQueuesRequest {
  @scala.inline
  def apply(): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesRequest]
  }
  @scala.inline
  implicit class ListQueuesRequestOps[Self <: ListQueuesRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: BoxedInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQueueNamePrefix(value: String): Self = this.set("QueueNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueNamePrefix: Self = this.set("QueueNamePrefix", js.undefined)
  }
  
}

