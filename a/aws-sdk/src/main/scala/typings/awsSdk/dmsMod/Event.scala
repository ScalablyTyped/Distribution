package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The date of the event.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The event categories available for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    * The event message.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    *  The identifier of an event source.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | endpoint | replication-task
    */
  var SourceType: js.UndefOr[typings.awsSdk.dmsMod.SourceType] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setDate(value: TStamp): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    inline def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSourceIdentifier(value: String): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentifierUndefined: Self = StObject.set(x, "SourceIdentifier", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
