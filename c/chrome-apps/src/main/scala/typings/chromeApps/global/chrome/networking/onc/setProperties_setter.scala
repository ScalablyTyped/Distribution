package typings.chromeApps.global.chrome.networking.onc

import typings.chromeApps.chrome.networking.onc.NetworkConfigProperties
import typings.chromeApps.chromeAppsStrings.setter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.setProperties")
@js.native
object setProperties_setter extends js.Object {
  
  /**
    * Sets the properties of the network with id *networkGuid*.
    * This is only valid for configured networks (Source != None).
    * Unconfigured visible networks should use **createNetwork** instead.
    * **In kiosk sessions, calling this method on a shared network will fail.**
    * @param networkGuid The GUID of the network to set properties for.
    * @param properties The properties to set.
    * @param [callback] Called when the operation has completed.
    */
  def apply(networkGuid: String, properties: NetworkConfigProperties[setter]): Unit = js.native
  def apply(networkGuid: String, properties: NetworkConfigProperties[setter], callback: js.Function0[Unit]): Unit = js.native
}
