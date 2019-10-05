package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

