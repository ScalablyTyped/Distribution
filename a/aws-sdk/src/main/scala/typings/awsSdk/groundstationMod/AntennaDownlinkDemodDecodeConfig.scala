package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaDownlinkDemodDecodeConfig extends js.Object {
  /**
    * Information about the decode Config.
    */
  var decodeConfig: DecodeConfig = js.native
  /**
    * Information about the demodulation Config.
    */
  var demodulationConfig: DemodulationConfig = js.native
  /**
    * Information about the spectral Config.
    */
  var spectrumConfig: SpectrumConfig = js.native
}

object AntennaDownlinkDemodDecodeConfig {
  @scala.inline
  def apply(decodeConfig: DecodeConfig, demodulationConfig: DemodulationConfig, spectrumConfig: SpectrumConfig): AntennaDownlinkDemodDecodeConfig = {
    val __obj = js.Dynamic.literal(decodeConfig = decodeConfig.asInstanceOf[js.Any], demodulationConfig = demodulationConfig.asInstanceOf[js.Any], spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
  }
  @scala.inline
  implicit class AntennaDownlinkDemodDecodeConfigOps[Self <: AntennaDownlinkDemodDecodeConfig] (val x: Self) extends AnyVal {
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
    def setDecodeConfig(value: DecodeConfig): Self = this.set("decodeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setDemodulationConfig(value: DemodulationConfig): Self = this.set("demodulationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpectrumConfig(value: SpectrumConfig): Self = this.set("spectrumConfig", value.asInstanceOf[js.Any])
  }
  
}

