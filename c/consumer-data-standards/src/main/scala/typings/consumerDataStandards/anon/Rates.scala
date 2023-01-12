package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.OFF_PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER
import typings.consumerDataStandards.consumerDataStandardsStrings.SOLAR_SPONGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rates
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The daily supply charge (exclusive of GST) for this controlled load tier
    */
  var dailySupplyCharge: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the controlled load rate
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the controlled load rate
    */
  var displayName: String
  
  /**
    * Array of controlled load rates in order of usage volume
    */
  var rates: js.Array[MeasureUnit]
  
  /**
    * Array of times of use.
    */
  var timeOfUse: js.Array[Days]
  
  /**
    * The type of usage that the rate applies to
    */
  var `type`: PEAK | OFF_PEAK | SHOULDER | SOLAR_SPONGE
}
object Rates {
  
  inline def apply(
    displayName: String,
    rates: js.Array[MeasureUnit],
    timeOfUse: js.Array[Days],
    `type`: PEAK | OFF_PEAK | SHOULDER | SOLAR_SPONGE
  ): Rates = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any], timeOfUse = timeOfUse.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rates] (val x: Self) extends AnyVal {
    
    inline def setDailySupplyCharge(value: String): Self = StObject.set(x, "dailySupplyCharge", value.asInstanceOf[js.Any])
    
    inline def setDailySupplyChargeUndefined: Self = StObject.set(x, "dailySupplyCharge", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setRates(value: js.Array[MeasureUnit]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: MeasureUnit*): Self = StObject.set(x, "rates", js.Array(value*))
    
    inline def setTimeOfUse(value: js.Array[Days]): Self = StObject.set(x, "timeOfUse", value.asInstanceOf[js.Any])
    
    inline def setTimeOfUseVarargs(value: Days*): Self = StObject.set(x, "timeOfUse", js.Array(value*))
    
    inline def setType(value: PEAK | OFF_PEAK | SHOULDER | SOLAR_SPONGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
