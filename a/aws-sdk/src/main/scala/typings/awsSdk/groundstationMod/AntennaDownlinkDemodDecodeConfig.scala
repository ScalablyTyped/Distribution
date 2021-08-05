package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntennaDownlinkDemodDecodeConfig extends StObject {
  
  /**
    * Information about the decode Config.
    */
  var decodeConfig: DecodeConfig
  
  /**
    * Information about the demodulation Config.
    */
  var demodulationConfig: DemodulationConfig
  
  /**
    * Information about the spectral Config.
    */
  var spectrumConfig: SpectrumConfig
}
object AntennaDownlinkDemodDecodeConfig {
  
  inline def apply(decodeConfig: DecodeConfig, demodulationConfig: DemodulationConfig, spectrumConfig: SpectrumConfig): AntennaDownlinkDemodDecodeConfig = {
    val __obj = js.Dynamic.literal(decodeConfig = decodeConfig.asInstanceOf[js.Any], demodulationConfig = demodulationConfig.asInstanceOf[js.Any], spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
  }
  
  extension [Self <: AntennaDownlinkDemodDecodeConfig](x: Self) {
    
    inline def setDecodeConfig(value: DecodeConfig): Self = StObject.set(x, "decodeConfig", value.asInstanceOf[js.Any])
    
    inline def setDemodulationConfig(value: DemodulationConfig): Self = StObject.set(x, "demodulationConfig", value.asInstanceOf[js.Any])
    
    inline def setSpectrumConfig(value: SpectrumConfig): Self = StObject.set(x, "spectrumConfig", value.asInstanceOf[js.Any])
  }
}
