package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntennaUplinkConfig extends StObject {
  
  /**
    * Information about the uplink spectral Config.
    */
  var spectrumConfig: UplinkSpectrumConfig
  
  /**
    * EIRP of the target.
    */
  var targetEirp: Eirp
  
  /**
    * Whether or not uplink transmit is disabled.
    */
  var transmitDisabled: js.UndefOr[Boolean] = js.undefined
}
object AntennaUplinkConfig {
  
  @scala.inline
  def apply(spectrumConfig: UplinkSpectrumConfig, targetEirp: Eirp): AntennaUplinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any], targetEirp = targetEirp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaUplinkConfig]
  }
  
  @scala.inline
  implicit class AntennaUplinkConfigMutableBuilder[Self <: AntennaUplinkConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpectrumConfig(value: UplinkSpectrumConfig): Self = StObject.set(x, "spectrumConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEirp(value: Eirp): Self = StObject.set(x, "targetEirp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmitDisabled(value: Boolean): Self = StObject.set(x, "transmitDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmitDisabledUndefined: Self = StObject.set(x, "transmitDisabled", js.undefined)
  }
}
