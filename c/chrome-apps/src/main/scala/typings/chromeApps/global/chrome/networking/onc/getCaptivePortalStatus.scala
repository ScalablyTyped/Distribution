package typings.chromeApps.global.chrome.networking.onc

import typings.chromeApps.chrome.networking.onc.CaptivePortalStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.getCaptivePortalStatus")
@js.native
object getCaptivePortalStatus extends js.Object {
  
  /**
    * Returns captive portal status for the network matching 'networkGuid'.
    * @param networkGuid The GUID of the network to get captive portal status for.
    * @param callback A callback function that returns the results of the query for network captive portal status.
    */
  def apply(networkGuid: String, callback: js.Function1[/* result */ CaptivePortalStatus, Unit]): Unit = js.native
}
