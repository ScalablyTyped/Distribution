package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntennaDownlinkConfig extends StObject {
  
  /**
    * Object that describes a spectral Config.
    */
  var spectrumConfig: SpectrumConfig
}
object AntennaDownlinkConfig {
  
  inline def apply(spectrumConfig: SpectrumConfig): AntennaDownlinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaDownlinkConfig]
  }
  
  extension [Self <: AntennaDownlinkConfig](x: Self) {
    
    inline def setSpectrumConfig(value: SpectrumConfig): Self = StObject.set(x, "spectrumConfig", value.asInstanceOf[js.Any])
  }
}
