package typings.cardValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseDateMod {
  
  @JSImport("card-validator/dist/lib/parse-date", "parseDate")
  @js.native
  def parseDate(datestring: String): MonthAndYear = js.native
  
  @js.native
  trait MonthAndYear extends StObject {
    
    var month: String = js.native
    
    var year: String = js.native
  }
  object MonthAndYear {
    
    @scala.inline
    def apply(month: String, year: String): MonthAndYear = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthAndYear]
    }
    
    @scala.inline
    implicit class MonthAndYearMutableBuilder[Self <: MonthAndYear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
