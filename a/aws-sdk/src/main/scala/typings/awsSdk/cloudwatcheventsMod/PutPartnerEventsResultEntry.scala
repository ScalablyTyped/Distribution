package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPartnerEventsResultEntry extends StObject {
  
  /**
    * The error code that indicates why the event submission failed.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ErrorCode] = js.undefined
  
  /**
    * The error message that explains why the event submission failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ErrorMessage] = js.undefined
  
  /**
    * The ID of the event.
    */
  var EventId: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventId] = js.undefined
}
object PutPartnerEventsResultEntry {
  
  @scala.inline
  def apply(): PutPartnerEventsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsResultEntry]
  }
  
  @scala.inline
  implicit class PutPartnerEventsResultEntryMutableBuilder[Self <: PutPartnerEventsResultEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setEventId(value: EventId): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
  }
}
