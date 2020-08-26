package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExecutionHistoryOutput extends js.Object {
  /**
    * The list of events that occurred in the execution.
    */
  var events: HistoryEventList = js.native
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.native
}

object GetExecutionHistoryOutput {
  @scala.inline
  def apply(events: HistoryEventList): GetExecutionHistoryOutput = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExecutionHistoryOutput]
  }
  @scala.inline
  implicit class GetExecutionHistoryOutputOps[Self <: GetExecutionHistoryOutput] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: HistoryEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: HistoryEventList): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PageToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

