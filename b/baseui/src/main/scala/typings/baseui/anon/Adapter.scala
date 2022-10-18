package typings.baseui.anon

import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adapter extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var locale: Any
  
  var maxDate: Any
  
  var minDate: Any
  
  def onYearChange(): Unit
}
object Adapter {
  
  inline def apply(adapter: DateIOAdapter[js.Date], locale: Any, maxDate: Any, minDate: Any, onYearChange: () => Unit): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onYearChange = js.Any.fromFunction0(onYearChange))
    __obj.asInstanceOf[Adapter]
  }
  
  extension [Self <: Adapter](x: Self) {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setOnYearChange(value: () => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction0(value))
  }
}
