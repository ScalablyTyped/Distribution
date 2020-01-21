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
  def apply(
    logGroupName: LogGroupName,
    logStreamName: LogStreamName,
    endTime: Int | Double = null,
    limit: Int | Double = null,
    nextToken: NextToken = null,
    startFromHead: js.UndefOr[Boolean] = js.undefined,
    startTime: Int | Double = null
  ): GetLogEventsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(startFromHead)) __obj.updateDynamic("startFromHead")(startFromHead.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogEventsRequest]
  }
}

