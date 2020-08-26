package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UplinkSpectrumConfig extends js.Object {
  /**
    * Center frequency of an uplink spectral Config. Valid values are between 2025 to 2120 MHz.
    */
  var centerFrequency: Frequency = js.native
  /**
    * Polarization of an uplink spectral Config. Capturing both "RIGHT_HAND" and "LEFT_HAND" polarization requires two separate configs.
    */
  var polarization: js.UndefOr[Polarization] = js.native
}

object UplinkSpectrumConfig {
  @scala.inline
  def apply(centerFrequency: Frequency): UplinkSpectrumConfig = {
    val __obj = js.Dynamic.literal(centerFrequency = centerFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[UplinkSpectrumConfig]
  }
  @scala.inline
  implicit class UplinkSpectrumConfigOps[Self <: UplinkSpectrumConfig] (val x: Self) extends AnyVal {
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
    def setCenterFrequency(value: Frequency): Self = this.set("centerFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolarization(value: Polarization): Self = this.set("polarization", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolarization: Self = this.set("polarization", js.undefined)
  }
  
}

