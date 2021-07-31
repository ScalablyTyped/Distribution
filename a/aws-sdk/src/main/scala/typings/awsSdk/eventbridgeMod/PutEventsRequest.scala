package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsRequest extends StObject {
  
  /**
    * The entry that defines an event in your system. You can specify several parameters for the entry such as the source and type of the event, resources associated with the event, and so on.
    */
  var Entries: PutEventsRequestEntryList
}
object PutEventsRequest {
  
  @scala.inline
  def apply(Entries: PutEventsRequestEntryList): PutEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequest]
  }
  
  @scala.inline
  implicit class PutEventsRequestMutableBuilder[Self <: PutEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: PutEventsRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: PutEventsRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
  }
}
