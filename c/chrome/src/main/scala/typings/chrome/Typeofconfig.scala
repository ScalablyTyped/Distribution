package typings.chrome

import typings.chrome.chrome.networking.config.CaptivePorttalDetectedEvent
import typings.chrome.chrome.networking.config.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofconfig extends js.Object {
  var onCaptivePortalDetected: CaptivePorttalDetectedEvent = js.native
  def finishAuthentication(GUID: String, result: String): Unit = js.native
  def finishAuthentication(GUID: String, result: String, callback: js.Function0[Unit]): Unit = js.native
  def setNetworkFilter(networks: js.Array[NetworkInfo], callback: js.Function0[Unit]): Unit = js.native
}

