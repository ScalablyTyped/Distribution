package typings.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerViewDate extends StObject {
  
  /** Day of the month starting with 1 */
  var day: Double = js.native
  
  /** Month starting with 0 */
  var month: Double = js.native
  
  var year: Double = js.native
}
object DatepickerViewDate {
  
  @scala.inline
  def apply(day: Double, month: Double, year: Double): DatepickerViewDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerViewDate]
  }
  
  @scala.inline
  implicit class DatepickerViewDateMutableBuilder[Self <: DatepickerViewDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
