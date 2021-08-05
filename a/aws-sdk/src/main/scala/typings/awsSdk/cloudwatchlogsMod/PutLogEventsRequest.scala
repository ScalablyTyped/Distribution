package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLogEventsRequest extends StObject {
  
  /**
    * The log events.
    */
  var logEvents: InputLogEvents
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
  
  /**
    * The sequence token obtained from the response of the previous PutLogEvents call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls might be successful or one might be rejected.
    */
  var sequenceToken: js.UndefOr[SequenceToken] = js.undefined
}
object PutLogEventsRequest {
  
  inline def apply(logEvents: InputLogEvents, logGroupName: LogGroupName, logStreamName: LogStreamName): PutLogEventsRequest = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLogEventsRequest]
  }
  
  extension [Self <: PutLogEventsRequest](x: Self) {
    
    inline def setLogEvents(value: InputLogEvents): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
    
    inline def setLogEventsVarargs(value: InputLogEvent*): Self = StObject.set(x, "logEvents", js.Array(value :_*))
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setSequenceToken(value: SequenceToken): Self = StObject.set(x, "sequenceToken", value.asInstanceOf[js.Any])
    
    inline def setSequenceTokenUndefined: Self = StObject.set(x, "sequenceToken", js.undefined)
  }
}
