package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterLogEventsRequest extends StObject {
  
  /**
    * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not returned.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The filter pattern to use. For more information, see Filter and Pattern Syntax. If not provided, all the events are matched.
    */
  var filterPattern: js.UndefOr[FilterPattern] = js.undefined
  
  /**
    * If the value is true, the operation makes a best effort to provide responses that contain events from multiple log streams within the log group, interleaved in a single response. If the value is false, all the matched log events in the first log stream are searched first, then those in the next log stream, and so on. The default is false.  Important: Starting on June 17, 2019, this parameter is ignored and the value is assumed to be true. The response from this operation always interleaves events from multiple log streams within a log group.
    */
  var interleaved: js.UndefOr[Interleaved] = js.undefined
  
  /**
    * The maximum number of events to return. The default is 10,000 events.
    */
  var limit: js.UndefOr[EventsLimit] = js.undefined
  
  /**
    * The name of the log group to search.
    */
  var logGroupName: LogGroupName
  
  /**
    * Filters the results to include only events from log streams that have names starting with this prefix. If you specify a value for both logStreamNamePrefix and logStreamNames, but the value for logStreamNamePrefix does not match any log stream names specified in logStreamNames, the action returns an InvalidParameterException error.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
  
  /**
    * Filters the results to only logs from the log streams in this list. If you specify a value for both logStreamNamePrefix and logStreamNames, the action returns an InvalidParameterException error.
    */
  var logStreamNames: js.UndefOr[InputLogStreamNames] = js.undefined
  
  /**
    * The token for the next set of events to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not returned.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
}
object FilterLogEventsRequest {
  
  inline def apply(logGroupName: LogGroupName): FilterLogEventsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLogEventsRequest]
  }
  
  extension [Self <: FilterLogEventsRequest](x: Self) {
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    inline def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    
    inline def setInterleaved(value: Interleaved): Self = StObject.set(x, "interleaved", value.asInstanceOf[js.Any])
    
    inline def setInterleavedUndefined: Self = StObject.set(x, "interleaved", js.undefined)
    
    inline def setLimit(value: EventsLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefix(value: LogStreamName): Self = StObject.set(x, "logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefixUndefined: Self = StObject.set(x, "logStreamNamePrefix", js.undefined)
    
    inline def setLogStreamNames(value: InputLogStreamNames): Self = StObject.set(x, "logStreamNames", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamesUndefined: Self = StObject.set(x, "logStreamNames", js.undefined)
    
    inline def setLogStreamNamesVarargs(value: LogStreamName*): Self = StObject.set(x, "logStreamNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
