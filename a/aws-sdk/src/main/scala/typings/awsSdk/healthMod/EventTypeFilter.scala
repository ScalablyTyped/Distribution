package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTypeFilter extends StObject {
  
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[EventTypeCategoryList_] = js.undefined
  
  /**
    * A list of event type codes.
    */
  var eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.undefined
  
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.undefined
}
object EventTypeFilter {
  
  inline def apply(): EventTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeFilter]
  }
  
  extension [Self <: EventTypeFilter](x: Self) {
    
    inline def setEventTypeCategories(value: EventTypeCategoryList_): Self = StObject.set(x, "eventTypeCategories", value.asInstanceOf[js.Any])
    
    inline def setEventTypeCategoriesUndefined: Self = StObject.set(x, "eventTypeCategories", js.undefined)
    
    inline def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = StObject.set(x, "eventTypeCategories", js.Array(value :_*))
    
    inline def setEventTypeCodes(value: EventTypeCodeList): Self = StObject.set(x, "eventTypeCodes", value.asInstanceOf[js.Any])
    
    inline def setEventTypeCodesUndefined: Self = StObject.set(x, "eventTypeCodes", js.undefined)
    
    inline def setEventTypeCodesVarargs(value: eventTypeCode*): Self = StObject.set(x, "eventTypeCodes", js.Array(value :_*))
    
    inline def setServices(value: serviceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
