package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AmountDescription
import typings.consumerDataStandards.anon.Type
import typings.consumerDataStandards.consumerDataStandardsStrings.AGGREGATE
import typings.consumerDataStandards.consumerDataStandardsStrings.CONTROLLED_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.OFF_PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.OFF_PEAK_DEMAND_CHARGE
import typings.consumerDataStandards.consumerDataStandardsStrings.PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER1
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER2
import typings.consumerDataStandards.consumerDataStandardsStrings.SOLAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBillingDemandTransaction
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
    * Additional calculation factors that inform the transaction
    */
  var calculationFactors: js.UndefOr[js.Array[Type] | Null] = js.undefined
  
  /**
    * Optional description of the transaction that can be used for display purposes
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time when the demand period ends
    */
  var endDate: String
  
  /**
    * The number of the invoice in which this transaction is included if it has been issued
    */
  var invoiceNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag indicating if the usage is estimated or actual.  True indicates estimate.  False or absent indicates actual
    */
  var isEstimate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The rate for the demand charge in kVA.  A negative value indicates power generated
    */
  var rate: Double
  
  /**
    * The ID of the service point to which this transaction applies if any
    */
  var servicePointId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time when the demand period starts
    */
  var startDate: String
  
  /**
    * The time of use type that the transaction applies to
    */
  var timeOfUseType: PEAK | OFF_PEAK | OFF_PEAK_DEMAND_CHARGE | SHOULDER | SHOULDER1 | SHOULDER2 | CONTROLLED_LOAD | SOLAR | AGGREGATE
}
object EnergyBillingDemandTransaction {
  
  inline def apply(
    amount: String,
    endDate: String,
    rate: Double,
    startDate: String,
    timeOfUseType: PEAK | OFF_PEAK | OFF_PEAK_DEMAND_CHARGE | SHOULDER | SHOULDER1 | SHOULDER2 | CONTROLLED_LOAD | SOLAR | AGGREGATE
  ): EnergyBillingDemandTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeOfUseType = timeOfUseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBillingDemandTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyBillingDemandTransaction] (val x: Self) extends AnyVal {
    
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
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumberNull: Self = StObject.set(x, "invoiceNumber", null)
    
    inline def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    inline def setIsEstimate(value: Boolean): Self = StObject.set(x, "isEstimate", value.asInstanceOf[js.Any])
    
    inline def setIsEstimateNull: Self = StObject.set(x, "isEstimate", null)
    
    inline def setIsEstimateUndefined: Self = StObject.set(x, "isEstimate", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
    
    inline def setServicePointIdNull: Self = StObject.set(x, "servicePointId", null)
    
    inline def setServicePointIdUndefined: Self = StObject.set(x, "servicePointId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTimeOfUseType(
      value: PEAK | OFF_PEAK | OFF_PEAK_DEMAND_CHARGE | SHOULDER | SHOULDER1 | SHOULDER2 | CONTROLLED_LOAD | SOLAR | AGGREGATE
    ): Self = StObject.set(x, "timeOfUseType", value.asInstanceOf[js.Any])
  }
}
