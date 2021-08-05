package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var days: js.UndefOr[Double] = js.undefined
  
  var hours: js.UndefOr[Double] = js.undefined
  
  var minutes: js.UndefOr[Double] = js.undefined
  
  var months: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[Double] = js.undefined
  
  var weeks: js.UndefOr[Double] = js.undefined
  
  var years: js.UndefOr[Double] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
  }
}
