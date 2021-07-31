package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * Specifies the date and time of the event.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Specifies the category for the event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    * Provides the text of this event.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the event.
    */
  var SourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the identifier for the source of the event.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the source type for this event.
    */
  var SourceType: js.UndefOr[typings.awsSdk.docdbMod.SourceType] = js.undefined
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
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
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
