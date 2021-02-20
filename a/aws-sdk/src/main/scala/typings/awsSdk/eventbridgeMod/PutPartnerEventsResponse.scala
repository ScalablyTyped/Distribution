package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPartnerEventsResponse extends StObject {
  
  /**
    * The list of events from this operation that were successfully written to the partner event bus.
    */
  var Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.native
  
  /**
    * The number of events from this operation that could not be written to the partner event bus.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}
object PutPartnerEventsResponse {
  
  @scala.inline
  def apply(): PutPartnerEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsResponse]
  }
  
  @scala.inline
  implicit class PutPartnerEventsResponseMutableBuilder[Self <: PutPartnerEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: PutPartnerEventsResultEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: PutPartnerEventsResultEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
