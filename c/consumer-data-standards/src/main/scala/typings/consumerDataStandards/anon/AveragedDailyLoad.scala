package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE_IMPORT
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.ALLDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.BASIC
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS
import typings.consumerDataStandards.consumerDataStandardsStrings.CONTROLLED
import typings.consumerDataStandards.consumerDataStandardsStrings.CUMULATIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.DEMAND
import typings.consumerDataStandards.consumerDataStandardsStrings.EVENING
import typings.consumerDataStandards.consumerDataStandardsStrings.INTERVAL
import typings.consumerDataStandards.consumerDataStandardsStrings.OFFPEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.PEAK
import typings.consumerDataStandards.consumerDataStandardsStrings.PROFILE_DATA
import typings.consumerDataStandards.consumerDataStandardsStrings.REACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REACTIVE_IMPORT
import typings.consumerDataStandards.consumerDataStandardsStrings.SHOULDER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AveragedDailyLoad
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The energy delivered through a connection point or metering point over an extended period normalised to a 'per day' basis (kWh). This value is calculated annually.
    */
  var averagedDailyLoad: js.UndefOr[Double] = js.undefined
  
  /**
    * Actual/Subtractive Indicator. Note the details of enumeration values below: <ul><li>**ACTUAL** implies volume of energy actually metered between two dates</li><li>**CUMULATIVE** indicates a meter reading for a specific date. A second Meter Reading is required to determine the consumption between those two Meter Reading dates</li></ul>
    */
  var consumptionType: js.UndefOr[ACTUAL | CUMULATIVE] = js.undefined
  
  /**
    * Indicates whether the energy recorded by this register is created under a Controlled Load regime
    */
  var controlledLoad: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Multiplier required to take a register value and turn it into a value representing billable energy
    */
  var multiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * The Network Tariff Code is a free text field containing a code supplied and published by the local network service provider
    */
  var networkTariffCode: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the consumption type of register
    */
  var registerConsumptionType: INTERVAL | BASIC | PROFILE_DATA | ACTIVE_IMPORT | ACTIVE | REACTIVE_IMPORT | REACTIVE
  
  /**
    * Unique identifier of the register within this service point.  Is not globally unique
    */
  var registerId: String
  
  /**
    * Register suffix of the meter register where the meter reads are obtained
    */
  var registerSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * Code to identify the time validity of register contents
    */
  var timeOfDay: js.UndefOr[
    ALLDAY | INTERVAL | PEAK | BUSINESS | SHOULDER | EVENING | OFFPEAK | CONTROLLED | DEMAND
  ] = js.undefined
  
  /**
    * The unit of measure for data held in this register
    */
  var unitOfMeasure: js.UndefOr[String] = js.undefined
}
object AveragedDailyLoad {
  
  inline def apply(
    registerConsumptionType: INTERVAL | BASIC | PROFILE_DATA | ACTIVE_IMPORT | ACTIVE | REACTIVE_IMPORT | REACTIVE,
    registerId: String
  ): AveragedDailyLoad = {
    val __obj = js.Dynamic.literal(registerConsumptionType = registerConsumptionType.asInstanceOf[js.Any], registerId = registerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AveragedDailyLoad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AveragedDailyLoad] (val x: Self) extends AnyVal {
    
    inline def setAveragedDailyLoad(value: Double): Self = StObject.set(x, "averagedDailyLoad", value.asInstanceOf[js.Any])
    
    inline def setAveragedDailyLoadUndefined: Self = StObject.set(x, "averagedDailyLoad", js.undefined)
    
    inline def setConsumptionType(value: ACTUAL | CUMULATIVE): Self = StObject.set(x, "consumptionType", value.asInstanceOf[js.Any])
    
    inline def setConsumptionTypeUndefined: Self = StObject.set(x, "consumptionType", js.undefined)
    
    inline def setControlledLoad(value: Boolean): Self = StObject.set(x, "controlledLoad", value.asInstanceOf[js.Any])
    
    inline def setControlledLoadUndefined: Self = StObject.set(x, "controlledLoad", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setNetworkTariffCode(value: String): Self = StObject.set(x, "networkTariffCode", value.asInstanceOf[js.Any])
    
    inline def setNetworkTariffCodeUndefined: Self = StObject.set(x, "networkTariffCode", js.undefined)
    
    inline def setRegisterConsumptionType(value: INTERVAL | BASIC | PROFILE_DATA | ACTIVE_IMPORT | ACTIVE | REACTIVE_IMPORT | REACTIVE): Self = StObject.set(x, "registerConsumptionType", value.asInstanceOf[js.Any])
    
    inline def setRegisterId(value: String): Self = StObject.set(x, "registerId", value.asInstanceOf[js.Any])
    
    inline def setRegisterSuffix(value: String): Self = StObject.set(x, "registerSuffix", value.asInstanceOf[js.Any])
    
    inline def setRegisterSuffixUndefined: Self = StObject.set(x, "registerSuffix", js.undefined)
    
    inline def setTimeOfDay(value: ALLDAY | INTERVAL | PEAK | BUSINESS | SHOULDER | EVENING | OFFPEAK | CONTROLLED | DEMAND): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    inline def setUnitOfMeasure(value: String): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
  }
}
