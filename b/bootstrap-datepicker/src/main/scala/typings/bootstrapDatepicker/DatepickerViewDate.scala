package typings.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerViewDate extends StObject {
  
  /** Day of the month starting with 1 */
  var day: Double
  
  /** Month starting with 0 */
  var month: Double
  
  var year: Double
}
object DatepickerViewDate {
  
  inline def apply(day: Double, month: Double, year: Double): DatepickerViewDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerViewDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatepickerViewDate] (val x: Self) extends AnyVal {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
