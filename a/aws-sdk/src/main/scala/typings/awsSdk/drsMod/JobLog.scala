package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLog extends StObject {
  
  /**
    * The event represents the type of a log.
    */
  var event: js.UndefOr[JobLogEvent] = js.undefined
  
  /**
    * Metadata associated with a Job log.
    */
  var eventData: js.UndefOr[JobLogEventData] = js.undefined
  
  /**
    * The date and time the log was taken.
    */
  var logDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object JobLog {
  
  inline def apply(): JobLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLog]
  }
  
  extension [Self <: JobLog](x: Self) {
    
    inline def setEvent(value: JobLogEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventData(value: JobLogEventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setLogDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "logDateTime", value.asInstanceOf[js.Any])
    
    inline def setLogDateTimeUndefined: Self = StObject.set(x, "logDateTime", js.undefined)
  }
}
