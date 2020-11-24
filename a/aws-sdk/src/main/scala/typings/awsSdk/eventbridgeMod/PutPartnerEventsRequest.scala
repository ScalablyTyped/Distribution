package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPartnerEventsRequest extends js.Object {
  
  /**
    * The list of events to write to the event bus.
    */
  var Entries: PutPartnerEventsRequestEntryList = js.native
}
object PutPartnerEventsRequest {
  
  @scala.inline
  def apply(Entries: PutPartnerEventsRequestEntryList): PutPartnerEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPartnerEventsRequest]
  }
  
  @scala.inline
  implicit class PutPartnerEventsRequestOps[Self <: PutPartnerEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntriesVarargs(value: PutPartnerEventsRequestEntry*): Self = this.set("Entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: PutPartnerEventsRequestEntryList): Self = this.set("Entries", value.asInstanceOf[js.Any])
  }
}
