package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the queues.
    */
  var QueueSummaryList: js.UndefOr[typings.awsSdk.connectMod.QueueSummaryList] = js.native
}

object ListQueuesResponse {
  @scala.inline
  def apply(): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResponse]
  }
  @scala.inline
  implicit class ListQueuesResponseOps[Self <: ListQueuesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQueueSummaryListVarargs(value: QueueSummary*): Self = this.set("QueueSummaryList", js.Array(value :_*))
    @scala.inline
    def setQueueSummaryList(value: QueueSummaryList): Self = this.set("QueueSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueSummaryList: Self = this.set("QueueSummaryList", js.undefined)
  }
  
}

