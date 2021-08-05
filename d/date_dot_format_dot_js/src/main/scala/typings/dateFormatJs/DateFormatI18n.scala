package typings.dateFormatJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Internationalization strings
trait DateFormatI18n extends StObject {
  
  var dayNames: js.Array[String]
  
  var monthNames: js.Array[String]
}
object DateFormatI18n {
  
  inline def apply(dayNames: js.Array[String], monthNames: js.Array[String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatI18n]
  }
  
  extension [Self <: DateFormatI18n](x: Self) {
    
    inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
    
    inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
    
    inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
  }
}
