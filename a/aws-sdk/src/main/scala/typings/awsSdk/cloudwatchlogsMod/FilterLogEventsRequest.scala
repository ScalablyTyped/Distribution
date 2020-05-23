package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterLogEventsRequest extends js.Object {
  /**
    * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not returned.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The filter pattern to use. For more information, see Filter and Pattern Syntax. If not provided, all the events are matched.
    */
  var filterPattern: js.UndefOr[FilterPattern] = js.native
  /**
    * If the value is true, the operation makes a best effort to provide responses that contain events from multiple log streams within the log group, interleaved in a single response. If the value is false, all the matched log events in the first log stream are searched first, then those in the next log stream, and so on. The default is false.  IMPORTANT: Starting on June 17, 2019, this parameter will be ignored and the value will be assumed to be true. The response from this operation will always interleave events from multiple log streams within a log group.
    */
  var interleaved: js.UndefOr[Interleaved] = js.native
  /**
    * The maximum number of events to return. The default is 10,000 events.
    */
  var limit: js.UndefOr[EventsLimit] = js.native
  /**
    * The name of the log group to search.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * Filters the results to include only events from log streams that have names starting with this prefix. If you specify a value for both logStreamNamePrefix and logStreamNames, but the value for logStreamNamePrefix does not match any log stream names specified in logStreamNames, the action returns an InvalidParameterException error.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.native
  /**
    * Filters the results to only logs from the log streams in this list. If you specify a value for both logStreamNamePrefix and logStreamNames, the action returns an InvalidParameterException error.
    */
  var logStreamNames: js.UndefOr[InputLogStreamNames] = js.native
  /**
    * The token for the next set of events to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not returned.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object FilterLogEventsRequest {
  @scala.inline
  def apply(
    logGroupName: LogGroupName,
    endTime: js.UndefOr[Timestamp] = js.undefined,
    filterPattern: FilterPattern = null,
    interleaved: js.UndefOr[Interleaved] = js.undefined,
    limit: js.UndefOr[EventsLimit] = js.undefined,
    logStreamNamePrefix: LogStreamName = null,
    logStreamNames: InputLogStreamNames = null,
    nextToken: NextToken = null,
    startTime: js.UndefOr[Timestamp] = js.undefined
  ): FilterLogEventsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.get.asInstanceOf[js.Any])
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(interleaved)) __obj.updateDynamic("interleaved")(interleaved.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (logStreamNamePrefix != null) __obj.updateDynamic("logStreamNamePrefix")(logStreamNamePrefix.asInstanceOf[js.Any])
    if (logStreamNames != null) __obj.updateDynamic("logStreamNames")(logStreamNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLogEventsRequest]
  }
}

