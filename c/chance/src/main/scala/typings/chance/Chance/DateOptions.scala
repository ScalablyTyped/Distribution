package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateOptions extends StObject {
  
  var american: js.UndefOr[Boolean] = js.undefined
  
  var day: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var month: js.UndefOr[Double] = js.undefined
  
  var string: js.UndefOr[Boolean] = js.undefined
  
  var year: js.UndefOr[Double] = js.undefined
}
object DateOptions {
  
  inline def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  
  extension [Self <: DateOptions](x: Self) {
    
    inline def setAmerican(value: Boolean): Self = StObject.set(x, "american", value.asInstanceOf[js.Any])
    
    inline def setAmericanUndefined: Self = StObject.set(x, "american", js.undefined)
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setString(value: Boolean): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
