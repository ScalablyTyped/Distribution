package typings.bootstrapTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimepickerTime extends StObject {
  
  var hours: js.UndefOr[Double] = js.undefined
  
  var meridian: js.UndefOr[String] = js.undefined
  
  var minutes: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TimepickerTime {
  
  inline def apply(): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimepickerTime] (val x: Self) extends AnyVal {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMeridian(value: String): Self = StObject.set(x, "meridian", value.asInstanceOf[js.Any])
    
    inline def setMeridianUndefined: Self = StObject.set(x, "meridian", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
