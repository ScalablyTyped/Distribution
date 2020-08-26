package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLogEventsRequest extends js.Object {
  /**
    * The log events.
    */
  var logEvents: InputLogEvents = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName = js.native
  /**
    * The sequence token obtained from the response of the previous PutLogEvents call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected.
    */
  var sequenceToken: js.UndefOr[SequenceToken] = js.native
}

object PutLogEventsRequest {
  @scala.inline
  def apply(logEvents: InputLogEvents, logGroupName: LogGroupName, logStreamName: LogStreamName): PutLogEventsRequest = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLogEventsRequest]
  }
  @scala.inline
  implicit class PutLogEventsRequestOps[Self <: PutLogEventsRequest] (val x: Self) extends AnyVal {
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
    def setLogEventsVarargs(value: InputLogEvent*): Self = this.set("logEvents", js.Array(value :_*))
    @scala.inline
    def setLogEvents(value: InputLogEvents): Self = this.set("logEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceToken(value: SequenceToken): Self = this.set("sequenceToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceToken: Self = this.set("sequenceToken", js.undefined)
  }
  
}

