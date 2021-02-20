package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeDisplayFormat extends StObject {
  
  var day: js.UndefOr[String] = js.native
  
  var hour: js.UndefOr[String] = js.native
  
  var millisecond: js.UndefOr[String] = js.native
  
  var minute: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var quarter: js.UndefOr[String] = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var week: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object TimeDisplayFormat {
  
  @scala.inline
  def apply(): TimeDisplayFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDisplayFormat]
  }
  
  @scala.inline
  implicit class TimeDisplayFormatMutableBuilder[Self <: TimeDisplayFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setMillisecond(value: String): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setQuarter(value: String): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
    
    @scala.inline
    def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    @scala.inline
    def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
