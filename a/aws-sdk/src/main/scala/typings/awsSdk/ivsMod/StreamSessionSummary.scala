package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSessionSummary extends StObject {
  
  /**
    * Time when the channel went offline. This is an ISO 8601 timestamp; note that this is returned as a string. For live streams, this is NULL.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If true, this stream encountered a quota breach or failure.
    */
  var hasErrorEvent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time when the channel went live. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Unique identifier for a live or previously live stream in the specified channel.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
}
object StreamSessionSummary {
  
  inline def apply(): StreamSessionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSessionSummary]
  }
  
  extension [Self <: StreamSessionSummary](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setHasErrorEvent(value: Boolean): Self = StObject.set(x, "hasErrorEvent", value.asInstanceOf[js.Any])
    
    inline def setHasErrorEventUndefined: Self = StObject.set(x, "hasErrorEvent", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
