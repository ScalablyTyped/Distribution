package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationEventDetails extends js.Object {
  
  /**
    * The 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  
  var event: js.UndefOr[Event] = js.native
  
  var eventDescription: js.UndefOr[EventDescription_] = js.native
  
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsSdk.healthMod.eventMetadata] = js.native
}
object OrganizationEventDetails {
  
  @scala.inline
  def apply(): OrganizationEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventDetails]
  }
  
  @scala.inline
  implicit class OrganizationEventDetailsOps[Self <: OrganizationEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsAccountId(value: accountId): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventDescription(value: EventDescription_): Self = this.set("eventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDescription: Self = this.set("eventDescription", js.undefined)
    
    @scala.inline
    def setEventMetadata(value: eventMetadata): Self = this.set("eventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventMetadata: Self = this.set("eventMetadata", js.undefined)
  }
}
