package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResult extends js.Object {
  /**
    * Pagination token to include in the next request.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of queue URLs, up to 1,000 entries, or the value of MaxResults that you sent in the request.
    */
  var QueueUrls: js.UndefOr[QueueUrlList] = js.native
}

object ListQueuesResult {
  @scala.inline
  def apply(): ListQueuesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResult]
  }
  @scala.inline
  implicit class ListQueuesResultOps[Self <: ListQueuesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQueueUrlsVarargs(value: String*): Self = this.set("QueueUrls", js.Array(value :_*))
    @scala.inline
    def setQueueUrls(value: QueueUrlList): Self = this.set("QueueUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueUrls: Self = this.set("QueueUrls", js.undefined)
  }
  
}

