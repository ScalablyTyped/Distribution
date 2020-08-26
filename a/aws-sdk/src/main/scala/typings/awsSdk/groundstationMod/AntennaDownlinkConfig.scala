package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaDownlinkConfig extends js.Object {
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
  implicit class AntennaDownlinkConfigOps[Self <: AntennaDownlinkConfig] (val x: Self) extends AnyVal {
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
    def setSpectrumConfig(value: SpectrumConfig): Self = this.set("spectrumConfig", value.asInstanceOf[js.Any])
  }
  
}

