package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTypeFilter extends StObject {
  
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[EventTypeCategoryList_] = js.native
  
  /**
    * A list of event type codes.
    */
  var eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.native
  
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
}
object EventTypeFilter {
  
  @scala.inline
  def apply(): EventTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeFilter]
  }
  
  @scala.inline
  implicit class EventTypeFilterMutableBuilder[Self <: EventTypeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTypeCategories(value: EventTypeCategoryList_): Self = StObject.set(x, "eventTypeCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeCategoriesUndefined: Self = StObject.set(x, "eventTypeCategories", js.undefined)
    
    @scala.inline
    def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = StObject.set(x, "eventTypeCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventTypeCodes(value: EventTypeCodeList): Self = StObject.set(x, "eventTypeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeCodesUndefined: Self = StObject.set(x, "eventTypeCodes", js.undefined)
    
    @scala.inline
    def setEventTypeCodesVarargs(value: eventTypeCode*): Self = StObject.set(x, "eventTypeCodes", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: serviceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
