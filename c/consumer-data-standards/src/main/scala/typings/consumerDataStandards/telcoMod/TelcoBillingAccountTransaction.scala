package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AmountDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBillingAccountTransaction
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional array of adjustments arising for this transaction
    */
  var adjustments: js.UndefOr[js.Array[AmountDescription] | Null] = js.undefined
  
  /**
    * The amount charged or credited for this transaction prior to any adjustments being applied.  A negative value indicates a credit
    */
  var amount: String
  
  /**
    * Optional description of the transaction that can be used for display purposes
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time when the usage period ends
    */
  var endDate: String
  
  /**
    * The number of the invoice in which this transaction is included if it has been issued
    */
  var invoiceNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Array list of services identifiers to which this transaction applies if any. E.g. a mobile [MSISDN](https://www.etsi.org/deliver/etsi_gts/03/0303/05.00.00_60/gsmts_0303v050000p.pdf), [FNN](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf) or internet service e.g [NBN AVC Service ID](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf). In accordance with [CDR ID permanence](#id-permanence) requirements
    */
  var serviceIds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time when the usage period starts
    */
  var startDate: String
}
object TelcoBillingAccountTransaction {
  
  inline def apply(amount: String, endDate: String, startDate: String): TelcoBillingAccountTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBillingAccountTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBillingAccountTransaction] (val x: Self) extends AnyVal {
    
    inline def setAdjustments(value: js.Array[AmountDescription]): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsNull: Self = StObject.set(x, "adjustments", null)
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: AmountDescription*): Self = StObject.set(x, "adjustments", js.Array(value*))
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumberNull: Self = StObject.set(x, "invoiceNumber", null)
    
    inline def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    inline def setServiceIds(value: String): Self = StObject.set(x, "serviceIds", value.asInstanceOf[js.Any])
    
    inline def setServiceIdsNull: Self = StObject.set(x, "serviceIds", null)
    
    inline def setServiceIdsUndefined: Self = StObject.set(x, "serviceIds", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
