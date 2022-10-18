package typings.consumerDataStandards.anon

import typings.consumerDataStandards.energyMod.EnergyInvoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invoices extends StObject {
  
  /**
    * Array of invoices sorted by issue date in descending order
    */
  var invoices: js.Array[EnergyInvoice]
}
object Invoices {
  
  inline def apply(invoices: js.Array[EnergyInvoice]): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
  
  extension [Self <: Invoices](x: Self) {
    
    inline def setInvoices(value: js.Array[EnergyInvoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesVarargs(value: EnergyInvoice*): Self = StObject.set(x, "invoices", js.Array(value*))
  }
}
