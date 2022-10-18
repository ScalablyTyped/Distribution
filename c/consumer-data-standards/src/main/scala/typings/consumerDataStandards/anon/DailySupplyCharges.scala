package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.AEST
import typings.consumerDataStandards.consumerDataStandardsStrings.ENVIRONMENTAL
import typings.consumerDataStandards.consumerDataStandardsStrings.LOCAL
import typings.consumerDataStandards.consumerDataStandardsStrings.METERING
import typings.consumerDataStandards.consumerDataStandardsStrings.NETWORK
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.RCTI
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.RETAIL_SERVICE
import typings.consumerDataStandards.consumerDataStandardsStrings.demandCharges
import typings.consumerDataStandards.consumerDataStandardsStrings.singleRate
import typings.consumerDataStandards.consumerDataStandardsStrings.timeOfUseRates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DailySupplyCharges
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount of access charge for the tariff period, in dollars per day exclusive of GST.
    */
  var dailySupplyCharges: js.UndefOr[String] = js.undefined
  
  /**
    * Array of demand charges.  Required if rateBlockUType is demandCharges
    */
  var demandCharges: js.UndefOr[js.Array[ChargePeriod]] = js.undefined
  
  /**
    * The name of the tariff period
    */
  var displayName: String
  
  /**
    * The end date of the tariff period in a calendar year.  Formatted in mm-dd format
    */
  var endDate: String
  
  /**
    * Specifies the type of rate applicable to this tariff period
    */
  var rateBlockUType: singleRate | timeOfUseRates | demandCharges
  
  /**
    * Object representing a single rate.  Required if rateBlockUType is singleRate
    */
  var singleRate: js.UndefOr[GeneralUnitPrice] = js.undefined
  
  /**
    * The start date of the tariff period in a calendar year.  Formatted in mm-dd format
    */
  var startDate: String
  
  /**
    * Array of objects representing time of use rates.  Required if rateBlockUType is timeOfUseRates
    */
  var timeOfUseRates: js.UndefOr[js.Array[TimeOfUse]] = js.undefined
  
  /**
    * Specifies the charge specific time zone for calculation of the time of use thresholds. If absent, timezone value in EnergyPlanContract is assumed.
    */
  var timeZone: js.UndefOr[LOCAL | AEST] = js.undefined
  
  /**
    * Type of charge. Assumed to be other if absent
    */
  var `type`: js.UndefOr[ENVIRONMENTAL | REGULATED | NETWORK | METERING | RETAIL_SERVICE | RCTI | OTHER] = js.undefined
}
object DailySupplyCharges {
  
  inline def apply(
    displayName: String,
    endDate: String,
    rateBlockUType: singleRate | timeOfUseRates | demandCharges,
    startDate: String
  ): DailySupplyCharges = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], rateBlockUType = rateBlockUType.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailySupplyCharges]
  }
  
  extension [Self <: DailySupplyCharges](x: Self) {
    
    inline def setDailySupplyCharges(value: String): Self = StObject.set(x, "dailySupplyCharges", value.asInstanceOf[js.Any])
    
    inline def setDailySupplyChargesUndefined: Self = StObject.set(x, "dailySupplyCharges", js.undefined)
    
    inline def setDemandCharges(value: js.Array[ChargePeriod]): Self = StObject.set(x, "demandCharges", value.asInstanceOf[js.Any])
    
    inline def setDemandChargesUndefined: Self = StObject.set(x, "demandCharges", js.undefined)
    
    inline def setDemandChargesVarargs(value: ChargePeriod*): Self = StObject.set(x, "demandCharges", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setRateBlockUType(value: singleRate | timeOfUseRates | demandCharges): Self = StObject.set(x, "rateBlockUType", value.asInstanceOf[js.Any])
    
    inline def setSingleRate(value: GeneralUnitPrice): Self = StObject.set(x, "singleRate", value.asInstanceOf[js.Any])
    
    inline def setSingleRateUndefined: Self = StObject.set(x, "singleRate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTimeOfUseRates(value: js.Array[TimeOfUse]): Self = StObject.set(x, "timeOfUseRates", value.asInstanceOf[js.Any])
    
    inline def setTimeOfUseRatesUndefined: Self = StObject.set(x, "timeOfUseRates", js.undefined)
    
    inline def setTimeOfUseRatesVarargs(value: TimeOfUse*): Self = StObject.set(x, "timeOfUseRates", js.Array(value*))
    
    inline def setTimeZone(value: LOCAL | AEST): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setType(value: ENVIRONMENTAL | REGULATED | NETWORK | METERING | RETAIL_SERVICE | RCTI | OTHER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
