package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The date and time of the event.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A list of the event categories. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    * The identifier of the event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  
  /**
    * The text of this event.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the source of the event.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The source type for this event.
    */
  var SourceType: js.UndefOr[typings.awsSdk.redshiftMod.SourceType] = js.undefined
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: TStamp): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdentifierUndefined: Self = StObject.set(x, "SourceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
