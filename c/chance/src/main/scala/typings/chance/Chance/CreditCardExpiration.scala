package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditCardExpiration extends StObject {
  
  var month: String = js.native
  
  var year: String = js.native
}
object CreditCardExpiration {
  
  @scala.inline
  def apply(month: String, year: String): CreditCardExpiration = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardExpiration]
  }
  
  @scala.inline
  implicit class CreditCardExpirationMutableBuilder[Self <: CreditCardExpiration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
