package typings.chrome.chrome.privacy

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var networkPredictionEnabled: ChromeSetting
  /** @since Chrome 42. */
  var webRTCMultipleRoutesEnabled: ChromeSetting
  /** @since Chrome 47. Warning: this is the current Dev channel. */
  var webRTCNonProxiedUdpEnabled: ChromeSetting
}

object Network {
  @scala.inline
  def apply(
    networkPredictionEnabled: ChromeSetting,
    webRTCMultipleRoutesEnabled: ChromeSetting,
    webRTCNonProxiedUdpEnabled: ChromeSetting
  ): Network = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled, webRTCMultipleRoutesEnabled = webRTCMultipleRoutesEnabled, webRTCNonProxiedUdpEnabled = webRTCNonProxiedUdpEnabled)
  
    __obj.asInstanceOf[Network]
  }
}

@JSGlobal("chrome.privacy.network")
@js.native
object network extends TopLevel[Network]

