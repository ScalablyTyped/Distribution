package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBillingOnceOffTransaction
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount of the charge or credit.  A positive value indicates a charge and a negative value indicates a credit
    */
  var amount: String
  
  /**
    * A free text description of the item
    */
  var description: String
  
  /**
    * The number of the invoice in which this transaction is included if it has been issued
    */
  var invoiceNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the service point to which this transaction applies if any
    */
  var servicePointId: js.UndefOr[String | Null] = js.undefined
}
object EnergyBillingOnceOffTransaction {
  
  inline def apply(amount: String, description: String): EnergyBillingOnceOffTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBillingOnceOffTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyBillingOnceOffTransaction] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumberNull: Self = StObject.set(x, "invoiceNumber", null)
    
    inline def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
    
    inline def setServicePointIdNull: Self = StObject.set(x, "servicePointId", null)
    
    inline def setServicePointIdUndefined: Self = StObject.set(x, "servicePointId", js.undefined)
  }
}
