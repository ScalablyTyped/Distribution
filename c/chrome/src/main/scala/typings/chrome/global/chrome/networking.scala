package typings.chrome.global.chrome

import typings.chrome.chrome.networking.config.CaptivePorttalDetectedEvent
import typings.chrome.chrome.networking.config.NetworkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networking {
  
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  object config {
    
    @JSGlobal("chrome.networking.config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.networking.config.finishAuthentication")
    @js.native
    def finishAuthentication(GUID: String, result: String): Unit = js.native
    @JSGlobal("chrome.networking.config.finishAuthentication")
    @js.native
    def finishAuthentication(GUID: String, result: String, callback: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("chrome.networking.config.onCaptivePortalDetected")
    @js.native
    def onCaptivePortalDetected: CaptivePorttalDetectedEvent = js.native
    @scala.inline
    def onCaptivePortalDetected_=(x: CaptivePorttalDetectedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCaptivePortalDetected")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.networking.config.setNetworkFilter")
    @js.native
    def setNetworkFilter(networks: js.Array[NetworkInfo], callback: js.Function0[Unit]): Unit = js.native
  }
}
