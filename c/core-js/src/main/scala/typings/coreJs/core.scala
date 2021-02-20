package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @js.native
  trait Locale extends StObject {
    
    var months: java.lang.String = js.native
    
    var weekdays: java.lang.String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(months: java.lang.String, weekdays: java.lang.String): Locale = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonths(value: java.lang.String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdays(value: java.lang.String): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    }
  }
}
