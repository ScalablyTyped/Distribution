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
}

object AntennaUplinkConfig {
  @scala.inline
  def apply(spectrumConfig: UplinkSpectrumConfig, targetEirp: Eirp): AntennaUplinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any], targetEirp = targetEirp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntennaUplinkConfig]
  }
}

