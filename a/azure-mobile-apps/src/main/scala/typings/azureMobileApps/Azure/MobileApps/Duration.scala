package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var days: js.UndefOr[Double] = js.undefined
  
  var hours: js.UndefOr[Double] = js.undefined
  
  var milliseconds: js.UndefOr[Double] = js.undefined
  
  var minutes: js.UndefOr[Double] = js.undefined
  
  var months: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[Double] = js.undefined
  
  var weeks: js.UndefOr[Double] = js.undefined
  
  var years: js.UndefOr[Double] = js.undefined
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    @scala.inline
    def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    @scala.inline
    def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    @scala.inline
    def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
    
    @scala.inline
    def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
  }
}
