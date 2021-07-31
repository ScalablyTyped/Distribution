package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDetails extends StObject {
  
  /**
    * Summary information about the event.
    */
  var event: js.UndefOr[Event] = js.undefined
  
  /**
    * The most recent description of the event.
    */
  var eventDescription: js.UndefOr[EventDescription_] = js.undefined
  
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsSdk.healthMod.eventMetadata] = js.undefined
}
object EventDetails {
  
  @scala.inline
  def apply(): EventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDetails]
  }
  
  @scala.inline
  implicit class EventDetailsMutableBuilder[Self <: EventDetails] (val x: Self) extends AnyVal {
    
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
