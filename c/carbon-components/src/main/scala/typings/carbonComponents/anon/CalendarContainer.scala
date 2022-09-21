package typings.carbonComponents.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarContainer extends StObject {
  
  var calendarContainer: HTMLElement
  
  var selectedDates: js.Array[js.Date]
}
object CalendarContainer {
  
  inline def apply(calendarContainer: HTMLElement, selectedDates: js.Array[js.Date]): CalendarContainer = {
    val __obj = js.Dynamic.literal(calendarContainer = calendarContainer.asInstanceOf[js.Any], selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarContainer]
  }
  
  extension [Self <: CalendarContainer](x: Self) {
    
    inline def setCalendarContainer(value: HTMLElement): Self = StObject.set(x, "calendarContainer", value.asInstanceOf[js.Any])
    
    inline def setSelectedDates(value: js.Array[js.Date]): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
    
    inline def setSelectedDatesVarargs(value: js.Date*): Self = StObject.set(x, "selectedDates", js.Array(value*))
  }
}
