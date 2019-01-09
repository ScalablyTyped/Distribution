package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackFinishAuthentication extends js.Object {
  var onCaptivePortalDetected: chromeLib.chromeNs.networkingNs.configNs.CaptivePorttalDetectedEvent = js.native
  def finishAuthentication(GUID: java.lang.String, result: java.lang.String): scala.Unit = js.native
  def finishAuthentication(GUID: java.lang.String, result: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setNetworkFilter(
    networks: js.Array[chromeLib.chromeNs.networkingNs.configNs.NetworkInfo],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

