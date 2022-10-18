package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.singleRate
import typings.consumerDataStandards.consumerDataStandardsStrings.timeOfUseRates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A display name for the controlled load
    */
  var displayName: String
  
  /**
    * Optional end date of the application of the controlled load rate
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of controlloed load rate
    */
  var rateBlockUType: singleRate | timeOfUseRates
  
  /**
    * Object representing a single controlled load rate.  Required if rateBlockUType is singleRate
    */
  var singleRate: js.UndefOr[DailySupplyCharge] = js.undefined
  
  /**
    * Optional start date of the application of the controlled load rate
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * Array of objects representing time of use rates.  Required if rateBlockUType is timeOfUseRates
    */
  var timeOfUseRates: js.UndefOr[js.Array[Rates]] = js.undefined
}
object EndDate {
  
  inline def apply(displayName: String, rateBlockUType: singleRate | timeOfUseRates): EndDate = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], rateBlockUType = rateBlockUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
  
  extension [Self <: EndDate](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRateBlockUType(value: singleRate | timeOfUseRates): Self = StObject.set(x, "rateBlockUType", value.asInstanceOf[js.Any])
    
    inline def setSingleRate(value: DailySupplyCharge): Self = StObject.set(x, "singleRate", value.asInstanceOf[js.Any])
    
    inline def setSingleRateUndefined: Self = StObject.set(x, "singleRate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTimeOfUseRates(value: js.Array[Rates]): Self = StObject.set(x, "timeOfUseRates", value.asInstanceOf[js.Any])
    
    inline def setTimeOfUseRatesUndefined: Self = StObject.set(x, "timeOfUseRates", js.undefined)
    
    inline def setTimeOfUseRatesVarargs(value: Rates*): Self = StObject.set(x, "timeOfUseRates", js.Array(value*))
  }
}
