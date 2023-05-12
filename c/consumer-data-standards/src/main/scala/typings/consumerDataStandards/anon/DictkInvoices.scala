package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkInvoices
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of invoices sorted by issue date in descending order
    */
  var invoices: js.Array[AccountCharges]
}
object DictkInvoices {
  
  inline def apply(invoices: js.Array[AccountCharges]): DictkInvoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkInvoices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkInvoices] (val x: Self) extends AnyVal {
    
    inline def setInvoices(value: js.Array[AccountCharges]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesVarargs(value: AccountCharges*): Self = StObject.set(x, "invoices", js.Array(value*))
  }
}
