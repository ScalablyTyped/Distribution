package typings.chrome.chromeNs.networkingNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.config")
@js.native
object ^ extends js.Object {
  var onCaptivePortalDetected: CaptivePorttalDetectedEvent = js.native
  def finishAuthentication(GUID: String, result: String): Unit = js.native
  def finishAuthentication(GUID: String, result: String, callback: js.Function0[Unit]): Unit = js.native
  def setNetworkFilter(networks: js.Array[NetworkInfo], callback: js.Function0[Unit]): Unit = js.native
}

