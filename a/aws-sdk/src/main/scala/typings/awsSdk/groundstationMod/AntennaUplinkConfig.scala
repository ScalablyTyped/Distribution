package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaUplinkConfig extends js.Object {
  /**
    * Information about the uplink spectral Config.
    */
  var spectrumConfig: UplinkSpectrumConfig = js.native
  /**
    * EIRP of the target.
    */
  var targetEirp: Eirp = js.native
  /**
    * Whether or not uplink transmit is disabled.
    */
  var transmitDisabled: js.UndefOr[Boolean] = js.native
}

object AntennaUplinkConfig {
  @scala.inline
  def apply(spectrumConfig: UplinkSpectrumConfig, targetEirp: Eirp): AntennaUplinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any], targetEirp = targetEirp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaUplinkConfig]
  }
  @scala.inline
  implicit class AntennaUplinkConfigOps[Self <: AntennaUplinkConfig] (val x: Self) extends AnyVal {
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
    def setSpectrumConfig(value: UplinkSpectrumConfig): Self = this.set("spectrumConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetEirp(value: Eirp): Self = this.set("targetEirp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransmitDisabled(value: Boolean): Self = this.set("transmitDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransmitDisabled: Self = this.set("transmitDisabled", js.undefined)
  }
  
}

