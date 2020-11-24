package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpectrumConfig extends js.Object {
  
  /**
    * Bandwidth of a spectral Config. AWS Ground Station currently has the following bandwidth limitations:   For AntennaDownlinkDemodDecodeconfig, valid values are between 125 kHz to 650 MHz.   For AntennaDownlinkconfig valid values are between 10 kHz to 54 MHz.   For AntennaUplinkConfig, valid values are between 10 kHz to 54 MHz.  
    */
  var bandwidth: FrequencyBandwidth = js.native
  
  /**
    * Center frequency of a spectral Config. Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120 MHz for uplink.
    */
  var centerFrequency: Frequency = js.native
  
  /**
    * Polarization of a spectral Config. Capturing both "RIGHT_HAND" and "LEFT_HAND" polarization requires two separate configs.
    */
  var polarization: js.UndefOr[Polarization] = js.native
}
object SpectrumConfig {
  
  @scala.inline
  def apply(bandwidth: FrequencyBandwidth, centerFrequency: Frequency): SpectrumConfig = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], centerFrequency = centerFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpectrumConfig]
  }
  
  @scala.inline
  implicit class SpectrumConfigOps[Self <: SpectrumConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBandwidth(value: FrequencyBandwidth): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterFrequency(value: Frequency): Self = this.set("centerFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolarization(value: Polarization): Self = this.set("polarization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolarization: Self = this.set("polarization", js.undefined)
  }
}
