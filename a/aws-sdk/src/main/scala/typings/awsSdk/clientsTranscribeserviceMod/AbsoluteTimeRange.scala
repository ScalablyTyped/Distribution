package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsoluteTimeRange extends StObject {
  
  /**
    * The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your audio. If you include EndTime in your request, you must also include StartTime.
    */
  var EndTime: js.UndefOr[TimestampMilliseconds] = js.undefined
  
  /**
    * The time, in milliseconds, from the start of your media file until the value you specify in which Amazon Transcribe searches for your specified criteria.
    */
  var First: js.UndefOr[TimestampMilliseconds] = js.undefined
  
  /**
    * The time, in milliseconds, from the value you specify until the end of your media file in which Amazon Transcribe searches for your specified criteria.
    */
  var Last: js.UndefOr[TimestampMilliseconds] = js.undefined
  
  /**
    * The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your audio. If you include StartTime in your request, you must also include EndTime.
    */
  var StartTime: js.UndefOr[TimestampMilliseconds] = js.undefined
}
object AbsoluteTimeRange {
  
  inline def apply(): AbsoluteTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbsoluteTimeRange]
  }
  
  extension [Self <: AbsoluteTimeRange](x: Self) {
    
    inline def setEndTime(value: TimestampMilliseconds): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFirst(value: TimestampMilliseconds): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "First", js.undefined)
    
    inline def setLast(value: TimestampMilliseconds): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "Last", js.undefined)
    
    inline def setStartTime(value: TimestampMilliseconds): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
