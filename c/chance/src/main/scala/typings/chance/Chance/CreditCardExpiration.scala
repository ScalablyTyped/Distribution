package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardExpiration extends StObject {
  
  var month: String
  
  var year: String
}
object CreditCardExpiration {
  
  inline def apply(month: String, year: String): CreditCardExpiration = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardExpiration]
  }
  
  extension [Self <: CreditCardExpiration](x: Self) {
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
