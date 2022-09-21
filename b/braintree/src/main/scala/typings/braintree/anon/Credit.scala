package typings.braintree.anon

import typings.braintree.braintreeStrings.credit
import typings.braintree.braintreeStrings.debit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credit extends StObject {
  
  var Credit: credit
  
  var Debit: debit
}
object Credit {
  
  inline def apply(): Credit = {
    val __obj = js.Dynamic.literal(Credit = "credit", Debit = "debit")
    __obj.asInstanceOf[Credit]
  }
  
  extension [Self <: Credit](x: Self) {
    
    inline def setCredit(value: credit): Self = StObject.set(x, "Credit", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: debit): Self = StObject.set(x, "Debit", value.asInstanceOf[js.Any])
  }
}
