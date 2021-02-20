package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationEventDetails extends StObject {
  
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
  implicit class OrganizationEventDetailsMutableBuilder[Self <: OrganizationEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    @scala.inline
    def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDescription(value: EventDescription_): Self = StObject.set(x, "eventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDescriptionUndefined: Self = StObject.set(x, "eventDescription", js.undefined)
    
    @scala.inline
    def setEventMetadata(value: eventMetadata): Self = StObject.set(x, "eventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventMetadataUndefined: Self = StObject.set(x, "eventMetadata", js.undefined)
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
