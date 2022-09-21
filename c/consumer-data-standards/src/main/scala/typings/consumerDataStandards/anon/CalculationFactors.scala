package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ENVIRONMENTAL
import typings.consumerDataStandards.consumerDataStandardsStrings.METERING
import typings.consumerDataStandards.consumerDataStandardsStrings.NETWORK
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.RCTI
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.RETAIL_SERVICE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationFactors
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
    * Additional calculation factors that inform the transaction
    */
  var calculationFactors: js.UndefOr[js.Array[Type] | Null] = js.undefined
  
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
    * The ID of the service point to which this transaction applies if any
    */
  var servicePointId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional start date for the application of the charge
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of charge. Assumed to be other if absent
    */
  var `type`: js.UndefOr[
    ENVIRONMENTAL | REGULATED | NETWORK | METERING | RETAIL_SERVICE | RCTI | OTHER | Null
  ] = js.undefined
}
object CalculationFactors {
  
  inline def apply(amount: String, description: String): CalculationFactors = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculationFactors]
  }
  
  extension [Self <: CalculationFactors](x: Self) {
    
    inline def setAdjustments(value: js.Array[AmountDescription]): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsNull: Self = StObject.set(x, "adjustments", null)
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: AmountDescription*): Self = StObject.set(x, "adjustments", js.Array(value*))
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCalculationFactors(value: js.Array[Type]): Self = StObject.set(x, "calculationFactors", value.asInstanceOf[js.Any])
    
    inline def setCalculationFactorsNull: Self = StObject.set(x, "calculationFactors", null)
    
    inline def setCalculationFactorsUndefined: Self = StObject.set(x, "calculationFactors", js.undefined)
    
    inline def setCalculationFactorsVarargs(value: Type*): Self = StObject.set(x, "calculationFactors", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumberNull: Self = StObject.set(x, "invoiceNumber", null)
    
    inline def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
    
    inline def setServicePointIdNull: Self = StObject.set(x, "servicePointId", null)
    
    inline def setServicePointIdUndefined: Self = StObject.set(x, "servicePointId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setType(value: ENVIRONMENTAL | REGULATED | NETWORK | METERING | RETAIL_SERVICE | RCTI | OTHER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
