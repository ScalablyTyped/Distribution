package typings.bootstrapTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimepickerTime extends StObject {
  
  var hours: js.UndefOr[Double] = js.native
  
  var meridian: js.UndefOr[String] = js.native
  
  var minutes: js.UndefOr[Double] = js.native
  
  var seconds: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TimepickerTime {
  
  @scala.inline
  def apply(): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerTime]
  }
  
  @scala.inline
  implicit class TimepickerTimeMutableBuilder[Self <: TimepickerTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    @scala.inline
    def setMeridian(value: String): Self = StObject.set(x, "meridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridianUndefined: Self = StObject.set(x, "meridian", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
