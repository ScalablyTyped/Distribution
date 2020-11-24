package typings.chrome.global.chrome

import typings.chrome.chrome.networking.config.CaptivePorttalDetectedEvent
import typings.chrome.chrome.networking.config.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking")
@js.native
object networking extends js.Object {
  
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  @js.native
  object config extends js.Object {
    
    def finishAuthentication(GUID: String, result: String): Unit = js.native
    def finishAuthentication(GUID: String, result: String, callback: js.Function0[Unit]): Unit = js.native
    
    var onCaptivePortalDetected: CaptivePorttalDetectedEvent = js.native
    
    def setNetworkFilter(networks: js.Array[NetworkInfo], callback: js.Function0[Unit]): Unit = js.native
  }
}
