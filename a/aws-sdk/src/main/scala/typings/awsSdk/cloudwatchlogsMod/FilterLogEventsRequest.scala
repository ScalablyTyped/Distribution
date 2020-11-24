package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * If the value is true, the operation makes a best effort to provide responses that contain events from multiple log streams within the log group, interleaved in a single response. If the value is false, all the matched log events in the first log stream are searched first, then those in the next log stream, and so on. The default is false.  Important: Starting on June 17, 2019, this parameter is ignored and the value is assumed to be true. The response from this operation always interleaves events from multiple log streams within a log group.
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
    * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not returned. If you omit startTime and endTime the most recent log events are retrieved, to up 1 MB or 10,000 log events.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}
object FilterLogEventsRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): FilterLogEventsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLogEventsRequest]
  }
  
  @scala.inline
  implicit class FilterLogEventsRequestOps[Self <: FilterLogEventsRequest] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPattern: Self = this.set("filterPattern", js.undefined)
    
    @scala.inline
    def setInterleaved(value: Interleaved): Self = this.set("interleaved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterleaved: Self = this.set("interleaved", js.undefined)
    
    @scala.inline
    def setLimit(value: EventsLimit): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLogStreamNamePrefix(value: LogStreamName): Self = this.set("logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamNamePrefix: Self = this.set("logStreamNamePrefix", js.undefined)
    
    @scala.inline
    def setLogStreamNamesVarargs(value: LogStreamName*): Self = this.set("logStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setLogStreamNames(value: InputLogStreamNames): Self = this.set("logStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamNames: Self = this.set("logStreamNames", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
