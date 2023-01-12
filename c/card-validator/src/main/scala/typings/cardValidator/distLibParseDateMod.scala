package typings.cardValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibParseDateMod {
  
  @JSImport("card-validator/dist/lib/parse-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDate(datestring: String): MonthAndYear = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(datestring.asInstanceOf[js.Any]).asInstanceOf[MonthAndYear]
  
  trait MonthAndYear extends StObject {
    
    var month: String
    
    var year: String
  }
  object MonthAndYear {
    
    inline def apply(month: String, year: String): MonthAndYear = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthAndYear]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonthAndYear] (val x: Self) extends AnyVal {
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
