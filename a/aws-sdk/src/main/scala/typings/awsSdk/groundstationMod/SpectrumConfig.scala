package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpectrumConfig extends StObject {
  
  /**
    * Bandwidth of a spectral Config. AWS Ground Station currently has the following bandwidth limitations:   For AntennaDownlinkDemodDecodeconfig, valid values are between 125 kHz to 650 MHz.   For AntennaDownlinkconfig valid values are between 10 kHz to 54 MHz.   For AntennaUplinkConfig, valid values are between 10 kHz to 54 MHz.  
    */
  var bandwidth: FrequencyBandwidth
  
  /**
    * Center frequency of a spectral Config. Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120 MHz for uplink.
    */
  var centerFrequency: Frequency
  
  /**
    * Polarization of a spectral Config. Capturing both "RIGHT_HAND" and "LEFT_HAND" polarization requires two separate configs.
    */
  var polarization: js.UndefOr[Polarization] = js.undefined
}
object SpectrumConfig {
  
  inline def apply(bandwidth: FrequencyBandwidth, centerFrequency: Frequency): SpectrumConfig = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], centerFrequency = centerFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpectrumConfig]
  }
  
  extension [Self <: SpectrumConfig](x: Self) {
    
    inline def setBandwidth(value: FrequencyBandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setCenterFrequency(value: Frequency): Self = StObject.set(x, "centerFrequency", value.asInstanceOf[js.Any])
    
    inline def setPolarization(value: Polarization): Self = StObject.set(x, "polarization", value.asInstanceOf[js.Any])
    
    inline def setPolarizationUndefined: Self = StObject.set(x, "polarization", js.undefined)
  }
}
