package typings.chromeApps.global.chrome.networking.onc

import typings.chromeApps.chrome.networking.onc.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.enableNetworkType")
@js.native
object enableNetworkType extends js.Object {
  
  /**
    * Enables any devices matching the specified network type.
    * Note, the type might represent multiple network types (e.g. 'Wireless').
    * @param networkType The type of network to enable.
    */
  def apply(networkType: NetworkType): Unit = js.native
}
