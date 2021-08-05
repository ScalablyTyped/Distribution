package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrequencyBandwidth extends StObject {
  
  /**
    * Frequency bandwidth units.
    */
  var units: BandwidthUnits
  
  /**
    * Frequency bandwidth value. AWS Ground Station currently has the following bandwidth limitations:   For AntennaDownlinkDemodDecodeconfig, valid values are between 125 kHz to 650 MHz.   For AntennaDownlinkconfig, valid values are between 10 kHz to 54 MHz.   For AntennaUplinkConfig, valid values are between 10 kHz to 54 MHz.  
    */
  var value: Double
}
object FrequencyBandwidth {
  
  inline def apply(units: BandwidthUnits, value: Double): FrequencyBandwidth = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrequencyBandwidth]
  }
  
  extension [Self <: FrequencyBandwidth](x: Self) {
    
    inline def setUnits(value: BandwidthUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
