package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpectrumConfig extends js.Object {
  /**
    * Bandwidth of a spectral Config.
    */
  var bandwidth: FrequencyBandwidth = js.native
  /**
    * Center frequency of a spectral Config.
    */
  var centerFrequency: Frequency = js.native
  /**
    * Polarization of a spectral Config.
    */
  var polarization: js.UndefOr[Polarization] = js.native
}

object SpectrumConfig {
  @scala.inline
  def apply(bandwidth: FrequencyBandwidth, centerFrequency: Frequency, polarization: Polarization = null): SpectrumConfig = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], centerFrequency = centerFrequency.asInstanceOf[js.Any])
    if (polarization != null) __obj.updateDynamic("polarization")(polarization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpectrumConfig]
  }
}

