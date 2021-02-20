package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrequencyBandwidth extends StObject {
  
  /**
    * Frequency bandwidth units.
    */
  var units: BandwidthUnits = js.native
  
  /**
    * Frequency bandwidth value. AWS Ground Station currently has the following bandwidth limitations:   For AntennaDownlinkDemodDecodeconfig, valid values are between 125 kHz to 650 MHz.   For AntennaDownlinkconfig, valid values are between 10 kHz to 54 MHz.   For AntennaUplinkConfig, valid values are between 10 kHz to 54 MHz.  
    */
  var value: Double = js.native
}
object FrequencyBandwidth {
  
  @scala.inline
  def apply(units: BandwidthUnits, value: Double): FrequencyBandwidth = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrequencyBandwidth]
  }
  
  @scala.inline
  implicit class FrequencyBandwidthMutableBuilder[Self <: FrequencyBandwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnits(value: BandwidthUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
