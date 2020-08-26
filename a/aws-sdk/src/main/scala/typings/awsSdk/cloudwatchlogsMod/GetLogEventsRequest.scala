package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogEventsRequest extends js.Object {
  /**
    * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp equal to or later than this time are not included.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of log events returned. If you don't specify a value, the maximum is as many log events as can fit in a response size of 1 MB, up to 10,000 log events.
    */
  var limit: js.UndefOr[EventsLimit] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.) Using this token works only when you specify true for startFromHead.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * If the value is true, the earliest log events are returned first. If the value is false, the latest log events are returned first. The default value is false. If you are using nextToken in this operation, you must specify true for startFromHead.
    */
  var startFromHead: js.UndefOr[StartFromHead] = js.native
  /**
    * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this time are not included.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object GetLogEventsRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, logStreamName: LogStreamName): GetLogEventsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogEventsRequest]
  }
  @scala.inline
  implicit class GetLogEventsRequestOps[Self <: GetLogEventsRequest] (val x: Self) extends AnyVal {
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
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setLimit(value: EventsLimit): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setStartFromHead(value: StartFromHead): Self = this.set("startFromHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartFromHead: Self = this.set("startFromHead", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

