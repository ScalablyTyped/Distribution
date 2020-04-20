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
}

