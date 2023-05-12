package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AmountDescription
import typings.consumerDataStandards.consumerDataStandardsStrings.EQUIPMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.METERING
import typings.consumerDataStandards.consumerDataStandardsStrings.NETWORK
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.SERVICE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBillingOtherTransaction
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional array of adjustments arising for this transaction
    */
  var adjustments: js.UndefOr[js.Array[AmountDescription] | Null] = js.undefined
  
  /**
    * The amount of the charge
    */
  var amount: String
  
  /**
    * A free text description of the item
    */
  var description: String
  
  /**
    * Optional end date for the application of the charge
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of the invoice in which this transaction is included if it has been issued
    */
  var invoiceNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service identifier to which this transaction applies if any. E.g a mobile [MSISDN](https://www.etsi.org/deliver/etsi_gts/03/0303/05.00.00_60/gsmts_0303v050000p.pdf), [FNN](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf) or internet service e.g [NBN AVC Service ID](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf). In accordance with [CDR ID permanence](#id-permanence) requirements
    */
  var serviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional start date for the application of the charge
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of charge. Assumed to be OTHER if absent
    */
  var `type`: js.UndefOr[SERVICE | NETWORK | EQUIPMENT | METERING | OTHER | Null] = js.undefined
}
object TelcoBillingOtherTransaction {
  
  inline def apply(amount: String, description: String): TelcoBillingOtherTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBillingOtherTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBillingOtherTransaction] (val x: Self) extends AnyVal {
    
    inline def setAdjustments(value: js.Array[AmountDescription]): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsNull: Self = StObject.set(x, "adjustments", null)
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: AmountDescription*): Self = StObject.set(x, "adjustments", js.Array(value*))
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumberNull: Self = StObject.set(x, "invoiceNumber", null)
    
    inline def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setType(value: SERVICE | NETWORK | EQUIPMENT | METERING | OTHER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
