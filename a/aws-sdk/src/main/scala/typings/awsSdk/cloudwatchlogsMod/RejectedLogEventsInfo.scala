package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectedLogEventsInfo extends StObject {
  
  /**
    * The expired log events.
    */
  var expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.native
  
  /**
    * The log events that are too new.
    */
  var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.native
  
  /**
    * The log events that are too old.
    */
  var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.native
}
object RejectedLogEventsInfo {
  
  @scala.inline
  def apply(): RejectedLogEventsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectedLogEventsInfo]
  }
  
  @scala.inline
  implicit class RejectedLogEventsInfoMutableBuilder[Self <: RejectedLogEventsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiredLogEventEndIndex(value: LogEventIndex): Self = StObject.set(x, "expiredLogEventEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredLogEventEndIndexUndefined: Self = StObject.set(x, "expiredLogEventEndIndex", js.undefined)
    
    @scala.inline
    def setTooNewLogEventStartIndex(value: LogEventIndex): Self = StObject.set(x, "tooNewLogEventStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooNewLogEventStartIndexUndefined: Self = StObject.set(x, "tooNewLogEventStartIndex", js.undefined)
    
    @scala.inline
    def setTooOldLogEventEndIndex(value: LogEventIndex): Self = StObject.set(x, "tooOldLogEventEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooOldLogEventEndIndexUndefined: Self = StObject.set(x, "tooOldLogEventEndIndex", js.undefined)
  }
}
