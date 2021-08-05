package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  trait Locale extends StObject {
    
    var months: java.lang.String
    
    var weekdays: java.lang.String
  }
  object Locale {
    
    inline def apply(months: java.lang.String, weekdays: java.lang.String): Locale = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setMonths(value: java.lang.String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setWeekdays(value: java.lang.String): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    }
  }
}
