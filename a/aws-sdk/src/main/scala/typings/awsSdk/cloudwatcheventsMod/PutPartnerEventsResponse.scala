package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPartnerEventsResponse extends js.Object {
  
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
  implicit class PutPartnerEventsResponseOps[Self <: PutPartnerEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: PutPartnerEventsResultEntry*): Self = this.set("Entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: PutPartnerEventsResultEntryList): Self = this.set("Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("Entries", js.undefined)
    
    @scala.inline
    def setFailedEntryCount(value: Integer): Self = this.set("FailedEntryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedEntryCount: Self = this.set("FailedEntryCount", js.undefined)
  }
}
