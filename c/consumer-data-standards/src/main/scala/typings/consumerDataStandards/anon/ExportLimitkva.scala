package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportLimitkva
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Maximum amount of power (kVA) that may be exported from a connection point to the grid, as monitored by a control / relay function. An absent value indicates no limit
    */
  var exportLimitkva: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rate of change of frequency trip point (Hz/s).
    */
  var frequencyRateOfChange: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Description of the form of inter-trip (e.g. 'from local substation').
    */
  var interTripScheme: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Trip voltage.
    */
  var neutralVoltageDisplacement: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Protective function limit in Hz.
    */
  var overFrequencyProtection: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trip delay time in seconds.
    */
  var overFrequencyProtectionDelay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Protective function limit in V.
    */
  var overVoltageProtection: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trip delay time in seconds.
    */
  var overVoltageProtectionDelay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sustained over voltage.
    */
  var sustainedOverVoltage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trip delay time in seconds.
    */
  var sustainedOverVoltageDelay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Protective function limit in Hz.
    */
  var underFrequencyProtection: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trip delay time in seconds.
    */
  var underFrequencyProtectionDelay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Protective function limit in V.
    */
  var underVoltageProtection: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trip delay time in seconds.
    */
  var underVoltageProtectionDelay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trip angle in degrees.
    */
  var voltageVectorShift: js.UndefOr[Double | Null] = js.undefined
}
object ExportLimitkva {
  
  inline def apply(): ExportLimitkva = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportLimitkva]
  }
  
  extension [Self <: ExportLimitkva](x: Self) {
    
    inline def setExportLimitkva(value: Double): Self = StObject.set(x, "exportLimitkva", value.asInstanceOf[js.Any])
    
    inline def setExportLimitkvaNull: Self = StObject.set(x, "exportLimitkva", null)
    
    inline def setExportLimitkvaUndefined: Self = StObject.set(x, "exportLimitkva", js.undefined)
    
    inline def setFrequencyRateOfChange(value: Double): Self = StObject.set(x, "frequencyRateOfChange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRateOfChangeNull: Self = StObject.set(x, "frequencyRateOfChange", null)
    
    inline def setFrequencyRateOfChangeUndefined: Self = StObject.set(x, "frequencyRateOfChange", js.undefined)
    
    inline def setInterTripScheme(value: String): Self = StObject.set(x, "interTripScheme", value.asInstanceOf[js.Any])
    
    inline def setInterTripSchemeNull: Self = StObject.set(x, "interTripScheme", null)
    
    inline def setInterTripSchemeUndefined: Self = StObject.set(x, "interTripScheme", js.undefined)
    
    inline def setNeutralVoltageDisplacement(value: Double): Self = StObject.set(x, "neutralVoltageDisplacement", value.asInstanceOf[js.Any])
    
    inline def setNeutralVoltageDisplacementNull: Self = StObject.set(x, "neutralVoltageDisplacement", null)
    
    inline def setNeutralVoltageDisplacementUndefined: Self = StObject.set(x, "neutralVoltageDisplacement", js.undefined)
    
    inline def setOverFrequencyProtection(value: Double): Self = StObject.set(x, "overFrequencyProtection", value.asInstanceOf[js.Any])
    
    inline def setOverFrequencyProtectionDelay(value: Double): Self = StObject.set(x, "overFrequencyProtectionDelay", value.asInstanceOf[js.Any])
    
    inline def setOverFrequencyProtectionDelayNull: Self = StObject.set(x, "overFrequencyProtectionDelay", null)
    
    inline def setOverFrequencyProtectionDelayUndefined: Self = StObject.set(x, "overFrequencyProtectionDelay", js.undefined)
    
    inline def setOverFrequencyProtectionNull: Self = StObject.set(x, "overFrequencyProtection", null)
    
    inline def setOverFrequencyProtectionUndefined: Self = StObject.set(x, "overFrequencyProtection", js.undefined)
    
    inline def setOverVoltageProtection(value: Double): Self = StObject.set(x, "overVoltageProtection", value.asInstanceOf[js.Any])
    
    inline def setOverVoltageProtectionDelay(value: Double): Self = StObject.set(x, "overVoltageProtectionDelay", value.asInstanceOf[js.Any])
    
    inline def setOverVoltageProtectionDelayNull: Self = StObject.set(x, "overVoltageProtectionDelay", null)
    
    inline def setOverVoltageProtectionDelayUndefined: Self = StObject.set(x, "overVoltageProtectionDelay", js.undefined)
    
    inline def setOverVoltageProtectionNull: Self = StObject.set(x, "overVoltageProtection", null)
    
    inline def setOverVoltageProtectionUndefined: Self = StObject.set(x, "overVoltageProtection", js.undefined)
    
    inline def setSustainedOverVoltage(value: Double): Self = StObject.set(x, "sustainedOverVoltage", value.asInstanceOf[js.Any])
    
    inline def setSustainedOverVoltageDelay(value: Double): Self = StObject.set(x, "sustainedOverVoltageDelay", value.asInstanceOf[js.Any])
    
    inline def setSustainedOverVoltageDelayNull: Self = StObject.set(x, "sustainedOverVoltageDelay", null)
    
    inline def setSustainedOverVoltageDelayUndefined: Self = StObject.set(x, "sustainedOverVoltageDelay", js.undefined)
    
    inline def setSustainedOverVoltageNull: Self = StObject.set(x, "sustainedOverVoltage", null)
    
    inline def setSustainedOverVoltageUndefined: Self = StObject.set(x, "sustainedOverVoltage", js.undefined)
    
    inline def setUnderFrequencyProtection(value: Double): Self = StObject.set(x, "underFrequencyProtection", value.asInstanceOf[js.Any])
    
    inline def setUnderFrequencyProtectionDelay(value: Double): Self = StObject.set(x, "underFrequencyProtectionDelay", value.asInstanceOf[js.Any])
    
    inline def setUnderFrequencyProtectionDelayNull: Self = StObject.set(x, "underFrequencyProtectionDelay", null)
    
    inline def setUnderFrequencyProtectionDelayUndefined: Self = StObject.set(x, "underFrequencyProtectionDelay", js.undefined)
    
    inline def setUnderFrequencyProtectionNull: Self = StObject.set(x, "underFrequencyProtection", null)
    
    inline def setUnderFrequencyProtectionUndefined: Self = StObject.set(x, "underFrequencyProtection", js.undefined)
    
    inline def setUnderVoltageProtection(value: Double): Self = StObject.set(x, "underVoltageProtection", value.asInstanceOf[js.Any])
    
    inline def setUnderVoltageProtectionDelay(value: Double): Self = StObject.set(x, "underVoltageProtectionDelay", value.asInstanceOf[js.Any])
    
    inline def setUnderVoltageProtectionDelayNull: Self = StObject.set(x, "underVoltageProtectionDelay", null)
    
    inline def setUnderVoltageProtectionDelayUndefined: Self = StObject.set(x, "underVoltageProtectionDelay", js.undefined)
    
    inline def setUnderVoltageProtectionNull: Self = StObject.set(x, "underVoltageProtection", null)
    
    inline def setUnderVoltageProtectionUndefined: Self = StObject.set(x, "underVoltageProtection", js.undefined)
    
    inline def setVoltageVectorShift(value: Double): Self = StObject.set(x, "voltageVectorShift", value.asInstanceOf[js.Any])
    
    inline def setVoltageVectorShiftNull: Self = StObject.set(x, "voltageVectorShift", null)
    
    inline def setVoltageVectorShiftUndefined: Self = StObject.set(x, "voltageVectorShift", js.undefined)
  }
}
