package typings.chrome.chrome.privacy

import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  var networkPredictionEnabled: ChromeSetting = js.native
  /** @since Chrome 48. */
  var webRTCIPHandlingPolicy: ChromeSetting = js.native
  /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
  var webRTCMultipleRoutesEnabled: ChromeSetting = js.native
  /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
  var webRTCNonProxiedUdpEnabled: ChromeSetting = js.native
}

object Network {
  @scala.inline
  def apply(
    networkPredictionEnabled: ChromeSetting,
    webRTCIPHandlingPolicy: ChromeSetting,
    webRTCMultipleRoutesEnabled: ChromeSetting,
    webRTCNonProxiedUdpEnabled: ChromeSetting
  ): Network = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled.asInstanceOf[js.Any], webRTCIPHandlingPolicy = webRTCIPHandlingPolicy.asInstanceOf[js.Any], webRTCMultipleRoutesEnabled = webRTCMultipleRoutesEnabled.asInstanceOf[js.Any], webRTCNonProxiedUdpEnabled = webRTCNonProxiedUdpEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetworkPredictionEnabled(value: ChromeSetting): Self = this.set("networkPredictionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRTCIPHandlingPolicy(value: ChromeSetting): Self = this.set("webRTCIPHandlingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRTCMultipleRoutesEnabled(value: ChromeSetting): Self = this.set("webRTCMultipleRoutesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRTCNonProxiedUdpEnabled(value: ChromeSetting): Self = this.set("webRTCNonProxiedUdpEnabled", value.asInstanceOf[js.Any])
  }
  
}

