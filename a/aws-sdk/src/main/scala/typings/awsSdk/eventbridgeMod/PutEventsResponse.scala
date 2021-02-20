package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventsResponse extends StObject {
  
  /**
    * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
    */
  var Entries: js.UndefOr[PutEventsResultEntryList] = js.native
  
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}
object PutEventsResponse {
  
  @scala.inline
  def apply(): PutEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsResponse]
  }
  
  @scala.inline
  implicit class PutEventsResponseMutableBuilder[Self <: PutEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: PutEventsResultEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: PutEventsResultEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
