package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invoices
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of invoices sorted by date in descending order
    */
  var invoices: js.Array[AccountCharges]
}
object Invoices {
  
  inline def apply(invoices: js.Array[AccountCharges]): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
  
  extension [Self <: Invoices](x: Self) {
    
    inline def setInvoices(value: js.Array[AccountCharges]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesVarargs(value: AccountCharges*): Self = StObject.set(x, "invoices", js.Array(value*))
  }
}
