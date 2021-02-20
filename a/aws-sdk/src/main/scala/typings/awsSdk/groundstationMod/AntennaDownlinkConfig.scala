package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntennaDownlinkConfig extends StObject {
  
  /**
    * Object that describes a spectral Config.
    */
  var spectrumConfig: SpectrumConfig = js.native
}
object AntennaDownlinkConfig {
  
  @scala.inline
  def apply(spectrumConfig: SpectrumConfig): AntennaDownlinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaDownlinkConfig]
  }
  
  @scala.inline
  implicit class AntennaDownlinkConfigMutableBuilder[Self <: AntennaDownlinkConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpectrumConfig(value: SpectrumConfig): Self = StObject.set(x, "spectrumConfig", value.asInstanceOf[js.Any])
  }
}
