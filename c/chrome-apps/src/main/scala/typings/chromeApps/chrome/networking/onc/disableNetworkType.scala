package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.onc.disableNetworkType")
@js.native
object disableNetworkType extends js.Object {
  /**
    * Disables any devices matching the specified network type.
    * Note, the type might represent multiple network types (e.g. 'Wireless').
    * @param networkType The type of network to disable.
    */
  def apply(networkType: NetworkType): Unit = js.native
}

