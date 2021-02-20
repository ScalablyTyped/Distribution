package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInfoMap extends StObject {
  
  /**
    * The category of an Amazon Redshift event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  
  /**
    * The description of an Amazon Redshift event.
    */
  var EventDescription: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an Amazon Redshift event.
    */
  var EventId: js.UndefOr[String] = js.native
  
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
}
object EventInfoMap {
  
  @scala.inline
  def apply(): EventInfoMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInfoMap]
  }
  
  @scala.inline
  implicit class EventInfoMapMutableBuilder[Self <: EventInfoMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventDescription(value: String): Self = StObject.set(x, "EventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDescriptionUndefined: Self = StObject.set(x, "EventDescription", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
  }
}
